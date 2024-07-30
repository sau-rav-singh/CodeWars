package InterviewBit;

public class MaxSumPicker {
//Given an integer array A of size N.You have to pick exactly B elements from either left or right end of the array A to get the maximum sum.Find and return this maximum possible sum.

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int B = 4;
        System.out.println("Maximum possible sum: " + maxSum(A, B)); // Output: 34
    }

    public static int maxSum(int[] A, int B) {
        int n = A.length;
        int currentSum = 0;
        for (int i = 0; i < B; i++) {
            currentSum += A[i];
        }
        int maxSum = currentSum;
        for (int i = 0; i < B; i++) {
            currentSum -= A[B - 1 - i];
            currentSum += A[n - 1 - i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
