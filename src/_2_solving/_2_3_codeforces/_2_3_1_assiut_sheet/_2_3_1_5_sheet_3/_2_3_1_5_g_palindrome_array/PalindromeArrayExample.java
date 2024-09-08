package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_g_palindrome_array;

import java.util.Scanner;

/**
 * <h1>G. Palindrome Array</h1>
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
 * <h2>Given a number N and an array A of N numbers. Determine if it's palindrome or not.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>An array is called palindrome if it reads the same backward and forward, for example, arrays { 1 } and { 1,2,3,2,1 } are palindromes, while arrays { 1,12 } and { 4,7,5,4 } are not.</h2>
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
    private static final int LENGTH = INPUT.nextInt();
    private static final int[] NUMBERS = new int[LENGTH];

    public static void main(final String[] PARAMETERS) {
        inputValues();
        System.out.print(isPalindromeArray());
    }

    private static String isPalindromeArray() {
        for (int start = 0, end = LENGTH - 1; start < LENGTH / 2; start++, end--)
            if (NUMBERS[start] != NUMBERS[end]) return "NO";
        return "YES";
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) NUMBERS[index] = INPUT.nextInt();
    }
}