package programming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {

        printAllNumbers(List.of(1,2,3,4,5,6));

        printAllEvenNumbers(List.of(1,2,3,4,5,6));

    }

    private static void printAllNumbers(List<Integer> numbers) {

        for (Integer number: numbers) {
            System.out.println(number);
        }
    }

    private static void printAllEvenNumbers(List<Integer> numbers) {
        for (Integer number: numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
