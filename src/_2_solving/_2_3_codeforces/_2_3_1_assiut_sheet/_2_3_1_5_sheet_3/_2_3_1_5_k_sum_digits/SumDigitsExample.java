package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_k_sum_digits;

import java.util.Scanner;

/**
 * <h1>K. Sum Digits</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a number N and an array A of N digits (not separated by space). Print the summation of these digits.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>First Example: 1 + 3 + 3 + 0 + 5 = 12 .</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 13305
 * </h2>
 * <h1>Output:</h1>
 * <h2>12</h2>
 */

public class SumDigitsExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGS) {
        INPUT.nextLine();
        final String NUMBERS_SEQUENCE = INPUT.nextLine();
        System.out.print(sumDigits(NUMBERS_SEQUENCE));
    }

    private static int sumDigits(final String NUMBERS_SEQUENCE) {
        final char[] NUMBERS_DIGITS = NUMBERS_SEQUENCE.toCharArray();
        int sum = 0;
        for (int DIGIT : NUMBERS_DIGITS) sum += DIGIT - '0';
        return sum;
    }
}