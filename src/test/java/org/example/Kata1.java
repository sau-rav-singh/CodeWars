package kata;

public class Kata1 {

	public static void main(String[] args) {

		System.out.println(solution("samurai", "ai"));
	}

	public static boolean solution(String string, String ending) {

		if (string == null || ending == null) {
            return false;
        }

        int stringLength = string.length();
        int endingLength = ending.length();

        // If the ending string is longer than the original string, it can't be a suffix
        if (endingLength > stringLength) {
            return false;
        }

        // Compare characters from the end of both strings
        for (int i = 1; i <= endingLength; i++) {
        	System.out.println("String is "+string.charAt(stringLength - i));
        	System.out.println("End is "+ending.charAt(endingLength - i));
        	
            if (string.charAt(stringLength - i) != ending.charAt(endingLength - i)) {
                return false;
            }
        }

        return true;
	}
}
