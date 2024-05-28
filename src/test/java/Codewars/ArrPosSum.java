package Codewars;

import java.util.Arrays;

public class ArrPosSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -6};
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(i -> i > 0).sum();
    }
}
