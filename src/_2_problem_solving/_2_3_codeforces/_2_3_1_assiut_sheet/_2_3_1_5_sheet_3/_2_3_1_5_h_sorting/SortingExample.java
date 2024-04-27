package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_h_sorting;

import java.util.Scanner;

/**
 * <h1>H. Sorting</h1>
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
 * <h1>Question:</h1>
 * <h2>Given a number N and an array A of N numbers. Print the numbers after sorting them.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 *     <li>Don't use built-in-functions.</li>
 *     <li>try to solve it with bubble sort algorithm or Selection Sort.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 3 1 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>1 2 3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 5 2 7 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>2 3 5 7</h2>
 */

public class SortingExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();
    private static final short[] NUMBERS = new short[LENGTH];

    public static void main(final String[] ARGS) {
        inputValues();
        sortValues();
        printValues();
    }

    private static void printValues() {
        for (int index = 0; index < LENGTH; index++) {
            System.out.print(NUMBERS[index]);
            if (index < LENGTH - 1) System.out.print(" ");
        }
    }

    private static void sortValues() {
        for (short round = 0; round < LENGTH; round++)
            for (short index = round; index < LENGTH; index++)
                if (NUMBERS[index] < NUMBERS[round]) swapValues(round, index);
    }

    private static void swapValues(final short ROUND, final short INDEX) {
        NUMBERS[ROUND] += NUMBERS[INDEX];
        NUMBERS[INDEX] = (short) (NUMBERS[ROUND] - NUMBERS[INDEX]);
        NUMBERS[ROUND] -= NUMBERS[INDEX];
    }

    private static void inputValues() {
        for (short index = 0; index < LENGTH; index++) NUMBERS[index] = INPUT.nextShort();
    }
}