package Codewars;

import java.util.Arrays;

public class DoubleEveryOther {

    public static void main(String[] args) {
        int[] result = doubleEveryOther(new int[]{1, 2, 4, 5});
        for (int j : result) {
            System.out.println(j);
        }
    }

    public static int[] doubleEveryOther(int[] a) {
        int[] result = Arrays.copyOf(a, a.length);
        for (int i = 1; i < result.length; i += 2) {
            result[i] *= 2;
        }
        return result;
    }

}
