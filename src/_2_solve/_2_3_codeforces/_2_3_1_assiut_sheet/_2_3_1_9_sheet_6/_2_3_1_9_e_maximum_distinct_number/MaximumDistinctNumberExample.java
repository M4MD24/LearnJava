package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_e_maximum_distinct_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>E. Maximum Distinct Numbers</h1>
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
 * <h2>Given a number N. Print the maximum number of distinct numbers that their summation is less than or equal to N.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>15</h2>
 * <h1>Output:</h1>
 * <h2>5</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>8</h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first example:
 * <br/>
 * 1 + 2 + 3 + 4 + 5 equal 15 which is ≤ N
 * <br/>
 * In the second example:
 * <br/>
 * 1+2+3 equal 6 which is ≤ N
 * </h2>
 */

public class MaximumDistinctNumberExample {
    public static void main(final String[] ARGUMENTS) throws IOException {
        System.out.print(maximumDistinctNumber(Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

    private static long maximumDistinctNumber(final long TARGET_NUMBER) {
        if (TARGET_NUMBER == 1 || TARGET_NUMBER == 2) return TARGET_NUMBER;
        long index = 2,
                sum = 1;
        while (true)
            if (sum + index <= TARGET_NUMBER) sum += index++;
            else return index - 1;
    }
}