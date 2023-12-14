package Codewars;

import java.util.Arrays;

public class Tribonacci {

    public static double[] tribonacci(double[] s, int n) {
        double[] tribonacciSequence = Arrays.copyOf(s, n);

        for (int i = 3; i < n; i++) {
            tribonacciSequence[i] = tribonacciSequence[i - 1] + tribonacciSequence[i - 2] + tribonacciSequence[i - 3];
            System.out.println("------------------");
        }

        return tribonacciSequence;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 9))); // Output: [1.0, 1.0, 1.0, 3.0, 5.0, 9.0, 17.0, 31.0, 57.0]
    }
}
