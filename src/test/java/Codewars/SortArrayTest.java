package Codewars;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class SortArrayTest {

    //You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

    public static int[] sortArray(int[] array) {

        List<Integer> oddSortedList = Arrays.stream(array).filter(i -> i % 2 == 1).boxed().sorted().toList();
        AtomicInteger count = new AtomicInteger();
        return Arrays.stream(array).mapToObj(j -> j % 2 == 0 ? j : oddSortedList.get(count.getAndIncrement()))
                .mapToInt(i->i)
                .toArray();
    }

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, SortArrayTest.sortArray(new int[]{5, 3, 2, 8, 1, 4}));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{1, 3, 5, 8, 0}, SortArrayTest.sortArray(new int[]{5, 3, 1, 8, 0}));
    }
}
