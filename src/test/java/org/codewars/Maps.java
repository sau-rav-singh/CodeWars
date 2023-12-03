package org.codewars;

import java.util.Arrays;

public class Maps {
    public static void main(String[] args) {

        for(int i : map(new int[]{2, 3, 4})){
            System.out.print(i+" ");
        }
    }
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x*2).toArray();
    }
}
