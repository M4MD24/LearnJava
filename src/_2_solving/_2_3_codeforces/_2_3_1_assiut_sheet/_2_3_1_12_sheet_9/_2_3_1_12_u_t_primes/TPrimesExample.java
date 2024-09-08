package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_u_t_primes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>U. T-primes</h1>
 * <h2>
 * time limit per test: 2 second
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
 * We know that prime numbers are positive integers that have exactly two distinct positive divisors. Similarly, we'll call a positive integer t Т-prime, if t has exactly three distinct positive divisors.
 * <br/>
 * You are given an array of n positive integers. For each of them determine whether it is Т-prime or not.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 4 5 6
 * </h2>
 * <h1>Output</h1>
 * <h2>
 * YES
 * <br/>
 * NO
 * <br/>
 * NO
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>The given test has three numbers. The first number 4 has exactly three divisors — 1, 2 and 4, thus the answer for this number is "YES". The second number 5 has two divisors (1 and 5), and the third number 6 has four divisors (1, 2, 3, 6), hence the answer for them is "NO".</h2>
 */

public class TPrimesExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(final String[] PARAMETERS) throws IOException {
        inputValues();
        OUTPUT.flush();
    }

    private static void inputValues() throws IOException {
        int countOfTestCases = Integer.parseInt(INPUT.readLine());
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        while (countOfTestCases-- > 0) OUTPUT.write((isTPrime(Long.parseLong(LINE.nextToken())) ? "YES" : "NO") + "\n");
    }

    private static boolean isTPrime(final long NUMBER) {
        final long NUMBER_WITHOUT_DECIMAL_NUMBERS = (long) Math.sqrt(NUMBER);
        if (isPrime(NUMBER_WITHOUT_DECIMAL_NUMBERS)) return NUMBER_WITHOUT_DECIMAL_NUMBERS * NUMBER_WITHOUT_DECIMAL_NUMBERS == NUMBER;
        else return false;
    }

    private static boolean isPrime(final long NUMBER) {
        if (NUMBER == 1) return false;
        else if (NUMBER == 2 || NUMBER == 3) return true;
        else if (NUMBER % 2 == 0 || NUMBER % 3 == 0) return false;
        else {
            for (long index = 5; index * index <= NUMBER; index += 2)
                if (NUMBER % index == 0 || (NUMBER % (index + 2)) == 0) return false;
            return true;
        }
    }
}