package InterviewBit;

import org.testng.Assert;

public class FizzBuzz {

    //Given a positive integer A, return an array of strings with all the integers from 1 to N.
    //But for multiples of 3 the array should have “Fizz” instead of the number.
    //For the multiples of 5, the array should have “Buzz” instead of the number.
    //For numbers which are multiple of 3 and 5 both, the array should have “FizzBuzz” instead of the number.

    public static void main(String[] args) {
        Assert.assertEquals(fizzBuzz(5), "1 2 Fizz 4 Buzz");
    }

    public static String fizzBuzz(int A) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A; i++) {
            if ((i + 1) % 15 == 0) {
                sb.append("FizzBuzz");
            } else if ((i + 1) % 5 == 0) {
                sb.append("Buzz");
            } else if ((i + 1) % 3 == 0) {
                sb.append("Fizz");
            } else {
                sb.append((i + 1));
            }
            if (i != A - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
