package org.example;

import java.util.Arrays;

public class Average {

    public static void main(String[] args) {
        int[] arr ={30,40,35};
        System.out.println(betterThanAverage(arr,40));
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = Arrays.stream(classPoints).sum();
        int avg = sum / classPoints.length;
        return yourPoints > avg;
    }
}
