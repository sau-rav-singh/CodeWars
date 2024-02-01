package Codewars;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class SortArray {

    public static int[] sortArray(int[] array) {
//You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

        List<Integer> oddList = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 1) {
                oddList.add(num);
            }
        }

        Collections.sort(oddList);

        int[] resultArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                resultArray[i] = array[i];
            } else {
                resultArray[i] = oddList.get(count);
                count++;
            }
        }


        return resultArray;
    }

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, SortArray.sortArray(new int[]{5, 3, 2, 8, 1, 4}));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{1, 3, 5, 8, 0}, SortArray.sortArray(new int[]{5, 3, 1, 8, 0}));
    }

}
