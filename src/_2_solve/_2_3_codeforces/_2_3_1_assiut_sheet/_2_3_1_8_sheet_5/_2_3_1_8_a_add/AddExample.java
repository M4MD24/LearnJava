package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_a_add;

import java.util.Scanner;

/**
 * <h1>A. Add</h1>
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
 * <h1>Problem:</h1>
 * <h2>Given two numbers X and Y, Print their summation.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using function and don't use built-in function.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 2</h2>
 * <h1>Output:</h1>
 * <h2>7</h2>
 */

public class AddExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(addition(INPUT.nextInt(), INPUT.nextInt()));
    }

    private static int addition(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        return FIRST_NUMBER + SECOND_NUMBER;
    }
}