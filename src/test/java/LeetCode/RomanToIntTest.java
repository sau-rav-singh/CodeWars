package LeetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RomanToIntTest {

    public int romanToInt(String s) {
        int total=decimalValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int currentValue = decimalValue(s.charAt(i));
            int previousValue = decimalValue(s.charAt(i - 1));
            if(currentValue>previousValue){
                total=total+currentValue-2*previousValue;
            }else{
                total=total+currentValue;
            }
        }

        return total;
    }

    public int decimalValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    @Test
    public void TestSolution() {
        Assert.assertEquals(romanToInt("XXVII"), 27);
    }
}
