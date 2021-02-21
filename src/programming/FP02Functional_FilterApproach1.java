package programming;

import java.util.List;

public class FP02Functional_FilterApproach1 {

    public static void main(String[] args) {

        printAllNumbers(List.of(1,2,3,4,5,6));
    }

    private static void print(Integer number) { System.out.println(number); }

    private static boolean isEven(Integer number) { return number % 2 == 0; }

    private static void printAllNumbers(List<Integer> numbers) {

        numbers.stream().filter(FP02Functional_FilterApproach1::isEven).forEach(FP02Functional_FilterApproach1::print);
    }
}
