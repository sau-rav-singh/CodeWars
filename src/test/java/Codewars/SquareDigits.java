package Codewars;

import java.util.stream.Collectors;

public class SquareDigits {

    public static void main(String[] args) {

        int num=squareDigits(1283);
        System.out.println(num);
    }

    public static int squareDigits(int n) {
        String str = String.valueOf(n);
        String squaredString = str.chars()
                .mapToObj(Character::getNumericValue)
                .map(num -> num * num)
                .map(Object::toString)
                .collect(Collectors.joining());

        return Integer.parseInt(squaredString);
    }

}
