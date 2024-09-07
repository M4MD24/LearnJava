package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_m_divisible;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <h1>M. Divisible</h1>
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
 * <h2>Given two numbers N and X. Determine whether N is divisible by X or not.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>15 3</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10 7</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class DivisibleExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print((new BigInteger(INPUT.next()).divide(new BigInteger(String.valueOf(INPUT.nextInt()))).equals(BigInteger.valueOf(0)))
                ? "YES"
                : "NO");
    }
}