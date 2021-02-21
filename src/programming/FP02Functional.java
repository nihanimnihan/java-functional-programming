package programming;

import java.util.List;

public class FP02Functional {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        int sum = addNumbersApproach1(numbers);
        int sum2 = addNumbersApproach2(numbers);
        int sum3 = addNumbersApproach3(numbers);
        System.out.println("addNumbersApproach1: " + sum);
        System.out.println("addNumbersApproach2: " + sum2);
        System.out.println("addNumbersApproach3: " + sum3);
    }

    private static int sum(Integer a, Integer b) {
        System.out.println( "a " + a + " b " + b);
        return a + b;
    }

    private static int addNumbersApproach1(List<Integer> numbers) {

        return numbers.stream().reduce(0, FP02Functional::sum);
    }

    private static int addNumbersApproach2(List<Integer> numbers) {

        return numbers.stream().reduce(0, (x,y) -> x + y);
    }

    private static int addNumbersApproach3(List<Integer> numbers) {

        return numbers.stream().reduce(0, Integer::sum);
    }
}
