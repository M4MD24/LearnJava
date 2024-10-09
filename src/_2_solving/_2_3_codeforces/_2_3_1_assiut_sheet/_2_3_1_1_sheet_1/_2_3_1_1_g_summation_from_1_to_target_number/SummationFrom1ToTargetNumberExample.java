package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_g_summation_from_1_to_target_number;

import java.util.Scanner;

/**
 * <h1>G. Summation From 1 to Target Number</h1>
 * <h2>
 * time limit per test: 0.25 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given a number N Print the summation of the numbers that is between 1 and target number (inclusive).</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3</h2>
 * <h1>Output:</h1>
 * <h2>6</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10</h2>
 * <h1>Output:</h1>
 * <h2>55</h2>
 */

public class SummationFrom1ToTargetNumberExample {
    private static final Scanner input = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        final int TARGET_NUMBER = input.nextInt();
        long sum = (long) TARGET_NUMBER * (TARGET_NUMBER + 1) / 2;
        System.out.print(sum);
    }
}