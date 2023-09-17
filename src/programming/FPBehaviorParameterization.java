package programming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FPBehaviorParameterization {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        filterAndPrint(numbers, x -> x % 2 == 0);
        filterAndPrint(numbers, x -> x % 2 != 0);

        mappingAndPrint(numbers, x -> x * x);
        mappingAndPrint(numbers, x -> x * x * x);

        mappingAndCreateNewList(numbers, x -> x * x);
        mappingAndCreateNewList(numbers, x -> x * x * x);
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream().filter(predicate).forEach(System.out::println);
    }
    private static void mappingAndPrint(List<Integer> numbers, Function<Integer, Integer> function) {
        numbers.stream().map(function).forEach(System.out::println);
    }

    private static List<Integer> mappingAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> function) {
        return numbers.stream().map(function).collect(Collectors.toList());
    }
}
