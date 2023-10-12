package org.example;

import java.util.Arrays;

public class SmallestInteger {

    public static void main(String[] args) {
        int[] arr ={2,4,-5};
        System.out.println(findSmallestInt(arr));
    }
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}
