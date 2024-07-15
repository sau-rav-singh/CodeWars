package Codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mumbling {

    public static void main(String[] args) {
//		accum("abcd") -> "A-Bb-Ccc-Dddd"

        System.out.println(mumble("abcd"));
        System.out.println(mumble2("abcd"));
    }

    public static String mumble(String s) {
        var chars = s.split("");
        return IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i].toUpperCase() + chars[i].toLowerCase().repeat(i))
                .collect(Collectors.joining("-"));
    }

    public static String mumble2(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i > 0) {
                result.append('-');
            }
            result.append(Character.toUpperCase(s.charAt(i)));
            for (int j = 0; j < i; j++) {
                result.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return result.toString();
    }
}
