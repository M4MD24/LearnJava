package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_k_divirors;

import java.util.Scanner;

/**
 * <h1>K. Divisors</h1>
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
 * <h2>Given a number N. Print all the divisors of N in ascending order.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>6</h2>
 * <h1>Output:</h1>
 * <h2>
 * 1
 * <br/>
 * 2
 * <br/>
 * 3
 * <br/>
 * 6
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>7</h2>
 * <h1>Output:</h1>
 * <h2>
 * 1
 * <br/>
 * 7
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4</h2>
 * <h1>Output:</h1>
 * <h2>
 * 1
 * <br/>
 * 2
 * <br/>
 * 4
 * </h2>
 */

public class DivisorsExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        final long TARGET_NUMBER = INPUT.nextLong();
        printDivisorsToNumber(TARGET_NUMBER);
    }

    private static void printDivisorsToNumber(final long TARGET_NUMBER) {
        for (int divisor = 1; divisor <= TARGET_NUMBER; divisor++)
            if (TARGET_NUMBER % divisor == 0) {
                System.out.print(divisor);
                if (divisor != TARGET_NUMBER) System.out.println();
            }
    }
}