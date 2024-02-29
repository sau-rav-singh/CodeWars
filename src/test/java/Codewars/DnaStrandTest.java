package Codewars;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DnaStrandTest {

    //In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).


    @Test
    public void test01() {
        assertEquals("TTTT", DnaStrandTest.makeComplement("AAAA"));
        assertEquals("TAACG", DnaStrandTest.makeComplement("ATTGC"));
        assertEquals("CATA", DnaStrandTest.makeComplement("GTAT"));
        assertEquals("TTCC", DnaStrandTest.makeComplement("AAGG"));
    }


    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            chars[i] = getComplement(chars[i]);
        }

        return new String(chars);
    }

    private static char getComplement(char c) {
        return switch (c) {
            case 'A' -> 'T';
            case 'T' -> 'A';
            case 'C' -> 'G';
            case 'G' -> 'C';
            default -> c;
        };
    }
}