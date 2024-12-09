package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_j_factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>J. Factorial</h1>
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
 * <h2>Given a number N. Print factorial of N.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5</h2>
 * <br/>
 * <h1>Output:</h1>
 * <h2>120</h2>
 */

public class FactorialExample {
    private static final byte TARGET_NUMBER;

    static {
        try {
            TARGET_NUMBER = Byte.parseByte(new BufferedReader(new InputStreamReader(System.in)).readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(final String[] PARAMETERS) {
        System.out.print(factorialRecursion(1L, (byte) 2));
    }

    private static long factorialRecursion(long multiplication, byte index) {
        if (index <= TARGET_NUMBER) return factorialRecursion(multiplication * index++, index);
        else return multiplication;
    }
}