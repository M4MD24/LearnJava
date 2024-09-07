package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_z_hard_compare;

import java.util.Scanner;

/**
 * <h1>Z. Hard Compare</h1>
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
 * <h2>Given 4 numbers A,B,C and D, If A^B > C^D print "YES" otherwise, print "NO".</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 2 5 4</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 2 4 2</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 2 5 2</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class HardCompareExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final long NUMBER_1 = INPUT.nextLong(),
                NUMBER_2 = INPUT.nextLong(),
                NUMBER_3 = INPUT.nextLong(),
                NUMBER_4 = INPUT.nextLong();
        final double result1 = Math.log(NUMBER_1) * NUMBER_2,
                result2 = Math.log(NUMBER_3) * NUMBER_4;
        System.out.print((result1 > result2) ? "YES" : "NO");
    }
}