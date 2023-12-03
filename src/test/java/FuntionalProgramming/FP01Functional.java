package FuntionalProgramming;

import java.util.List;

public class FP01Functional {


    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        //printAllNumbersInListFunctional(numbers);
        //printEvenNumbersInListFunctional(numbers);
        //printSquaresOfEvenNumbersInListFunctional(numbers);
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream().filter(s->s%2==0).map(s->s*s).forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(s -> s % 2 == 0).forEach(System.out::println);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);// Method Reference
    }
}
