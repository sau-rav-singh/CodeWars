package MyPracticePrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComplexStringReverseTest {

    @Test
    public void test(){
        Assert.assertEquals(reverseString("this is a phone"),"enoh pa s isiht");
    }

    public static String reverseString(String str) {
        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        // Copy spaces to the result array
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Initialize pointers
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            // Ignore spaces in the input array
            if (inputArray[i] != ' ') {
                // Ignore spaces in the result array
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        return String.valueOf(result);
    }
}
