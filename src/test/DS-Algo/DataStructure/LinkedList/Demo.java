package DataStructure.LinkedList;

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        Predicate<String> myPredicate=i->i.length()>5;
        System.out.println(myPredicate.test("SAMuel"));
        System.out.println(myPredicate.test("Sam"));

    }
}
