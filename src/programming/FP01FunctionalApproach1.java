package programming;

import java.util.List;

class FP01FunctionalApproach1 {

    public static void main(String[] args) {

        printAllNumbers(List.of(1,2,3,4,5,6));
    }

    private static void print(Integer number) {
        System.out.println(number);
    }

    private static void printAllNumbers(List<Integer> numbers) {
        numbers.forEach(FP01FunctionalApproach1::print);
    }
}
