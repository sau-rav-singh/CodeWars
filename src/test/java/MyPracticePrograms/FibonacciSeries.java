package MyPracticePrograms;

public class FibonacciSeries {

    public static void main(String[] args) {
        int firstNum = 0, secondNum = 1, nextNum, count = 10;

        // Display the first two numbers in the Fibonacci series
        System.out.print(firstNum + " " + secondNum);

        // Generate the Fibonacci series
        for (int i = 2; i < count; i++) {
            nextNum = firstNum + secondNum;
            System.out.print(" " + nextNum);

            // Update the numbers for the next iteration
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
