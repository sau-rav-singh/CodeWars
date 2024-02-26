package LeetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeNumberTest {

    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int num=x,rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        return rev==x;
    }

    @Test
    public void testSolution(){
        Assert.assertTrue(isPalindrome(121));
        Assert.assertFalse(isPalindrome(123));
    }
}
