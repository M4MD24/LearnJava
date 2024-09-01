package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_j_primes_from_one_to_number;

import java.util.Scanner;

/**
 * <h1>J. Primes One to Number</h1>
 * <h2>
 * time limit per test: 3 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * Given a number N Print all prime numbers between 1 and N inclusive.
 * <br/>
 * A prime number is a number that is greater than 1 and has only two factors which are 1 and itself.
 * <br/>
 * In other words : prime number divisible only by 1 and itself.
 * <br/>
 * Be careful that 1 is not prime .
 * <br/>
 * The first few prime numbers are
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10</h2>
 * <h1>Output:</h1>
 * <h2>2 3 5 7</h2>
 */

public class PrimesFromOneToNumberExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGS) {
        final long TARGET_NUMBER = INPUT.nextLong();
        printPrimesNumbersToNumber(TARGET_NUMBER);
    }

    private static void printPrimesNumbersToNumber(final long TARGET_NUMBER) {
        for (int number = 2; number <= TARGET_NUMBER; number++)
            if (isPrime(number)) System.out.print(number + " ");
    }

    private static boolean isPrime(final long NUMBER) {
        if (NUMBER > 1)
            for (long index = NUMBER - 1; index > 1; index--)
                if (NUMBER % index == 0) return false;
        return true;
    }
}