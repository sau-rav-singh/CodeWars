package Codewars;

public class StringEndsWithChecker {

    //Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
    public static boolean solution(String str, String ending) {
        int endLength = ending.length();
        int strLength = str.length();

        if (endLength > strLength) {
            return false;
        }

        String suffix = str.substring(strLength - endLength);
        return suffix.equals(ending);
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
