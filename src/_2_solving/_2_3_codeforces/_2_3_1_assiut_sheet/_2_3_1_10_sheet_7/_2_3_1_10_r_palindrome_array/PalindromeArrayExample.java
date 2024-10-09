package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_r_palindrome_array;

import java.util.Scanner;

/**
 * <h1>R. Palindrome Array</h1>
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
 * <h1>Problem:</h1>
 * <h2>Given a number N and an array A of N numbers. Determine if it's palindrome or not.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 *     <li>An array is called palindrome if it reads the same backward and forward, for example, arrays { 1 } and { 1,2,3,2,1 } are palindromes, while arrays { 1,12 } and { 4,7,5,4 } are not.</li>
 *     <li>Solve this problem using recursion.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 3 2 3 1
 * </h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 1 2 3 4
 * </h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class PalindromeArrayExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int length = INPUT.nextInt();
    private static final int[] NUMBERS = new int[length];

    public static void main(final String[] PARAMETERS) {
        inputValues(0);
        System.out.print((isPalindrome(0, length - 1)) ? "YES" : "NO");
    }

    private static void inputValues(int index) {
        if (index < length) {
            NUMBERS[index++] = INPUT.nextInt();
            inputValues(index);
        }
    }

    private static boolean isPalindrome(int start, int end) {
        if (start > end) return true;
        if (NUMBERS[start++] == NUMBERS[end--]) return isPalindrome(start, end);
        else return false;
    }
}