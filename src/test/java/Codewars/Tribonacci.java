package Codewars;

import java.util.Arrays;

public class Tribonacci {
//So, if we are to start our Tribonacci sequence with [1, 1, 1] as a starting input (AKA signature), we have this sequence:
//[1, 1 ,1, 3, 5, 9, 17, 31, ...]
//But what if we started with [0, 0, 1] as a signature? As starting with [0, 1] instead of [1, 1] basically shifts the common Fibonacci sequence by once place
    public static double[] tribonacci(double[] s, int n) {
        double[] tribonacciSequence = Arrays.copyOf(s, n);

        for (int i = 3; i < n; i++) {
            tribonacciSequence[i] = tribonacciSequence[i - 1] + tribonacciSequence[i - 2] + tribonacciSequence[i - 3];
            System.out.println("------------------");
        }

        return tribonacciSequence;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 9)));
    }
}
