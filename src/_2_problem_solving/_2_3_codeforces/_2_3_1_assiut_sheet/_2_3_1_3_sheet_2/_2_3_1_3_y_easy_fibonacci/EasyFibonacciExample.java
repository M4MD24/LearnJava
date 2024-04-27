package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_y_easy_fibonacci;

import java.util.Scanner;

/**
 * <h1>X. Easy Fibonacci</h1>
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
 * <h2>Given a number N. Print first N numbers of the Fibonacci sequence.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>In order to create the Fibonacci sequence use the following function:</h2>
 * <ul>
 *     <li>fib(1) = 0</li>
 *     <li>fib(2) = 1</li>
 *     <li>fib(n) = fib(n - 1) + fib(n - 2)</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>7</h2>
 * <h1>Output:</h1>
 * <h2>0 1 1 2 3 5 8</h2>
 */

public class EasyFibonacciExample {
    private static final Scanner INPUT = new Scanner(System.in);
    final static int LENGTH = INPUT.nextInt();
    private static final int[] FIBONACCI_ARRAY = new int[LENGTH + 1];

    public static void main(final String[] ARGS) {
        printFibonacci();
    }

    private static void printFibonacci() {
        for (int index = 1; index <= LENGTH; index++) {
            System.out.print(fibonacci(index));
            if (index != LENGTH) System.out.print(" ");
        }
    }

    private static int fibonacci(int number) {
        if (number == 1) return 0;
        else if (number == 2) return 1;
        else {
            if (FIBONACCI_ARRAY[number] != 0) return FIBONACCI_ARRAY[number];
            FIBONACCI_ARRAY[number] = fibonacci(number - 1) + fibonacci(number - 2);
            return FIBONACCI_ARRAY[number];
        }
    }
}