package CodewarsSimple;

import java.util.Arrays;

public class ArrayMinMax {

    //Write a function that returns both the minimum and maximum number of the given list/array.

    public static int minArray(int[] arr) {
        return Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
    }

    public static int maxArray(int[] arr) {
        return Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
    }

    public static int[] minMax(int[] arr) {
        int[] result = new int[2];
        result[1] = maxArray(arr);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1, 1})));
    }
}
