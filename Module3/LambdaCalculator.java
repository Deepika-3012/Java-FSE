@FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}

public class LambdaCalculator {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operation(5, 3));
        System.out.println("Multiplication: " + multiply.operation(5, 3));
    }
}

