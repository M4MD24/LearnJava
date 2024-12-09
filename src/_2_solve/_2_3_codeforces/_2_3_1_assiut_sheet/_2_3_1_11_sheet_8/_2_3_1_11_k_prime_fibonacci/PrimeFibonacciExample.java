package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_k_prime_fibonacci;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <h1>K. Prime Fibonacci</h1>
 * <h2>
 * time limit per test: 0.25 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>
 * This problem is merging between prime and Fibonacci problems, but believe me, you will like it :)
 * <br/>
 * Given a number N. your task is to calculate the value of the nth number in the Fibonacci sequence and check whether this number is prime or not.
 * <br/>
 * You may have forgotten how to build a Fibonacci sequence so in order to build it use the following function:
 * </h2>
 * <ul>
 *     <li>F1=0</li>
 *     <li>F2=1</li>
 *     <li>Fn=Fn−1+Fn−2</li>
 * </ul>
 * <br/>
 * <h1>Note:</h1>
 * <h2>you have to answer several test cases, so you have to write efficient code.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 1
 * <br/>
 * 5
 * <br/>
 * 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * not prime
 * <br/>
 * prime
 * <br/>
 * not prime
 * </h2>
 */

public class PrimeFibonacciExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(final String[] PARAMETERS) throws IOException {
        inputValues();
        OUTPUT.flush();
    }

    private static void inputValues() throws IOException {
        int countOfTestCases = Integer.parseInt(INPUT.readLine());
        while (countOfTestCases-- > 0)
            OUTPUT.write((isPrime(Byte.parseByte(INPUT.readLine())) ? "prime" : "not prime") + "\n");
    }

    private static boolean isPrime(final byte NUMBER) {
        final byte[] IS_PRIME = new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0};
        return IS_PRIME[NUMBER] == 1;
    }
}