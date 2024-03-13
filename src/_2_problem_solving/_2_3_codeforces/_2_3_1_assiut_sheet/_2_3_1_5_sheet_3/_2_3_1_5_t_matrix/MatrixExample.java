package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_t_matrix;

import java.util.Scanner;

/**
 * <h1>T. Search in Matrix</h1>
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
 * <h2>Given a number N and a 2D array A of size N * N. Print the absolute difference between the summation of its two diagonals (primary diagonal and secondary diagonal).</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 1 5 12 1
 * <br/>
 * 2 -4 6 7
 * <br/>
 * 3 8 5 9
 * <br/>
 * 3 5 23 -6
 * </h2>
 * <h1>Output:</h1>
 * <h2>22</h2>
 */

public class MatrixExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte LENGTH = INPUT.nextByte();
    private static final byte[][] NUMBERS = new byte[LENGTH][LENGTH];

    public static void main(String[] args) {
        inputValues();
        final long SUM_NUMBERS_FIRST_DIAGONAL = getSumNumbersFirstDiagonal(),
                SUM_NUMBERS_SECOND_DIAGONAL = getSumNumbersSecondDiagonal(),
                SUM_NUMBERS_DIAGONALS = Math.abs(SUM_NUMBERS_FIRST_DIAGONAL - SUM_NUMBERS_SECOND_DIAGONAL);
        System.out.print(SUM_NUMBERS_DIAGONALS);
    }

    private static long getSumNumbersSecondDiagonal() {
        long sum = 0;
        for (byte row = 0, column = (byte) (LENGTH - 1); row < LENGTH; row++, column--)
            sum += NUMBERS[row][column];
        return sum;
    }

    private static long getSumNumbersFirstDiagonal() {
        long sum = 0;
        for (byte row = 0, column = row; row < LENGTH; row++, column++)
            sum += NUMBERS[row][column];
        return sum;
    }

    private static void inputValues() {
        for (byte row = 0; row < LENGTH; row++)
            for (byte column = 0; column < LENGTH; column++)
                NUMBERS[row][column] = INPUT.nextByte();
    }
}