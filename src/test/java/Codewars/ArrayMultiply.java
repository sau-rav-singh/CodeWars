package Codewars;

import java.util.Arrays;

public class ArrayMultiply {

    public static void main(String[] args) {
        System.out.println(grow(new int[]{1, 4, 5}));
    }

    public static int grow(int[] x) {
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }

}
