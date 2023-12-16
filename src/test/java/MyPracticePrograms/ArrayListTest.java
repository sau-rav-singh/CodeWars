package MyPracticePrograms;
//Remove duplicate chars from arraylist of strings

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> dupList = new ArrayList<>(Arrays.asList("hello", "helloishi", "mastercard"));

        dupList.replaceAll(ArrayListTest::removeDuplicate);

        System.out.println(dupList);
    }

    public static String removeDuplicate(String input) {
        Set<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (uniqueChars.add(currentChar)) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
