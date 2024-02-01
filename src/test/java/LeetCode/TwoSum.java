package LeetCode;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class TwoSum {
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), i};
            }
            complementMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    @Test
    public void test01(){
        assertEquals(twoSum(new int[]{2,7,11,15},9),new int[]{0,1});
    }
}
