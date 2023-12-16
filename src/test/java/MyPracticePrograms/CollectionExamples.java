package MyPracticePrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Collections;

public class CollectionExamples {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10, 20, 30));

        // Using forEach to print elements
        System.out.println("Using forEach:");
        al.forEach(System.out::println);

        // Using a for-each loop to print elements
        System.out.println("\nUsing for-each loop:");
        al.forEach(System.out::println);

        // Using an iterator to print elements
        System.out.println("\nUsing Iterator:");
        al.iterator().forEachRemaining(System.out::println);

        // HashSet example
        HashSet<String> hashset = new HashSet<>(Arrays.asList("Pear", "Apple", "Orange", "Papaya", "Banana"));

        // Using iterator to print elements
        System.out.println("\nHashSet contains:");
        hashset.forEach(System.out::println);

        // Check if ArrayList contains 7
        System.out.println("\nCheck if ArrayList contains 7:");
        System.out.println(al.contains(7) ? "7 was found in the list" : "7 was not found in the list");

        // Convert ArrayList to array
        Integer[] arr = al.toArray(new Integer[0]);

        // Print array elements
        System.out.println("\nArray elements:");
        Arrays.asList(arr).forEach(System.out::println);

        // Create a new ArrayList from array
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(arr));

        // Print an element from the new ArrayList
        System.out.println("\nElement at index 2 in the new ArrayList: " + al2.get(2));

        // HashMap example
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("1", "Value1");
        hashmap.put("2", "Value2");
        hashmap.put("3", "Value3");
        hashmap.put("4", "Value4");
        hashmap.put("5", "Value5");

        // Check if HashMap is empty
        System.out.println("\nIs HashMap empty? " + hashmap.isEmpty());

        // TreeMap example
        TreeMap<String, String> tm = new TreeMap<>(hashmap);

        // Print TreeMap key-value pairs
        System.out.println("\nTreeMap key-value pairs:");
        tm.forEach((k, v) -> System.out.println(k + ":" + v));

        // Sorting ArrayList in reverse order
        al.sort(Collections.reverseOrder());

        // Remove element 10 from ArrayList
        al.remove(Integer.valueOf(10));
    }
}
