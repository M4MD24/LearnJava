package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_g_factorial;

import java.util.Scanner;

/**
 * <h1>G. Factorial</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given a number N. Print the factorial of number N.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * 5
 * <br/>
 * 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 120
 * <br/>
 * 6
 * </h2>
 */

public class FactorialExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGUMENTS) {
        final long LENGTH = INPUT.nextLong();
        printFactorialValues(LENGTH);
    }

    private static void printFactorialValues(long length) {
        while (length-- > 0) {
            final long NUMBER = INPUT.nextLong();
            long multiplication = 1;
            for (int index = 2; index <= NUMBER; index++) multiplication *= index;
            System.out.println(multiplication);
        }
    }
}