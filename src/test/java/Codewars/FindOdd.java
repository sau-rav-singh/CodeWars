package Codewars;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    //Given an array of integers, find the one that appears an odd number of times.
//[1,1,2] should return 2, because it occurs 1 time (which is odd).
    public static void main(String[] args) {
        int[] arr = {1, 3,4,1, 1};
        System.out.println(findIt(arr));
    }

    public static int findIt(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

//        return countMap.entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() % 2 != 0)
//                .map(Map.Entry::getKey)
//                .findFirst()
//                .orElseThrow(() -> new IllegalArgumentException("No number appears an odd number of times"));

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("No number appears an odd number of times");

    }
}
