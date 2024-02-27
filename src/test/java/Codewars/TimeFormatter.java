package Codewars;

public class TimeFormatter {
//Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
    public static String formatTime(int seconds) {
        if (seconds < 0 || seconds > 359999) {
            throw new IllegalArgumentException("Input should be a non-negative integer less than or equal to 359999");
        }

        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }

    public static void main(String[] args) {
        // Example usage:
        int inputSeconds = 89; // Example input: 1 hour, 1 minute, and 5 seconds
        String formattedTime = formatTime(inputSeconds);
        System.out.println(formattedTime); // Output: 01:01:05
    }
}
