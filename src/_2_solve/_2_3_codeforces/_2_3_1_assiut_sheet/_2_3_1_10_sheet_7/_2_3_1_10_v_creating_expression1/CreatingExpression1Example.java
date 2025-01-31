package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_v_creating_expression1;

import java.util.Scanner;

/**
 * <h1>V. Creating Expression 1</h1>
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
 * <h2>Given two numbers N ,X and an array A of N numbers. Determine if there is a way to put '+' or '-' signs between every two numbers in the array A in order to make an expression that is equal to X.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 *     <li>Solve this problem using recursion.</li>
 *     <li>In the first example: 1 - 2 - 3 + 4 + 5 = 5</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5 5
 * <br/>
 * 1 2 3 4 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5 2
 * <br/>
 * 1 2 3 4 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class CreatingExpression1Example {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte LENGTH = INPUT.nextByte();
    private static final int REQUIRED_SUM = INPUT.nextInt();
    private static final int[] NUMBERS = new int[LENGTH];

    public static void main(final String[] ARGUMENTS) {
        inputValues((byte) 0);
        System.out.print(checkCurrentTotalEqualRequiredSum(NUMBERS[0], (byte) 1) ? "YES" : "NO");
    }

    private static boolean checkCurrentTotalEqualRequiredSum(final int CURRENT_SUM, final byte INDEX) {
        if (INDEX == LENGTH) return CURRENT_SUM == REQUIRED_SUM;
        return checkCurrentTotalEqualRequiredSum(CURRENT_SUM + NUMBERS[INDEX], (byte) (INDEX + 1)) ||
                checkCurrentTotalEqualRequiredSum(CURRENT_SUM - NUMBERS[INDEX], (byte) (INDEX + 1));
    }

    private static void inputValues(byte index) {
        if (index < LENGTH) {
            NUMBERS[index++] = INPUT.nextInt();
            inputValues(index);
        }
    }
}