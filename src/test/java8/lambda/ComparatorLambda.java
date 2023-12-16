package lambda;

import java.util.Comparator;

public class ComparatorLambda {

    public static int compareTwoIntegers(Comparator<Integer> comparator, int a, int b) {

        return comparator.compare(a, b);
    }

    public static void main(String[] args) {

        Comparator<Integer> comparator = Comparator.naturalOrder();

        System.out.println(comparator.compare(1, 2));

        Comparator<Integer> comparatorLambda = Comparator.naturalOrder();
        Comparator<Integer> comparatorLambda1 = Comparator.naturalOrder();

        System.out.println(comparatorLambda.compare(1, 2));

        System.out.println("Result of chaining comparator is with equal inputs : " + comparatorLambda1.thenComparing(comparatorLambda1).compare(2, 2));

        System.out.println("Result of chaining comparator is with not equal inputs: " + comparatorLambda1.thenComparing(comparatorLambda1).compare(3, 2));

        System.out.println(comparatorLambda1.compare(1, 2));

        System.out.println("The greatest integer is : " + compareTwoIntegers(comparatorLambda, 1, 2));


    }
}
