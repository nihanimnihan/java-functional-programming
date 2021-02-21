package programming;

import java.util.List;

class FP01Functional {

    public static void main(String[] args) {

        printAllNumbersApproach1(List.of(1,2,3,4,5,6));
        printAllNumbersApproach2(List.of(1,2,3,4,5,6));

        printEventNumbersApproach1(List.of(1,2,3,4,5,6));
        printEventNumbersApproach2(List.of(1,2,3,4,5,6));
    }

    private static void printAllNumbersApproach1(List<Integer> numbers) {
        numbers.forEach(FP01Functional::print);
    }

    private static void printAllNumbersApproach2(List<Integer> numbers) {
        numbers.forEach(System.out::println);
    }

    private static void printEventNumbersApproach1(List<Integer> numbers) {

        numbers.stream().filter(FP01Functional::isEven).forEach(FP01Functional::print);
    }

    private static void printEventNumbersApproach2(List<Integer> numbers) {

        numbers.stream().filter(number -> number % 2 == 0).forEach(FP01Functional::print);
    }

    private static boolean isEven(Integer number) { return number % 2 == 0; }

    private static void print(Integer number) {
        System.out.println(number);
    }

}
