package programming;

import java.util.List;

public class FP01Functional_FilterExercise2 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        printOddNumbersSquare(numbers);
    }

    private static void printOddNumbersSquare(List<Integer> numbers) {

        System.out.println("----- print all odd numbers square-----");
        numbers.stream().filter(number -> number % 2 == 1).map(number -> number * number * number).forEach(System.out::println);
    }
}
