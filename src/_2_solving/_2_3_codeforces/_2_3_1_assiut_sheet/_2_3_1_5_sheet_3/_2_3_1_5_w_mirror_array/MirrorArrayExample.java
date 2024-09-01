package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_w_mirror_array;

import java.util.Scanner;

/**
 * <h1>W. Mirror Array</h1>
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
 * <h2>
 * Given two numbers N, M and a 2D array of size N * M.
 * <br/>
 * Print the inverted array that appeared in the mirror.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 3
 * <br/>
 * 2 3 5
 * <br/>
 * 7 9 20
 * <br/>
 * 35 1 12
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 5 3 2
 * <br/>
 * 20 9 7
 * <br/>
 * 12 1 35
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_w_mirror_array.images <h2>Image1</h2>
 */

public class MirrorArrayExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int ROWS = INPUT.nextInt(),
            COLUMNS = INPUT.nextInt();
    private static final int[][] NUMBERS = new int[ROWS][COLUMNS];

    public static void main(final String[] ARGS) {
        inputValues();
        printMirrorValues();
    }

    private static void printMirrorValues() {
        for (int row = 0; row < ROWS; row++) {
            for (int column = COLUMNS - 1; column >= 0; column--) {
                System.out.print(NUMBERS[row][column]);
                if (column > 0) System.out.print(" ");
            }
            if (row < ROWS - 1) System.out.println();
        }
    }

    private static void inputValues() {
        for (int row = 0; row < ROWS; row++)
            for (int column = 0; column < COLUMNS; column++)
                NUMBERS[row][column] = INPUT.nextInt();
    }
}