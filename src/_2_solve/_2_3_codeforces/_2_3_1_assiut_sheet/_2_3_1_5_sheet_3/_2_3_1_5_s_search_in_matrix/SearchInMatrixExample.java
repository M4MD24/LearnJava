package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_s_search_in_matrix;

import java.util.Scanner;

/**
 * <h1>S. Search in Matrix</h1>
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
 * <h2>Given two numbers N and M, a 2D array of size N * M and a number X. Determine whether X exists in the 2D array A or not.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2 2
 * <br/>
 * 1 2
 * <br/>
 * 3 4
 * <br/>
 * 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>will not take number</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2 2
 * <br/>
 * 1 2
 * <br/>
 * 3 4
 * <br/>
 * 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>will take number</h2>
 */

public class SearchInMatrixExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte ROWS = INPUT.nextByte(),
            COLUMNS = INPUT.nextByte();
    private static final int[][] NUMBERS = new int[ROWS][COLUMNS];

    public static void main(final String[] ARGUMENTS) {
        inputValues();
        System.out.println(isContain(INPUT.nextInt()));
    }

    private static String isContain(final int TARGET_VALUE) {
        for (byte row = 0; row < ROWS; row++)
            for (byte column = 0; column < COLUMNS; column++)
                if (NUMBERS[row][column] == TARGET_VALUE) return "will not take number";
        return "will take number";
    }

    private static void inputValues() {
        for (byte row = 0; row < ROWS; row++)
            for (byte column = 0; column < COLUMNS; column++)
                NUMBERS[row][column] = INPUT.nextInt();
    }
}