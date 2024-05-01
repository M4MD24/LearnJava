package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_f_multiplication_of_matrices;

import java.util.Scanner;

/**
 * <h1>F. Multiplication of Matrices</h1>
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
 * <h2>Given two matrices A and B. Print their Multiplication.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>15</h2>
 * <h1>Output:</h1>
 * <h2>5</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2 2
 * <br/>
 * 1 2
 * <br/>
 * 2 1
 * <br/>
 * 2 2
 * <br/>
 * 3 4
 * <br/>
 * 4 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 11 10
 * <br/>
 * 10 11
 * </h2>
 */

public class MultiplicationOfMatricesExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int ROW_1 = INPUT.nextInt(),
            COLUMN_1 = INPUT.nextInt();
    private static final int[][] MATRIX_1 = new int[ROW_1][COLUMN_1];

    static {
        inputFirstMatrixValues();
    }

    private static final int ROW_2 = INPUT.nextInt(),
            COLUMN_2 = INPUT.nextInt();
    private static final int[][] MATRIX_2 = new int[ROW_2][COLUMN_2];

    static {
        inputSecondMatrixValues();
    }

    private static final int[][] MULTIPLICATION_MATRICES = new int[ROW_1][COLUMN_2];

    public static void main(final String[] ARGS) {
        calculateMultiplicationMatrices();
        printResultOfMultiplicationMatrices();
    }

    private static void printResultOfMultiplicationMatrices() {
        for (int row = 0; row < ROW_1; row++) {
            for (int column = 0; column < COLUMN_2; column++)
                System.out.print(MULTIPLICATION_MATRICES[row][column] + " ");
            System.out.println();
        }
    }

    private static void calculateMultiplicationMatrices() {
        for (int row = 0; row < ROW_1; row++)
            for (int column = 0; column < COLUMN_2; column++)
                for (int index = 0; index < COLUMN_1; index++)
                    MULTIPLICATION_MATRICES[row][column] += MATRIX_1[row][index] * MATRIX_2[index][column];
    }

    private static void inputSecondMatrixValues() {
        for (int row = 0; row < ROW_2; row++)
            for (int column = 0; column < COLUMN_2; column++)
                MATRIX_2[row][column] = INPUT.nextInt();
    }

    private static void inputFirstMatrixValues() {
        for (int row = 0; row < ROW_1; row++)
            for (int column = 0; column < COLUMN_1; column++)
                MATRIX_1[row][column] = INPUT.nextInt();
    }
}