package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_9_palindrome_number;

/**
 * <h1>Problem:</h1>
 * <h2>Given an integer x, return true if x is a palindrome, and false otherwise.</h2>
 */

public class PalindromeNumber {
    public static void main(final String[] PARAMETERS) {
        System.out.print(isPalindrome(121));
    }

    private static boolean isPalindrome(int number) {
        if (number < 0 || (number % 10 == 0 && number != 0))
            return false;
        else {
            int reversedNumber = 0;
            while (number > reversedNumber) {
                reversedNumber = reversedNumber * 10 + number % 10;
                number /= 10;
            }
            return number == reversedNumber || number == reversedNumber / 10;
        }
    }

// >
    /*private static boolean isPalindrome(final int NUMBER) {
        return String.valueOf(NUMBER).contentEquals(new StringBuilder(String.valueOf(NUMBER)).reverse());
    }*/
}