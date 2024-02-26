package Codewars;

public class NextSquare {

    public static void main(String[] args) {
        long currentSquare = 25L;
        long nextSquare = findNextSquare(currentSquare);
        System.out.println("The next integral perfect square after " + currentSquare + " is: " + nextSquare);
    }

    public static long findNextSquare(long sq) {
        long sqrt = (long) Math.sqrt(sq);
        if (sqrt * sqrt != sq) {
            return -1;
        }
        long nextSqrt = sqrt + 1;
        return nextSqrt * nextSqrt;
    }
}
