package functionalinterface;

import java.util.Random;

public class CalculatorMain {

    public static void main(String[] args) {

        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x * y + randomNumber;
        };

        System.out.println(calculator.calculate(1, 3));

    }
}
