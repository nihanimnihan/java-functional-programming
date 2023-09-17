package programming;

import java.util.List;

public class FunctionalReduceApproach {

    public static void main(String[] args) {
        System.out.println(printReduceSumApproach1(List.of(1,2,3,4,5,6)));
        System.out.println(printReduceSumApproach2(List.of(1,2,3,4,5,6)));
    }

    private static int printReduceSumApproach1(List<Integer> numbers) {
        return numbers.stream().reduce(0, (x, y) -> x + y);
    }

    private static int printReduceSumApproach2(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

    private static int printReduceSumApproach3(List<Integer> numbers) {
        return numbers.stream().reduce(0, FunctionalReduceApproach::sum);
    }

    private static int sum(int x, int y) {
        return x + y;
    }

}
