package Codewars;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortStringsTest {

    /*Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.*/
    @Test
    public void Test() {
        String a = "xyaabbbccccdefww";
        String b = "xxxxyyyyabklmopq";

        Assert.assertEquals(longest(a, b), "abcdefklmopqwxy");
    }

    public static String longest(String s1, String s2) {
        return Stream.of(s1.concat(s2).split(""))
                .sorted()
                .distinct()
                .collect(Collectors.joining());
    }
}
