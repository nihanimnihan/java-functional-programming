package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02FunctionalExercise {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        sumOfSquare(numbers);
        sumOfCube(numbers);
        sumOdd(numbers);
        sumEven(numbers);

        List<Integer> numbers2 = List.of(1,2,3,4,5,6,4,3,5,5);
        printDistinct(numbers2);
        printSorted(numbers2);

        List<String> devices = List.of("Television", "Laptop", "Phone", "Computer", "Tablet");
        printSortedDevices(devices);

        comparatorNaturalOrderDevices(devices);
        comparatorReverseOrderDevices(devices);
        comparatorLengthDevices(devices);

        /* collector */
        doubleList(numbers);
        evenList(numbers);
        sizeList(devices);

    }

    private static void sumOfSquare(List<Integer> numbers) {

        int sumOfSquare = numbers.stream().map(number -> number * number).reduce(0, Integer::sum);
        System.out.println("----- sumOfSquare ------ " + sumOfSquare);
    }

    private static void sumOfCube(List<Integer> numbers) {

        int sumOfSquare = numbers.stream().map(number -> number * number * number).reduce(0, Integer::sum);
        System.out.println("----- sumOfCube ------ " + sumOfSquare);
    }

    private static void sumOdd(List<Integer> numbers) {

        int sumOfSquare = numbers.stream().filter(number -> number % 2 == 1).reduce(0, Integer::sum);
        System.out.println("----- sumOdds ------ " + sumOfSquare);
    }

    private static void sumEven(List<Integer> numbers) {

        int sumOfSquare = numbers.stream().filter(number -> number % 2 == 0).reduce(0, Integer::sum);
        System.out.println("----- sumEven ------ " + sumOfSquare);
    }

    private static void printDistinct(List<Integer> numbers) {

        System.out.println("----- printDistinct ------ ");
        numbers.stream().distinct().forEach(System.out::println);
    }

    private static void printSorted(List<Integer> numbers) {

        System.out.println("----- printSorted ------ ");
        numbers.stream().sorted().forEach(System.out::println);
    }

    private static void printSortedDevices(List<String> devices) {

        System.out.println("----- printSorted ------ ");
        devices.stream().sorted().forEach(System.out::println);
    }

    private static void comparatorNaturalOrderDevices(List<String> devices) {
        System.out.println("----- comparatorOrderDevices ------ ");
        devices.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

    private static void comparatorReverseOrderDevices(List<String> devices) {
        System.out.println("----- comparatorReverseOrderDevices ------ ");
        devices.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private static void comparatorLengthDevices(List<String> devices) {
        System.out.println("----- comparatorLengthDevices ------ ");
        devices.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }

    private static void doubleList(List<Integer> numbers) {
        System.out.println("----- doubleList ------ ");
        List<Integer> collected = numbers.stream().map(number -> number * number).collect(Collectors.toList());
        System.out.println(collected);
    }

    private static void evenList(List<Integer> numbers) {
        System.out.println("----- evenList ------ ");
        List<Integer> collected = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(collected);
    }

    private static void sizeList(List<String> devices) {
        System.out.println("----- sizeList ------ ");
        List<Integer> collected = devices.stream().map(String::length).collect(Collectors.toList());
        System.out.println(collected);
    }
}
