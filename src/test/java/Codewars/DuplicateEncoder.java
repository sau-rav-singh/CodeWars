package Codewars;

import java.util.HashMap;
import java.util.stream.IntStream;

public class DuplicateEncoder {
    public static void main(String[] args) {
//convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string

        System.out.println(encode("din").equals("((("));
        System.out.println(encode("recede").equals("()()()"));
    }

    static String encode(String word){
        char[] wordArray = word.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : wordArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        for (char c : wordArray) {
            result.append(map.get(c) == 1 ? "(" : ")");
        }

        return result.toString();
    }
}
