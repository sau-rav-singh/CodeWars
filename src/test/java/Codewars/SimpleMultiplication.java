package Codewars;

public class SimpleMultiplication {

    public static void main(String[] args) {

        System.out.println(simpleMultiplication(2));
    }

    public static int simpleMultiplication(int n) {
        if (n % 2 == 0)
            return n * 8;
        else
            return n * 9;
    }
}
