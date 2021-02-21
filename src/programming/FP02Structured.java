package programming;

import java.util.List;

public class FP02Structured {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        int sum = addNumbers(numbers);
        System.out.println(sum);

    }

    private static int addNumbers(List<Integer> numbers) {

        int sum = 0;

        for (Integer number: numbers) {
            sum += number;
        }

        return sum;

    }
}
