package programming;

import java.util.List;

public class FP01FunctionalApproach2 {

    public static void main(String[] args) {

        printAllNumbers(List.of(1,2,3,4,5,6));
    }

    private static void printAllNumbers(List<Integer> numbers) {
        numbers.forEach(System.out::println);
    }
}
