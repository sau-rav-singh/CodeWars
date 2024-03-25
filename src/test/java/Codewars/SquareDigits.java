package Codewars;

import java.util.stream.Collectors;

public class SquareDigits {

    public static void main(String[] args) {

        int num=squareDigits(1283);
        System.out.println(num);
    }

    public static int squareDigits(int n) {
        StringBuilder squaredDigits = new StringBuilder();
        String str = String.valueOf(n);
        for (char c : str.toCharArray()) {
            int digit = Character.getNumericValue(c);
            squaredDigits.append(digit * digit);
        }
        String squaredString = squaredDigits.toString();
        return Integer.parseInt(squaredString);
    }

}
