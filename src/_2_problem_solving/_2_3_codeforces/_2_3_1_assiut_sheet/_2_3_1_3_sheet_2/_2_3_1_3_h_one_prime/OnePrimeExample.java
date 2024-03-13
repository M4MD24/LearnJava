package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_h_one_prime;

import java.util.Scanner;

/**
 * <h1>H. One Prime</h1>
 * <h2>
 * time limit per test: 3 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a number X. Determine if the number is prime or not</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>7</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>15</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class OnePrimeExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        final long NUMBER = INPUT.nextLong();
        System.out.print(isPrime(NUMBER));
    }

    private static String isPrime(final long NUMBER) {
        if (NUMBER > 1)
            for (long index = NUMBER - 1; index > 1; index--)
                if (NUMBER % index == 0) return "NO";
        return "YES";
    }
}