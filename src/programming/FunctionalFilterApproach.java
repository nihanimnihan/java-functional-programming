package programming;

import java.util.List;

public class FunctionalFilterApproach {

    public static void main(String[] args) {
        printEventNumbersApproach1(List.of(1,2,3,4,5,6));
        printEventNumbersApproach2(List.of(1,2,3,4,5,6));
    }

    private static void printEventNumbersApproach1(List<Integer> integers) {
        integers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }

    private static void printEventNumbersApproach2(List<Integer> integers) {
        integers.stream().filter(FunctionalFilterApproach::isEvent).forEach(System.out::println);
    }

    private static boolean isEvent(Integer number) {
        return number % 2 == 0;
    }

}
