package thread.readwritelock;

import java.util.Comparator;
import java.util.List;

public class CompareTest {

    private final int EQUAL = 0;
    private final String ONE = "1";
    private final String TWO = "2";

    public void main(String[] args) {
        List<TestDTO> list = List.of(
                TestDTO.builder().total(100).score(40).V1(30).V2(40).V3(60).build(),
                TestDTO.builder().total(100).score(40).V1(30).V2(40).V3(50).build(),
                TestDTO.builder().total(80).score(40).V1(30).V2(40).V3(60).build()
        );

        list.sort(new CustomComparator(ONE));

    }

    public class CustomComparator implements Comparator<TestDTO> {
        String input;

        public CustomComparator(String input) {
            this.input = input;
        }

        @Override
        public int compare(TestDTO t1, TestDTO t2) {
            switch (input) {
                case "1" -> {
                    return t1.getTotal() - t2.getTotal();
                }
                case "2" -> {
                    return t1.getScore() - t2.getScore();
                }
                default -> {
                }
            }

            return commonCompare(t1, t2);
        }

        private int commonCompare(TestDTO t1, TestDTO t2) {
            var compareTot = Integer.compare(t1.getTotal(), t2.getTotal());
            if (compareTot != EQUAL)
                return compareTot;

            int compareV1 = Integer.compare(t1.getV1(), t2.getV1());
            if (compareV1 != EQUAL)
                return compareV1;

            int compareV2 = Integer.compare(t1.getV2(), t2.getV2());
            if (compareV2 != EQUAL)
                return compareV1;

            return Integer.compare(t1.getV3(), t2.getV3());
        }
    }
}
