package Codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" ")).map(PigLatin::pigify).collect(Collectors.joining(" "));
    }

    private static String pigify(String word){
        return word.length() > 1 || Character.isLetter(word.charAt(0)) ? word.substring(1) + word.charAt(0) + "ay" : word;

    }

    public static void main(String[] args) {
        System.out.println(pigIt("Hello world !"));
    }
}
