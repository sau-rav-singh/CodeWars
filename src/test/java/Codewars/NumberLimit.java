package Codewars;

import java.util.*;

public class NumberLimit {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int element : elements) {
            int count = countMap.getOrDefault(element, 0);

            if (count < maxOccurrences) {
                result.add(element);
                countMap.put(element, count + 1);
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] elements1 = {1, 2, 3, 1, 2, 1, 2, 3};
        int maxOccurrences1 = 2;

        int[] result1 = deleteNth(elements1, maxOccurrences1);
        System.out.println("Result 1: " + Arrays.toString(result1));

        int[] elements2 = {20, 37, 20, 21};
        int maxOccurrences2 = 1;

        int[] result2 = deleteNth(elements2, maxOccurrences2);
        System.out.println("Result 2: " + Arrays.toString(result2));
    }
}
