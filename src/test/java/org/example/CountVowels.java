package kata;

public class CountVowels {

	public static void main(String[] args) {

		System.out.println(counter("abc a"));
	}

	public static int counter(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}

		return count;

	}
}
