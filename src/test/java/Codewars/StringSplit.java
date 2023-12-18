package Codewars;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {

    public static void main(String[] args) {
        String[] stringArray = solution("abc");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }

    public static String[] solution(String s) {
        List<String> list = new ArrayList<>();
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i += 2) {
            char firstChar = charArray[i];
            char secondChar = (i + 1 < charArray.length) ? charArray[i + 1] : '_';
            list.add(String.valueOf(firstChar).concat(String.valueOf(secondChar)));
        }

        return list.toArray(new String[0]);
    }
}
