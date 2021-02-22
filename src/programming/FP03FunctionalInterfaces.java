package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;

        Predicate<Integer> isEventPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        Function<Integer, Integer> squareFunction = number -> number * number;

        Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        };

        Consumer<Integer> sysOutConsumer = System.out::println;

        Consumer<Integer> sysOutConsumer2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(sysOutConsumer);

        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;

        BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };

        int sum = numbers.stream().reduce(0, sumBinaryOperator);


    }
}
