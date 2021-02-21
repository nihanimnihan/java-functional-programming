package programming;

import java.util.List;

public class FP02Structured_Filter {

    public static void main(String[] args) {

        printAllEvenNumbers(List.of(1,2,3,4,5,6));

    }

    private static void printAllEvenNumbers(List<Integer> numbers) {
        for (Integer number: numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}