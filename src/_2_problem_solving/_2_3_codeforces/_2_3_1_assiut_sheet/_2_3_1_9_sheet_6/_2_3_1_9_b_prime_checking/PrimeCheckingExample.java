package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_b_prime_checking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>B. Prime Checking</h1>
 * <h2>
 * time limit per test: 4 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a number N. Determine whether N is Prime or Not.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1007</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>12</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class PrimeCheckingExample {
    public static void main(final String[] ARGS) throws IOException {
        System.out.print(isPrime(Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

    private static String isPrime(final long TARGET_NUMBER) {
        if (TARGET_NUMBER == 2) return "YES";
        if (TARGET_NUMBER == 1 || TARGET_NUMBER % 2 == 0) return "NO";
        for (long index = 3; index * index <= TARGET_NUMBER; index += 2)
            if (TARGET_NUMBER % index == 0)
                return "NO";
        return "YES";
    }
}