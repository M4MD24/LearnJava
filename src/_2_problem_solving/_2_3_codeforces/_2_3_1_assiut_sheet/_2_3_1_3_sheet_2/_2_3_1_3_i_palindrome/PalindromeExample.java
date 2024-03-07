package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_i_palindrome;

import java.util.Scanner;

/**
 * <h1>H. One Prime</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input standard input
 * <br/>
 * output standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * Given a number N Print 2 lines that contain the following respectively:
 * <ol>
 *     <li>Print N in a reversed order and not leading zeroes.</li>
 *     <li>If N is a palindrome number print "YES" otherwise, print "NO.</li>
 * </ol>
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * A palindrome number is a number that reads the same forward or backward.
 * <br/>
 * For example: 12321, 101 are palindrome numbers, while 1201, 221 are not.
 * <br/>
 * A leading zero is any 0 digit that comes before the first nonzero digit in a number for example : numbers (005 , 01 , 0123 , 02 , 000250 ) are leading zeroes but ( 5 , 123 , 20 ,2500 ) not leading zeroes numbers .
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>12121</h2>
 * <h1>Output:</h1>
 * <h2>
 * 12121
 * <br/>
 * YES
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>160</h2>
 * <h1>Output:</h1>
 * <h2>
 * 61
 * <br/>
 * NO
 * </h2>
 */

public class PalindromeExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        final long NUMBER = INPUT.nextLong();
        System.out.print(isPalindrome(NUMBER));
    }

    private static String isPalindrome(final long NUMBER) {
        final long REVERSED_NUMBER = reverseNumber(NUMBER);
        System.out.println(REVERSED_NUMBER);
        if (NUMBER == REVERSED_NUMBER) return "YES";
        else return "NO";
    }

    private static long reverseNumber(long number) {
        long reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }
}