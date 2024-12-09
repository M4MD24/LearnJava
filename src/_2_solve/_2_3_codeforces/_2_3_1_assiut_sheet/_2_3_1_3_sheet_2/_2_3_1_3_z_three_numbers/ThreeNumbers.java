package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_z_three_numbers;

import java.util.Scanner;

/**
 * <h1>Z. Three Numbers</h1>
 * <h2>
 * time limit per test: 3 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given two numbers K and S. Determine how many different values of X,Y and Z such that (0≤X,Y,Z≤K) and X+Y+Z=S</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>In the first test case all values of X,Y,Z that satisfy the conditions are:</h2>
 * <ul>
 *     <li>0 0 1</li>
 *     <li>0 1 0</li>
 *     <li>1 0 0</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2 1</h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>9 4</h2>
 * <h1>Output:</h1>
 * <h2>15</h2>
 */

public class ThreeNumbers {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int FIRST_NUMBER = INPUT.nextInt(),
            SECOND_NUMBER = INPUT.nextInt();

    public static void main(final String[] PARAMETERS) {
        printCountValidCombinations();
    }

    private static void printCountValidCombinations() {
        final int COUNT_VALID_COMBINATIONS = countValidCombinations();
        System.out.println(COUNT_VALID_COMBINATIONS);
    }

    private static int countValidCombinations() {
        int count = 0;
        for (int NUMBER_1 = 0; NUMBER_1 <= FIRST_NUMBER; NUMBER_1++) {
            for (int NUMBER_2 = 0; NUMBER_2 <= FIRST_NUMBER; NUMBER_2++) {
                int NUMBER_3 = SECOND_NUMBER - NUMBER_1 - NUMBER_2;
                if (NUMBER_3 >= 0 && NUMBER_3 <= FIRST_NUMBER) count++;
            }
        }
        return count;
    }
}