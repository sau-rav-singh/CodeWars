package Codewars;

import java.util.Arrays;

public class HighestAndLowest {

	//In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
	public static void main(String[] args) {
		
		System.out.println(highAndLow("1 2 -3 4 5"));// return "5 -3"
	}

	static String highAndLow(String numbers) {

		int[] arr = Arrays.stream(numbers.split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();

		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();

		return max + " " + min;
	}
}
