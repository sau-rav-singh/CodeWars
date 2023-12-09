package org.codewars;

public class RemoveVowels {

    public static void main(String[] args) {
        String ans = disemvowel("This website is for losers LOL!");
        System.out.println(ans);
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
