package MyPrograms;

public class LeapYear {

    public static void main(String[] args) {
        int year = 1900;
        String result = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))
                ? String.format("\n %d is a Leap Year. \n", year)
                : String.format("\n %d is NOT a Leap Year. \n", year);

        System.out.println(result);
    }
}
