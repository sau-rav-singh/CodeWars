package org.example;

public class HighestAndLowest {

	public static void main(String[] args) {
		
		System.out.println(highAndLow("1 2 -3 4 5"));// return "5 -3"
	}

	static String highAndLow(String numbers) {

		String[] arr = numbers.split(" ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

        for (String s : arr) {
            if (Integer.parseInt(s) > max)
                max = Integer.parseInt(s);
            if (Integer.parseInt(s) < min)
                min = Integer.parseInt(s);
        }

		return max + " " + min;
	}
}
