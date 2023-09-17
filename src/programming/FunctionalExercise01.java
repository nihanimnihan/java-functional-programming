package programming;

import java.util.List;

public class FunctionalExercise01 {
    public static void main(String[] args) {

        List<String> devices = List.of("Television", "Laptop", "Phone", "Computer", "Tablet");

        printAll(devices);
        printContain(devices, "Laptop");
        printByMinLength(devices, 6);
        printLength(devices);

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        printOddNumbersSquare(numbers);
        printOddNumbersCube(numbers);
    }

    private static void printAll(List<String> devices) {

        System.out.println("----- printAll -----");
        devices.forEach(System.out::println);
    }

    private static void printContain(List<String> devices, String contain) {

        System.out.println("----- printContain -----");
        devices.stream().filter(device -> device.contains(contain)).forEach(System.out::println);
    }

    private static void printByMinLength(List<String> devices, int length) {

        System.out.println("----- printByMinLength -----");
        devices.stream().filter(device -> device.length() >= length).forEach(System.out::println);
    }

    private static void printLength(List<String> devices) {

        System.out.println("----- printLength -----");
        devices.stream().map(device -> device + " " + device.length()).forEach(System.out::println);
    }

    private static void printOddNumbersSquare(List<Integer> numbers) {

        System.out.println("----- print all odd numbers square-----");
        numbers.stream().filter(number -> number % 2 == 1).map(number -> number * number).forEach(System.out::println);
    }

    private static void printOddNumbersCube(List<Integer> numbers) {

        System.out.println("----- print all odd numbers square-----");
        numbers.stream().filter(number -> number % 2 == 1).map(number -> number * number * number).forEach(System.out::println);
    }
}
