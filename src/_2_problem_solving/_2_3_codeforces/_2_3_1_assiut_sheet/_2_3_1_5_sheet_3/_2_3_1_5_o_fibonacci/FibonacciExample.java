package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_o_fibonacci;

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
 * <h2>Given a number N. Print the Fibonacci number of N.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>In order to create the Fibonacci sequence use the following function:</h2>
 * <ul>
 *     <li>fib(1) = 0.</li>
 *     <li>fib(2) = 1.</li>
 *     <li>fib(n) = fib(n - 1) + fib(n - 2).</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1</h2>
 * <h1>Output:</h1>
 * <h2>0</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5</h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 */

public class FibonacciExample {
    public static void main(String[] args) {
        System.out.print(getFibonacci(new Scanner(System.in).nextByte()));
    }

    private static long getFibonacci(byte length) {
        long firstNumber = 0,
                secondNumber = 1;
        if (length == 1) return firstNumber;
        else if (length == 2) return secondNumber;
        else {
            while (length-- > 2) {
                long fibonacci = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = fibonacci;
            }
            return secondNumber;
        }
    }
}