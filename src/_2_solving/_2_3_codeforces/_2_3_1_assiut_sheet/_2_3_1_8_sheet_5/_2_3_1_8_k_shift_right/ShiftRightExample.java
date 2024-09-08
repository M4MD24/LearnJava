package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_k_shift_right;

import java.util.Scanner;

/**
 * <h1>K. Shift Right</h1>
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
 * Given an array A of size N and a number X. Print the array elements after shifting right the elements X times.
 * <br/>
 * For example: if A = [1, 2, 3] then after shifting it to the right for 1 time A = [3, 1, 2].
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using function</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2 2
 * <br/>
 * 2 1
 * </h2>
 * <h1>Output:</h1>
 * <h2>2 1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5 21
 * <br/>
 * 1 2 3 4 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>5 1 2 3 4</h2>
 */

public class ShiftRightExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();
    private static final byte SHIFT_RIGHT_COUNT = (byte) (INPUT.nextByte() % LENGTH);
    private static final int[] NUMBERS = new int[LENGTH];

    public static void main(final String[] PARAMETERS) {
        inputValues();
        printValues();
    }

    private static void printValues() {
        for (short index = 0; index < LENGTH; index++)
            System.out.print(NUMBERS[index] + " ");
    }

    private static void inputValues() {
        for (short index = SHIFT_RIGHT_COUNT; index < LENGTH; index++)
            NUMBERS[index] = INPUT.nextInt();
        for (short index = 0; index < SHIFT_RIGHT_COUNT; index++)
            NUMBERS[index] = INPUT.nextInt();
    }
}