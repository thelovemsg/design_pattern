package thread.vitual_thread;

public class VirtualThreadDemo {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Inside thread: " + Thread.currentThread());
    }
}
