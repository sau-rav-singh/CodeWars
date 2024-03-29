package Codewars;

public class TimeFormatter {
    //Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
    public static void main(String[] args) {
        int inputSeconds = 90;
        String formattedTime = formatTime(inputSeconds);
        System.out.println(formattedTime);
    }

    public static String formatTime(int seconds) {
        if (seconds < 0 || seconds > 359999) {
            throw new IllegalArgumentException("Input should be a non-negative integer less than or equal to 359999");
        }
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }
}
