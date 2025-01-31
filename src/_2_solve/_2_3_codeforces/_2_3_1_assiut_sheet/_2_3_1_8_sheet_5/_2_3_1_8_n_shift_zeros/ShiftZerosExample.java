package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_n_shift_zeros;

import java.util.Scanner;

/**
 * <h1>N. Shift Zeros</h1>
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
 * <h2>Given an array A of size N. Print the array elements after shifting all zeroes in array A to the right.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using function</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 2 0 0 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>2 5 0 0 </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 5 0 7 4
 * </h2>
 * <h1>Output:</h1>
 * <h2>1 5 7 4 0 </h2>
 */

public class ShiftZerosExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();
    private static final short[] NUMBERS = new short[LENGTH];

    public static void main(final String[] ARGUMENTS) {
        inputValuesNotEqualsZero();
        printValues();
    }

    private static void printValues() {
        for (short index = 0; index < LENGTH; index++) System.out.print(NUMBERS[index] + " ");
    }

    private static void inputValuesNotEqualsZero() {
        short start = 0,
                end = LENGTH;
        while (start < end) {
            final short CURRENT_VALUE = INPUT.nextShort();
            if (CURRENT_VALUE == 0) end--;
            else {
                NUMBERS[start] = CURRENT_VALUE;
                start++;
            }
        }
    }
}