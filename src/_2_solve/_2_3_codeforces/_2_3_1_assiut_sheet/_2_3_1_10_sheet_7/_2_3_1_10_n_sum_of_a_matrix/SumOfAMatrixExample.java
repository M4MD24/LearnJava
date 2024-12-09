package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_n_sum_of_a_matrix;

import java.util.Scanner;

/**
 * <h1>N. Sum of a Matrix</h1>
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
 * <h2>Given two matrices A and B of size R*C. Print the summation of A and B.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2 3
 * <br/>
 * 1 2 3
 * <br/>
 * 4 5 6
 * <br/>
 * 1 3 5
 * <br/>
 * 7 9 11
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 2 5 8
 * <br/>
 * 11 14 17
 * </h2>
 */

public class SumOfAMatrixExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte ROWS = INPUT.nextByte(),
            COLUMNS = INPUT.nextByte();
    private static final byte[][] FIRST_MATRIX = new byte[ROWS][COLUMNS],
            SECOND_MATRIX = new byte[ROWS][COLUMNS];

    public static void main(final String[] PARAMETERS) {
        inputValues();
        printSummationOfMatricesRecursion((byte) 0, (byte) 0);
    }

    private static void printSummationOfMatricesRecursion(byte row, byte column) {
        if (row < ROWS) {
            if (column < COLUMNS) {
                System.out.print(FIRST_MATRIX[row][column] + SECOND_MATRIX[row][column++] + " ");
                printSummationOfMatricesRecursion(row, column);
            } else {
                System.out.println();
                printSummationOfMatricesRecursion(++row, (byte) 0);
            }
        }
    }

    private static void inputValues() {
        inputValuesFirstMatrixRecursion((byte) 0, (byte) 0);
        inputValuesSecondMatrixRecursion((byte) 0, (byte) 0);
    }

    private static void inputValuesSecondMatrixRecursion(byte row, byte column) {
        if (row < ROWS) {
            if (column < COLUMNS) {
                SECOND_MATRIX[row][column++] = INPUT.nextByte();
                inputValuesSecondMatrixRecursion(row, column);
            } else inputValuesSecondMatrixRecursion(++row, (byte) 0);
        }
    }

    private static void inputValuesFirstMatrixRecursion(byte row, byte column) {
        if (row < ROWS) {
            if (column < COLUMNS) {
                FIRST_MATRIX[row][column++] = INPUT.nextByte();
                inputValuesFirstMatrixRecursion(row, column);
            } else inputValuesFirstMatrixRecursion(++row, (byte) 0);
        }
    }
}