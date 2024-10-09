package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_e_lowest_number;

import java.util.Scanner;

/**
 * <h1>E. Lowest Number</h1>
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
 * <h2>Given a number N and an array A of N numbers. Print the lowest number and its position.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>if there are more than one answer print first one's position.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 1 2 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>1 1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 5 6 2 3 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>2 3</h2>
 */

public class LowestNumberExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();
    private static final int[] NUMBERS = new int[LENGTH];

    public static void main(final String[] PARAMETERS) {
        inputValues();
        System.out.print(minimumValueAndHisIndex());
    }

    private static String minimumValueAndHisIndex() {
        short index = 1;
        int minimumNumber = NUMBERS[0];
        String minimumValue = String.format("%d %d", minimumNumber, index);
        while (index < LENGTH - 1) {
            if (minimumNumber > NUMBERS[index]) {
                minimumNumber = NUMBERS[index];
                minimumValue = String.format("%d %d", minimumNumber, index + 1);
            }
            index++;
        }
        return minimumValue;
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) NUMBERS[index] = INPUT.nextInt();
    }
}