package InterviewBit;

import org.testng.Assert;

public class WeekToSell {
    //A shopkeeper sells daily A units of item and his shop remains closed on weekends(Saturday and Sunday).
    //Find the number of weeks it will take to sell B units of item.
    //Assume first day to be Monday and return the ceil value of number of weeks. For eg: If it takes 9 days to sell all units then return 2 weeks.
    public static void main(String[] args) {
        Assert.assertEquals(solve(3,17),2);
    }

    public static int solve(int A, int B) {
        int weeklySalesOfA = A * 5;
        double timeToSellB = (double) B / weeklySalesOfA;
        return (int)Math.ceil(timeToSellB);
    }
}
