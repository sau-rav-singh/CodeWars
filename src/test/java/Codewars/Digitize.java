package Codewars;

public class Digitize {

    public static void main(String[] args) {
        int[] arr=digitize(59860);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
    public static int[] digitize(long n){

        String[] nums = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
        return result;
    }
}
