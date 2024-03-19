package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_i_palindrome;

import java.util.Scanner;

/**
 * <h1>I. Palindrome</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a string S. Determine whether S is Palindrome or not</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>A string is said to be a palindrome if the reverse of the string is same as the string. For example, "abba" is palindrome, but "abbc" is not palindrome.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>abba</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>icpcassiut</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>mom</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 */

public class PalindromeExample {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        final String TEXT = INPUT.nextLine();
        System.out.print(isPalindrome(TEXT));
    }

    private static String isPalindrome(final String TEXT) {
        final StringBuilder REVERSED_TEXT = new StringBuilder(TEXT).reverse();
        final short MIDDLE = (short) (TEXT.length() / 2);
        return (TEXT.substring(0, MIDDLE).equals(REVERSED_TEXT.substring(0, MIDDLE))) ? "YES" : "NO";
    }
}