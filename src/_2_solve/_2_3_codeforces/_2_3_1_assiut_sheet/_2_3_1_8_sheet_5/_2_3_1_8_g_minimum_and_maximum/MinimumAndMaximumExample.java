package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_g_minimum_and_maximum;

import java.util.Scanner;

/**
 * <h1>G. Minimum and Maximum</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given an array A of size N. Print the minimum and the maximum number in the array.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using function and don't use built-in function.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 10 13 95 1 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>1 95</h2>
 */

public class MinimumAndMaximumExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGUMENTS) {
        System.out.print(getMaximumAndMinimumNumber(INPUT.nextShort()));
    }

    private static String getMaximumAndMinimumNumber(final short LENGTH) {
        int maximum = Integer.MIN_VALUE,
                minimum = Integer.MAX_VALUE;
        for (int index = 0; index < LENGTH; index++) {
            int currentValue = INPUT.nextInt();
            if (currentValue >= maximum) maximum = currentValue;
            if (currentValue <= minimum) minimum = currentValue;
        }
        return String.format("%d %d", minimum, maximum);
    }
}