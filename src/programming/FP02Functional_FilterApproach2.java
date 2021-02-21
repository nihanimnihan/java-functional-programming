package programming;

import java.util.List;

public class FP02Functional_FilterApproach2 {

    public static void main(String[] args) {

        printAllNumbers(List.of(1,2,3,4,5,6));
    }

    private static void print(Integer number) { System.out.println(number); }

    private static void printAllNumbers(List<Integer> numbers) {

        numbers.stream().filter(number -> number % 2 == 0).forEach(FP02Functional_FilterApproach2::print);
    }
}
