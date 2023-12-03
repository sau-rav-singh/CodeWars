package FuntionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class FP02Functional {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //  int sum=numbers.stream().mapToInt(Integer::intValue).sum();
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum is " + sum);
        numbers.stream().reduce(Integer::max).ifPresent(max -> System.out.println("max is " + max));
        numbers.stream().map(n->n*n).reduce(Integer::sum).ifPresent(s-> System.out.println("Sum of Squares is "+s));
        int oddSum=numbers.stream().filter(s->s%2==1).reduce(0,Integer::sum);
        System.out.println("Odd Sum is "+oddSum);

    }
}
