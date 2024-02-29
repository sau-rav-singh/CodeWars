package CodewarsSimple;

import java.util.Arrays;

public class CountPosSumNeg {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] result = countPosSumNeg(inputArray);

        System.out.println("Number of positive integers: " + result[0]);
        System.out.println("Sum of negative integers: " + result[1]);

    }

    public static int[] countPosSumNeg(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }

        long posCount = Arrays.stream(input).filter(n -> n > 0).count();
        int sumNeg = Arrays.stream(input).filter(n -> n < 0).sum();

        return new int[]{(int) posCount, sumNeg};
    }
}
