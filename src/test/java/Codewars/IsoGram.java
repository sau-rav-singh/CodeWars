package Codewars;

import java.util.HashSet;

public class IsoGram {

    public static void main(String[] args) {

        System.out.println(isIsogram("moose"));
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
