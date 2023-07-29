package thread.join_thread;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // 원본 이미지 파일 경로
    public static final String SOURCE_FILE = "C:/work/OOPStudy/design_pattern/design_pattern/src/main/resources/many-flowers.jpg";
    // 결과 이미지 파일이 저장될 경로
    public static final String DESTINATION_FILE = "./out/many-flowers.jpg";

    public static void main(String[] args) throws IOException {

        // 원본 이미지 불러오기
        BufferedImage originalImage = ImageIO.read(new File(SOURCE_FILE));
        // 결과 이미지를 위한 버퍼 생성. 원본 이미지와 같은 크기로 설정
        BufferedImage resultImage = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_RGB);

        // 시작 시간 측정
        long startTime = System.currentTimeMillis();
        // 원본 이미지를 새 색상으로 재색칠
        int numberOfThreads = 3;
        recolorMultithreaded(originalImage, resultImage, numberOfThreads);
        // 작업 종료 시간 측정
        long endTime = System.currentTimeMillis();

        // 작업 수행 시간 계산
        long duration = endTime - startTime;

        // 결과 이미지를 파일로 저장
        File outputFile = new File(DESTINATION_FILE);
        ImageIO.write(resultImage, "jpg", outputFile);

        // 작업 수행 시간 출력
        System.out.println(String.valueOf(duration));
    }

    // 다중 쓰레드를 사용하여 이미지를 재색칠하는 함수
    public static void recolorMultithreaded(BufferedImage originalImage, BufferedImage resultImage, int numberOfThreads) {
        List<Thread> threads = new ArrayList<>();
        int width = originalImage.getWidth();
        int height = originalImage.getHeight() / numberOfThreads;

        // 쓰레드 각각에 대해 이미지의 일부를 재색칠하도록 지정
        for(int i = 0; i < numberOfThreads ; i++) {
            final int threadMultiplier = i;

            Thread thread = new Thread(() -> {
                int xOrigin = 0 ;
                int yOrigin = height * threadMultiplier;

                recolorImage(originalImage, resultImage, xOrigin, yOrigin, width, height);
            });

            threads.add(thread);
        }

        // 모든 쓰레드를 시작
        for(Thread thread : threads) {
            thread.start();
        }

        // 모든 쓰레드가 완료될 때까지 기다림
        for(Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
            }
        }
    }

    // 단일 쓰레드를 사용하여 이미지를 재색칠하는 함수
    public static void recolorSingleThreaded(BufferedImage originalImage, BufferedImage resultImage) {
        recolorImage(originalImage, resultImage, 0, 0, originalImage.getWidth(), originalImage.getHeight());
    }

    // 특정 영역의 이미지를 재색칠하는 함수
    public static void recolorImage(BufferedImage originalImage, BufferedImage resultImage, int leftCorner, int topCorner,
                                    int width, int height) {
        for(int x = leftCorner ; x < leftCorner + width && x < originalImage.getWidth() ; x++) {
            for(int y = topCorner ; y < topCorner + height && y < originalImage.getHeight() ; y++) {
                // 각 픽셀을 재색칠
                recolorPixel(originalImage, resultImage, x , y);
            }
        }
    }

    // 특정 픽셀을 재색칠하는 함수
    public static void recolorPixel(BufferedImage originalImage, BufferedImage resultImage, int x, int y) {
        int rgb = originalImage.getRGB(x, y);

        // 픽셀의 빨강, 초록, 파랑 색상 값을 가져옴
        int red = getRed(rgb);
        int green = getGreen(rgb);
        int blue = getBlue(rgb);

        int newRed;
        int newGreen;
        int newBlue;

        // 픽셀이 회색 계열일 경우 색상을 변경
        if(isShadeOfGray(red, green, blue)) {
            newRed = Math.min(255, red + 10);
            newGreen = Math.max(0, green - 80);
            newBlue = Math.max(0, blue - 20);
        } else {
            newRed = red;
            newGreen = green;
            newBlue = blue;
        }
        // 새로운 RGB 값을 만들고 결과 이미지에 설정
        int newRGB = createRGBFromColors(newRed, newGreen, newBlue);
        setRGB(resultImage, x, y, newRGB);
    }

    // 새 RGB 값을 결과 이미지에 설정하는 함수
    public static void setRGB(BufferedImage image, int x, int y, int rgb) {
        image.getRaster().setDataElements(x, y, image.getColorModel().getDataElements(rgb, null));
    }

    // 주어진 RGB 값이 회색 계열인지 판단하는 함수
    // 회색조는 빨강, 초록, 파랑 채널의 값이 모두 비슷하거나 같을 때 나타납니다.
    public static boolean isShadeOfGray(int red, int green, int blue) {
        return Math.abs(red - green) < 30 && Math.abs(red - blue) < 30 && Math.abs( green - blue) < 30;
    }

    // 각 색상 값을 결합하여 새로운 RGB 값을 만드는 함수
    public static int createRGBFromColors(int red, int green, int blue) {
        int rgb = 0;

        rgb |= blue;
        rgb |= green << 8;
        rgb |= red << 16;

        rgb |= 0xFF000000; // 알파 채널 값 설정(투명도를 결정)

        return rgb;
    }

    // RGB 값에서 빨간색 채널 값을 추출하는 함수
    public static int getRed(int rgb) {
        return (rgb & 0x00FF0000) >> 16;
    }

    // RGB 값에서 초록색 채널 값을 추출하는 함수
    public static int getGreen(int rgb) {
        return (rgb & 0x0000FF00) >> 8;
    }

    // RGB 값에서 파란색 채널 값을 추출하는 함수
    public static int getBlue(int rgb) {
        return rgb & 0x000000FF;
    }
}