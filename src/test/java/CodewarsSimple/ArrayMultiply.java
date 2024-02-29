package CodewarsSimple;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayMultiply {

    //Write a function that returns product of all array elements
    
    public static void main(String[] args) {
        System.out.println(grow(new int[]{1, 4, 5}));
    }

    public static int grow(int[] x) {
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }

    int[] array = {1, 2, 3, 4, 5};

    // Convert the array to an ArrayList using Arrays.asList() and stream
    List<Integer> arrayList = Arrays.stream(array).boxed() // Convert int to Integer
            .collect(Collectors.toList());


}
