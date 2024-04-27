package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_j_prime_factors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>J. Prime Factors</h1>
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
 * <h2>Given a number N. Print the prime factors of N in the following form: (P1)x * (P2)y * (P3)z * ...</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * P1, P2, ..., Pi are prime factors of N.
 * <br/>
 * For example: if N = 1260: 1260 = 2*2*3*3*5*7 then print (2^2)*(3^2)*(5^1)*(7^1).
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1260</h2>
 * <h1>Output:</h1>
 * <h2>(2^2)*(3^2)*(5^1)*(7^1)</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1677060</h2>
 * <h1>Output:</h1>
 * <h2>(2^2)*(3^2)*(5^1)*(7^1)*(11^3)</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1299721</h2>
 * <h1>Output:</h1>
 * <h2>(1299721^1)</h2>
 */

public class PrimeFactorsExample {
    public static void main(final String[] ARGS) throws IOException {
        printPrimeFactors(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
    }

    private static void printPrimeFactors(int targetNumber) {
        for (short number = 2; number * number <= targetNumber; number++) {
            byte power = 0;
            while (targetNumber % number == 0) {
                power += 1;
                targetNumber /= number;
            }
            if (power != 0) {
                System.out.printf("(%d^%d)", number, power);
                if (targetNumber != 1)
                    System.out.print("*");
            }
        }
        if (targetNumber > 1)
            System.out.printf("(%d^1)", targetNumber);
    }
}