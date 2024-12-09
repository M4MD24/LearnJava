package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_a_power_of_two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>A. Power of Two</h1>
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
 * <h2>Given a number N. Determine whether N is power of 2 or not.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>8</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class PowerOfTwoExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        System.out.print(isPowerOfTwo(Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

    private static String isPowerOfTwo(final long TARGET_NUMBER) {
        return ((Math.log10(TARGET_NUMBER) / Math.log10(2)) % 1 == 0) ? "YES" : "NO";
    }
}