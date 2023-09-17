package programming;

import java.util.List;

public class FunctionalMapApproach {

    public static void main(String[] args) {
        printMapPut2Approach1(List.of(1,2,3,4,5,6));
        printMapPut2Approach2(List.of(1,2,3,4,5,6));
    }

    private static void printMapPut2Approach1(List<Integer> integers) {
        integers.stream().map(item -> item * 2).forEach(System.out::println);
    }

    private static void printMapPut2Approach2(List<Integer> integers) {
        integers.stream().map(FunctionalMapApproach::put2).forEach(System.out::println);
    }

    private static int put2(Integer number) {
        return number + 2;
    }

}
