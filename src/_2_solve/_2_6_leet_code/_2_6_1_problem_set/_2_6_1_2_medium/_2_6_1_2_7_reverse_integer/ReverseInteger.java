package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_7_reverse_integer;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <br/>
 * <br/>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * </h2>
 */

public class ReverseInteger {
    public static void main(final String[] PARAMETERS) {
        System.out.print(reverse(123));
    }

    private static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0)
            if (reversedNumber > Integer.MAX_VALUE / 10 || reversedNumber < Integer.MIN_VALUE / 10)
                return 0;
            else {
                reversedNumber = reversedNumber * 10 + (number % 10);
                number /= 10;
            }
        return reversedNumber;
    }
}