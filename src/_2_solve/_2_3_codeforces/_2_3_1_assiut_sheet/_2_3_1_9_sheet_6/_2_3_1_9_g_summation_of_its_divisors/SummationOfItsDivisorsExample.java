package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_g_summation_of_its_divisors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>G. Summation of its divisors</h1>
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
 * <h2>Given a number N. Print the Summation of its divisors.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>12</h2>
 * <h1>Output:</h1>
 * <h2>28</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>9</h2>
 * <h1>Output:</h1>
 * <h2>13</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first example:
 * <br/>
 * The divisors of 12 are [1, 2, 3, 4, 6, 12].
 * <br/>
 * Then the result will be 1 + 2 + 3 + 4 + 6 + 12 = 28.
 * </h2>
 */

public class SummationOfItsDivisorsExample {
    public static void main(final String[] ARGUMENTS) throws IOException {
        System.out.print(summationOfItsDivisors(Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

    private static long summationOfItsDivisors(final long NUMBER) {
        long sum = 0;
        for (int divisor = 1; divisor <= Math.sqrt(NUMBER); divisor++) {
            if (NUMBER % divisor == 0) {
                sum += divisor;
                if (divisor != Math.sqrt(NUMBER))
                    sum += NUMBER / divisor;
            }
        }
        return sum;
    }
}