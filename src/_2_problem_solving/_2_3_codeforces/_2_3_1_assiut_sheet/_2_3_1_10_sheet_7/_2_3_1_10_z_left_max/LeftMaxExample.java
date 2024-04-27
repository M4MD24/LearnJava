package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_z_left_max;

import java.util.Scanner;

/**
 * <h1>Z. Left Max</h1>
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
 * <h2>Given a number N and an array A of N numbers, print the maximum in the range from 1 to i for each i≤ N.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 4 3 5 7 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>4 4 5 7 7 </h2>
 */

public class LeftMaxExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int length = INPUT.nextInt();
    private static int maximumInRangeFromOneToIndex = INPUT.nextInt();

    public static void main(final String[] ARGS) {
        printMaximumInRangeFromOneToIndex();
        inputValuesRecursion();
    }

    private static void inputValuesRecursion() {
        if (length-- > 1) {
            maximumInRangeFromOneToIndex = Math.max(maximumInRangeFromOneToIndex, INPUT.nextInt());
            printMaximumInRangeFromOneToIndex();
            inputValuesRecursion();
        }
    }

    private static void printMaximumInRangeFromOneToIndex() {
        System.out.print(maximumInRangeFromOneToIndex + " ");
    }
}