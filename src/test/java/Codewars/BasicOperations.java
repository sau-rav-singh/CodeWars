package Codewars;

public class BasicOperations {

    public static void main(String[] args) {

    }

    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> {
                if (v2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                yield v1 / v2;
            }
            default -> throw new IllegalArgumentException("Invalid operation: " + op);
        };
    }

}
