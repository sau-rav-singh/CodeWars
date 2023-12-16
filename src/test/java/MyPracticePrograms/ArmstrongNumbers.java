package MyPracticePrograms;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        // Single number Armstrong check
        int num1 = 153;
        if (isArmstrong(num1)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        // Armstrong numbers within an interval
        int first = 50;
        int second = 50000000;
        for (int i = first; i <= second; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int num) {
        int originalNum = num;
        int digits = countDigits(num);
        int pow = 0;

        while (num != 0) {
            int rem = num % 10;
            pow += power(rem, digits);
            num /= 10;
        }

        return pow == originalNum;
    }

    static int countDigits(int num) {
        int digits = 0;
        while (num != 0) {
            num /= 10;
            digits++;
        }
        return digits;
    }

    static int power(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            result *= base;
            exponent--;
        }
        return result;
    }
}
