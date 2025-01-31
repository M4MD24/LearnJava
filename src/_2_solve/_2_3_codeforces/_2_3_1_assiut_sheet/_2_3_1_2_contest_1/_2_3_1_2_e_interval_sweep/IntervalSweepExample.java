package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_2_contest_1._2_3_1_2_e_interval_sweep;

import java.util.Scanner;

/**
 * <h1>E. Interval Sweep</h1>
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
 * <h2>Given two numbers a and b. You have to answer with "YES" if there is a non-empty interval consisting of numbers from l to r (l,l+1,l+2,...,r) with a odd numbers and b even numbers, or "NO" otherwise.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2 3</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 1</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class IntervalSweepExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        final long NUMBER_1 = INPUT.nextLong(),
                NUMBER_2 = INPUT.nextLong();
        System.out.print(isEmpty(NUMBER_1, NUMBER_2));
    }

    private static String isEmpty(long NUMBER_1, long NUMBER_2) {
        return ((NUMBER_1 + NUMBER_2 >= 3) && (Math.abs(NUMBER_1 - NUMBER_2) <= 1)) ? "YES" : "NO";
    }
}