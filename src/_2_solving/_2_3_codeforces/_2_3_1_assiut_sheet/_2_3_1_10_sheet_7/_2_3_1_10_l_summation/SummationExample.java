package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_l_summation;

import java.util.Scanner;

/**
 * <h1>L. Summation</h1>
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
 * <h2>Given a number N and an array A of N numbers. Print the summation of the array elements.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 1 4 2 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>14</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 5 5 5 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>20</h2>
 */

public class SummationExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static short targetNumber = INPUT.nextShort();
    private static long total = INPUT.nextInt();

    public static void main(final String[] PARAMETERS) {
        System.out.print(inputValuesRecursion());
    }

    private static long inputValuesRecursion() {
        if (targetNumber-- > 1) {
            total += INPUT.nextInt();
            return inputValuesRecursion();
        } else return total;
    }
}