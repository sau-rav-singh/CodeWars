package MyPracticePrograms;


//WAP to count occurrence of each element in array
import java.util.HashMap;

public class ArrayElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 2, 3, 4, 2, 3};

        // Using HashMap to store element frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Counting element frequencies
        for (int element : arr) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Printing element frequencies
        for (int element : frequencyMap.keySet()) {
            System.out.println(element + ": " + frequencyMap.get(element));
        }
    }
}
