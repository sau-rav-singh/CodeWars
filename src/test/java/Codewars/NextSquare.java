package Codewars;

public class NextSquare {

    public static void main(String[] args) {
        // Example usage
        long currentSquare = 25L;
        long nextSquare = findNextSquare(currentSquare);
        System.out.println("The next integral perfect square after " + currentSquare + " is: " + nextSquare);
    }

    public static long findNextSquare(long sq) {
        // Check if the given number is a perfect square
        long sqrt = (long) Math.sqrt(sq);
        if (sqrt * sqrt != sq) {
            // If not a perfect square, return -1 or throw an exception, depending on your requirements
            return -1; // or throw new IllegalArgumentException("Input is not a perfect square");
        }

        // Find the next integral perfect square
        long nextSqrt = sqrt + 1;
        return nextSqrt * nextSqrt;
    }
}
