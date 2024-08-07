package Codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    //Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
    //Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
    public static void main(String[] args) {
        String notJadenCased = "the more time you spend awake the more time you spend asleep";
        String jadenCased = toJadenCase(notJadenCased);

        System.out.println("Not Jaden-Cased: " + notJadenCased);
        System.out.println("Jaden-Cased:     " + jadenCased);
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        return Arrays.stream(phrase.split(" "))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1))
                .collect(Collectors.joining(" "));
    }
}
