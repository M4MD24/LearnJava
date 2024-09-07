package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_m_suffix_sum;

import java.util.Scanner;

/**
 * <h1>M. Suffix Sum</h1>
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
 * <h2>Given two numbers N and M, and an array A of N numbers. Calculate the sum of the last M numbers.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5 3
 * <br/>
 * 1 8 2 10 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>15</h2>
 */

public class SuffixSumExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int length = INPUT.nextInt();
    private static final int START_SUMMATION_AT = INPUT.nextInt();
    private static long total = 0;

    public static void main(final String[] PARAMETERS) {
        System.out.print(inputValuesRecursion());
    }

    private static long inputValuesRecursion() {
        if (length-- > 0) {
            final int CURRENT_VALUE = INPUT.nextInt();
            total += (length < START_SUMMATION_AT)
                    ? CURRENT_VALUE
                    : 0;
            return inputValuesRecursion();
        } else return total;
    }
}