package Codewars;

import java.util.HashSet;

public class IsoGram {

    //An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
    public static void main(String[] args) {

        System.out.println(isIsogram("Dermatoglyphics"));
    }

    public static boolean isIsogram(String str) {
        HashSet<Character> hashSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!hashSet.add(c)) {
                return false;
            }
        }
        return true;
    }
}
