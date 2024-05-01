package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_o_fibonacci;

import java.util.Scanner;

/**
 * <h1>O. Fibonacci</h1>
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
 * <h2>Given a number N. Print the value of the Nth Fibonacci number.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5</h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 *
 * @see _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_o_fibonacci.images <h2>Figure 1</h2>
 */

public class FibonacciExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int firstNumber = 0,
            secondNumber = 1;

    public static void main(final String[] ARGS) {
        System.out.print(getFibonacci(INPUT.nextByte()));
    }

    private static int getFibonacci(byte length) {
        if (length == 1) return firstNumber;
        else if (length == 2) return secondNumber;
        else {
            final int FIBONACCI = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = FIBONACCI;
            if (length-- > 2) getFibonacci(length);
        }
        return secondNumber;
    }
}