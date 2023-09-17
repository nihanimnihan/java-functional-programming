package programming;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FPFunctionalInterfaces {

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

        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };

        Supplier<Integer> randomIntegerSupplier2 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random = new Random();
                return random.nextInt(1000);
            }
        };

        BiPredicate<Integer, String> biPredicate = (number, str) -> {
            return number < 10 && str.length() > 5;
        };

        BiFunction<Integer, String, String> biFunction = (number, str) -> {
            return number + " " + str;
        };

        BiConsumer<String, String> biConsumer = (s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };


    }
}
