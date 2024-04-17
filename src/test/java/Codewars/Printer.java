package Codewars;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Printer {

    //Create a function printer_error(s) to calculate the error rate of a printer.
    //Count the number of characters in the string that are not in the range 'a' to 'm'.
    //Return the error rate as a string in the format "number of errors/total length of the control string".
    public static void main(String[] args) {
        String s1 = "aaabbbbhaijjjm";
        String s2 = "aaaxbbbbyyhwawiwjjjwwm";

        System.out.println(printerError(s1)); // Output: 0/14
        System.out.println(printerError(s2)); // Output: 8/22

    }
    public static String printerError(String s) {
        int stringLength=s.length();
        long errorCount = s.chars()
                .filter(c -> c > 'm')
                .count();
        return errorCount + "/" + stringLength;
    }
}
