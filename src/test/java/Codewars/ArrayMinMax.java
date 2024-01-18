package Codewars;

import java.util.Arrays;

public class ArrayMinMax {

    public static int minArray(int[] arr) {

        return Arrays.stream(arr).min().orElse(arr[0]);
    }

    public static int maxArray(int[] arr) {
        return Arrays.stream(arr).max().orElse(arr[0]);
    }

    public static int[] minMax(int[] arr) {
        int[] result=new int[2];
        result[0]=minArray(arr);
        result[1]=maxArray(arr);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1, 1})));
    }
}
