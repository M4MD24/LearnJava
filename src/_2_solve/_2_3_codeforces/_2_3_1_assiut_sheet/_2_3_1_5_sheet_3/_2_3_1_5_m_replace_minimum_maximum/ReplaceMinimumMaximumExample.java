package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_m_replace_minimum_maximum;

import java.util.Scanner;

/**
 * <h1>M. Replace Minimum Maximum</h1>
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
 * <h2>Given a number N and an array A of N numbers. Print the array after doing the following operations:</h2>
 * <ul>
 *     <li>Find minimum number in these numbers.</li>
 *     <li>Find maximum number in these numbers.</li>
 *     <li>Swap minimum number with maximum number.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 4 1 3 10 8
 * </h2>
 * <h1>Output:</h1>
 * <h2>4 10 3 1 8</h2>
 */

public class ReplaceMinimumMaximumExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();
    private static final int[] NUMBERS = new int[LENGTH];

    public static void main(final String[] ARGUMENTS) {
        inputValues();
        swapMinimumAndMaximumValues();
        printValues();
    }

    private static void printValues() {
        for (int index = 0; index < LENGTH; index++) {
            System.out.print(NUMBERS[index]);
            if (index < LENGTH - 1) System.out.print(" ");
        }
    }

    private static void swapMinimumAndMaximumValues() {
        Values values = getMinimumAndMaximumValue();
        NUMBERS[values.minimumValueIndex] += NUMBERS[values.maximumValueIndex];
        NUMBERS[values.maximumValueIndex] = NUMBERS[values.minimumValueIndex] - NUMBERS[values.maximumValueIndex];
        NUMBERS[values.minimumValueIndex] -= NUMBERS[values.maximumValueIndex];
    }

    private static Values getMinimumAndMaximumValue() {
        short minimumValueIndex = 0,
                maximumValueIndex = 0;
        int minimumValue = NUMBERS[minimumValueIndex],
                maximumValue = NUMBERS[maximumValueIndex];
        for (short index = 1; index < LENGTH; index++) {
            if (NUMBERS[index] < minimumValue) {
                minimumValue = NUMBERS[index];
                minimumValueIndex = index;
            }
            if (NUMBERS[index] > maximumValue) {
                maximumValue = NUMBERS[index];
                maximumValueIndex = index;
            }
        }
        return new Values(minimumValueIndex, maximumValueIndex);
    }

    private record Values(short minimumValueIndex, short maximumValueIndex) {
    }

    private static void inputValues() {
        for (short index = 0; index < LENGTH; index++) NUMBERS[index] = INPUT.nextInt();
    }
}