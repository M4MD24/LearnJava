package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_a_summation;

import java.util.Scanner;

/**
 * <h1>A. Summation</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>
 * Given a number N and an array A of N numbers. Print the absolute summation of these numbers.
 * <br/>
 * absolute value : means to remove any negative sign in front of a number.
 * <br/>
 * Example: |-5| = 5 , |7| = 7
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>-1 + 2 + -3 = -2 and it absolute is 2 so the answer is 2.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 7 2 1 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>13</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * -1 2 -3
 * </h2>
 * <h1>Output:</h1>
 * <h2>13</h2>
 */

public class SummationExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        final int LENGTH = INPUT.nextInt();
        final long[] NUMBERS = new long[LENGTH];
        inputValues(NUMBERS, LENGTH);
        System.out.print((summation(NUMBERS, LENGTH) > 0) ? summation(NUMBERS, LENGTH) : Math.abs(summation(NUMBERS, LENGTH)));
    }

    private static long summation(final long[] NUMBERS, int length) {
        long sum = 0;
        while (length-- > 0) sum += NUMBERS[length];
        return sum;
    }

    private static void inputValues(final long[] NUMBERS, int length) {
        while (length-- > 0) NUMBERS[length] = INPUT.nextLong();
    }
}