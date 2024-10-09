package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_d_positions_in_array;

import java.util.Scanner;

/**
 * <h1>D. Positions in Array</h1>
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
 * <h2>Given a number N and an array A of N numbers. Print all array positions that store a number less than or equal to 10 and the number stored in that position.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 2 100 0 30
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * A[0] = 1
 * <br/>
 * A[1] = 2
 * <br/>
 * A[3] = 0
 * </h2>
 */

public class PositionsInArrayExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();
    private static final int[] NUMBERS = new int[LENGTH];

    public static void main(final String[] PARAMETERS) {
        inputValues();
        printValuesLessThanOrEqualTo10();
    }

    private static void printValuesLessThanOrEqualTo10() {
        for (int index = 0; index < LENGTH; index++)
            if (NUMBERS[index] <= 10) System.out.println("A[" + index + "]" + " = " + NUMBERS[index]);
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) NUMBERS[index] = INPUT.nextInt();
    }
}