package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_e_max;

import java.util.Scanner;

/**
 * <h1>E. Max</h1>
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
 * <h2>Given a number N, and N numbers, find maximum number in these N numbers.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>The "Correct" password is the number 1999.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 8 5 7 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>8</h2>
 */

public class MaxExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int MAX_NUMBER = 0;

    public static void main(final String[] PARAMETERS) {
        final int ARRAY_LENGTH = INPUT.nextInt();
        enterValues(ARRAY_LENGTH);
        System.out.print(MAX_NUMBER);
    }

    private static void enterValues(final int LENGTH) {
        for (int index = 0; index < LENGTH; index++) {
            final int NUMBER = INPUT.nextInt();
            checkMaxNumber(NUMBER);
        }
    }

    private static void checkMaxNumber(final int NUMBER) {
        if (MAX_NUMBER < NUMBER) MAX_NUMBER = NUMBER;
    }
}