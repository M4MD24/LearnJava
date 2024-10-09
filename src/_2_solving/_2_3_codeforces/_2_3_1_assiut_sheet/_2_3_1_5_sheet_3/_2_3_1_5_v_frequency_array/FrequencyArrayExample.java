package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_v_frequency_array;

import java.util.Scanner;

/**
 * <h1>V. Frequency Array</h1>
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
 * <h2>Given 2 numbers N, M and an array A of N numbers. For every number from 1 to M, print how many times this number appears in this array.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * Numbers from 1 to 5 appearance are :
 * <br/>
 * 1 appears 2 times in the array .
 * <br/>
 * 2 appears 2 times in the array.
 * <br/>
 * 3 appears 3 times in the array.
 * <br/>
 * 4 appears once in the array.
 * <br/>
 * 5 appears 2 times in the array.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 10 5
 * <br/>
 * 1 2 3 4 5 3 2 1 5 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 2
 * <br/>
 * 2
 * <br/>
 * 3
 * <br/>
 * 1
 * <br/>
 * 2
 * </h2>
 */

public class FrequencyArrayExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LENGTH = INPUT.nextInt(),
            TARGET_NUMBER = INPUT.nextInt();
    private static final int[] COUNTERS = new int[TARGET_NUMBER];

    public static void main(final String[] PARAMETERS) {
        inputValues();
        printCountNumbers();
    }

    private static void printCountNumbers() {
        for (int index = 0; index < TARGET_NUMBER; index++) {
            System.out.print(COUNTERS[index]);
            if (index < TARGET_NUMBER - 1) System.out.println();
        }
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) {
            int currentValue = INPUT.nextInt();
            if (currentValue > 0 && currentValue <= TARGET_NUMBER)
                COUNTERS[currentValue - 1] = ++COUNTERS[currentValue - 1];
        }
    }
}