package Codewars;

public class BreakCamelCase {

    public static void main(String[] args) {

        System.out.println(camelCase("camelCasing"));
    }

    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(' ');
            }
            result.append(ch);
        }
        return result.toString();
    }
}
