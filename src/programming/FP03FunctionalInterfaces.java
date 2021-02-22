package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;
        Function<Integer, Integer> squareFunction = number -> number * number;
        Consumer<Integer> sysOutConsumer = System.out::println;

        numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(sysOutConsumer);

    }
}
