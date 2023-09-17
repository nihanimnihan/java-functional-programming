package programming;

import java.util.List;

public class FunctionalForeachApproach {

    public static void main(String[] args) {
        printAllNumbersApproach1(List.of(1, 2, 3, 4, 5));
        printAllNumbersApproach2(List.of(1, 2, 3, 4, 5));
    }

    private static void printAllNumbersApproach1(List<Integer> integers) {
        integers.forEach(System.out::println);
    }

    private static void printAllNumbersApproach2(List<Integer> integers) {
        integers.forEach(FunctionalForeachApproach::print);
    }

    private static void print(Integer number) {
        System.out.println(number);
    }

}
