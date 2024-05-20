package Codewars;

public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(isSquare(25));
    }
    public static boolean isSquare(int n) {
        int num= (int) Math.sqrt(n);
        return (num*num)==n;
    }
}
