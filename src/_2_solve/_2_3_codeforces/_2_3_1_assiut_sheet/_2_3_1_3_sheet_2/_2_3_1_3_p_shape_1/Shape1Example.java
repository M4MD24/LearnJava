package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_p_shape_1;

import java.util.Scanner;

/**
 * <h1>P. Shape 1</h1>
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
 * <h2>Given a number N. Print a face down right angled triangle that has N rows.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4</h2>
 * <h1>Output:</h1>
 * <h2>
 * ****
 * <br/>
 * ***
 * <br/>
 * **
 * <br/>
 * *
 * </h2>
 */
public class Shape1Example {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGUMENTS) {
        final int TARGET_NUMBER = INPUT.nextInt();
        printPyramidsStarts(TARGET_NUMBER);
    }

    private static void printPyramidsStarts(int targetNumber) {
        while (targetNumber > 0) {
            for (int index = targetNumber; index > 0; index--) System.out.print('*');
            if (targetNumber > 1) System.out.println();
            targetNumber--;
        }
    }
}