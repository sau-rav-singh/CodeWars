package InterviewBit;

import org.testng.Assert;

public class FizzBuzz {
    public static void main(String[] args) {
        String expected = "[1 2 Fizz 4 Buzz]";
        String actual = fizzBuzz(5);
        Assert.assertEquals(actual, expected);
    }

    public static String fizzBuzz(int A) {
        String[] strArray = new String[A]; // Create array of size A

        for (int i = 1; i <= A; i++) {
            if (i % 15 == 0) {
                strArray[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                strArray[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                strArray[i - 1] = "Buzz";
            } else {
                strArray[i - 1] = String.valueOf(i);
            }
        }

        // Convert array to the desired output format
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < A; i++) {
            result.append(strArray[i]);
            if (i < A - 1) {
                result.append(" ");
            }
        }
        result.append("]");

        return result.toString();
    }
}
