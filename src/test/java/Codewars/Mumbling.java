package Codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mumbling {

    public static void main(String[] args) {
//		accum("abcd") -> "A-Bb-Ccc-Dddd"
//		accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//		accum("cwAt") -> "C-Ww-Aaa-Tttt"

        System.out.println(accum("abcd"));
    }

    public static String accum(String s) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> {
                    char c = Character.toUpperCase(s.charAt(i));
                    String repeatedChars = IntStream.range(0, i)
                            .mapToObj(j -> Character.toLowerCase(c))
                            .map(Object::toString)
                            .collect(Collectors.joining(""));
                    return c + repeatedChars;
                })
                .collect(Collectors.joining("-"));
    }
}
