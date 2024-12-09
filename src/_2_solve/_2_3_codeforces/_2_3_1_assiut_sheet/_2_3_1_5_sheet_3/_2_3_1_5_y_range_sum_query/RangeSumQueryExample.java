package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_y_range_sum_query;

import java.util.Scanner;

/**
 * <h1>Y. Range Sum Query</h1>
 * <h2>
 * time limit per test: 1.5 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given 2 numbers N and Q, an array A of N number and Q number of pairs L, R. For each query Q print a single line that contains the summation of all numbers from index L to index R.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 6 3
 * <br/>
 * 6 4 2 7 2 7
 * <br/>
 * 1 3
 * <br/>
 * 3 6
 * <br/>
 * 1 6
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 12
 * <br/>
 * 18
 * <br/>
 * 28
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4 3
 * <br/>
 * 5 5 2 3
 * <br/>
 * 1 3
 * <br/>
 * 2 3
 * <br/>
 * 1 4
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 12
 * <br/>
 * 7
 * <br/>
 * 15
 * </h2>
 */

public class RangeSumQueryExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LENGTH = INPUT.nextInt();
    private static int ranges = INPUT.nextInt();
    private static final int[] NUMBERS = new int[LENGTH];
    private static final long[] SUM_NUMBERS = new long[LENGTH];

    public static void main(final String[] PARAMETERS) {
        inputValues();
        inputAndPrintRanges();
    }

    private static void inputAndPrintRanges() {
        while (ranges > 0) {
            int start = INPUT.nextInt() - 1,
                    end = INPUT.nextInt() - 1;
            long sum = SUM_NUMBERS[end] - SUM_NUMBERS[start] + NUMBERS[start];
            System.out.print(sum);
            if (ranges-- > 1) System.out.println();
        }
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) {
            int currentValue = INPUT.nextInt();
            NUMBERS[index] = currentValue;
            if (index == 0) SUM_NUMBERS[index] = currentValue;
            else SUM_NUMBERS[index] = NUMBERS[index] + SUM_NUMBERS[index - 1];
        }
    }
}