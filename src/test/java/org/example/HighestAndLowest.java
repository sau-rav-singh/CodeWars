package org.example;

public class HighestAndLowest {

	public static void main(String[] args) {
		
		System.out.println(highAndLow("1 2 -3 4 5"));// return "5 -3"
	}

	static String highAndLow(String numbers) {

		String[] arr = numbers.split(" ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (Integer.parseInt(arr[i]) > max)
				max = Integer.parseInt(arr[i]);
			if (Integer.parseInt(arr[i]) < min)
				min = Integer.parseInt(arr[i]);
		}

		return max + " " + min;
	}
}
