package org.example;

public class StringEndsWithChecker {

        public static boolean solution(String str, String ending) {
        int strLength = str.length();
        int endingLength = ending.length();

        // If the ending string is longer than the original string, it can't be a suffix.
        if (endingLength > strLength) {
            return false;
        }

        for (int i = 0; i < endingLength; i++) {
            if (str.charAt(strLength - endingLength + i) != ending.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String ending1 = "bc";
        System.out.println(solution(str1, ending1));  // Should return true

        String str2 = "abc";
        String ending2 = "d";
        System.out.println(solution(str2, ending2));  // Should return false
    }
}
