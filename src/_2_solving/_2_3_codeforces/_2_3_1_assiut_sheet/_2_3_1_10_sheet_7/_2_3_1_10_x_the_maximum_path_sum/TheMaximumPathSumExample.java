package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_x_the_maximum_path_sum;

import java.util.Scanner;

/**
 * <h1>X. The maximum path-sum</h1>
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
 * Given a matrix A of size N*M. Print the maximum sum of numbers that can be obtained when you take a path from A1,1 to AN,M
 * <br/>
 * If you stay in Ai,j you can only go to:
 * </h2>
 * <ul>
 *     <li>Ai + 1, j if and only if i ≤ N</li>
 *     <li>Ai, j+1 if and only if j ≤ M</li>
 * </ul>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 3
 * <br/>
 * 5 2 4
 * <br/>
 * 1 3 5
 * <br/>
 * 9 2 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>24</h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_x_the_maximum_path_sum.images <h2>Example Note</h2>
 */

public class TheMaximumPathSumExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte ROWS = INPUT.nextByte(),
            COLUMNS = INPUT.nextByte();
    private static final int[][] NUMBERS = new int[ROWS][COLUMNS];

    public static void main(final String[] ARGS) {
        inputValues((byte) 0, (byte) 0);
        System.out.print(getMaximumPathOfSumNumbers((byte) 0, (byte) 0));
    }

    private static int getMaximumPathOfSumNumbers(final byte ROW, final byte COLUMN) {
        if (ROW == ROWS - 1 && COLUMN == COLUMNS - 1) return NUMBERS[ROW][COLUMN];
        else if (ROW >= ROWS || COLUMN >= COLUMNS) return -1000000;
        return NUMBERS[ROW][COLUMN] + Math.max(
                getMaximumPathOfSumNumbers(ROW, (byte) (COLUMN + 1)),
                getMaximumPathOfSumNumbers((byte) (ROW + 1), COLUMN));
    }

    private static void inputValues(byte row, byte column) {
        if (row < ROWS) {
            if (column < COLUMNS) {
                NUMBERS[row][column++] = INPUT.nextInt();
                inputValues(row, column);
            } else inputValues(++row, (byte) 0);
        }
    }
}