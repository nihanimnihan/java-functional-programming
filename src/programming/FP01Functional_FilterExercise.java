package programming;

import java.util.List;

public class FP01Functional_FilterExercise {
    public static void main(String[] args) {

        List<String> devices = List.of("Television", "Laptop", "Phone", "Computer", "Tablet");

        printAll(devices);
        printContain(devices, "Laptop");
        printByMinLength(devices, 6);
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
}
