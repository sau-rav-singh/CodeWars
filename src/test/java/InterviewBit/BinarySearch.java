package InterviewBit;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 4, 6},4));
    }

    public static int solution(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (arr[mid] <= num) {
                left = mid + 1;  // move right to find the last occurrence
            } else {
                right = mid - 1; // move left
            }
        }
        return right + 1;
    }
}
