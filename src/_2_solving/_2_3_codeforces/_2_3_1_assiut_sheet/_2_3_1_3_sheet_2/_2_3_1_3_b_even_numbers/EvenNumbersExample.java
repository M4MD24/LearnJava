package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_b_even_numbers;

import java.util.Scanner;

/**
 * <h1>B. Even Numbers</h1>
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
 * <h2>Given a number N. Print all even numbers between 1 and N inclusive in separate lines.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10</h2>
 * <h1>Output:</h1>
 * <h2>
 * 2
 * <br/>
 * 4
 * <br/>
 * 6
 * <br/>
 * 8
 * <br/>
 * 10
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5</h2>
 * <h1>Output:</h1>
 * <h2>
 * 2
 * <br/>
 * 4
 * </h2>
 */

public class EvenNumbersExample {
    public static void main(final String[] ARGS) {
        final Scanner INPUT = new Scanner(System.in);
        final int TARGET_NUMBER = INPUT.nextInt();
        printEvenNumbers(TARGET_NUMBER);
    }

    private static void printEvenNumbers(final int TARGET_NUMBER) {
        if (TARGET_NUMBER > 1) {
            for (int index = 1; index <= TARGET_NUMBER; index++) {
                if (index % 2 == 0) {
                    System.out.print(index);
                    if (index < TARGET_NUMBER - 1) System.out.println();
                }
            }
        } else System.out.print(-1);
    }
}