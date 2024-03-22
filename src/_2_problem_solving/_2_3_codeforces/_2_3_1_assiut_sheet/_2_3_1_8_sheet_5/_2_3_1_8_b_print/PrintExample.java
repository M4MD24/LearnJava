package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_b_print;

import java.util.Scanner;

/**
 * <h1>B. Print</h1>
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
 * <h1>Question:</h1>
 * <h2>Given a number N. Print all numbers from 1 to N.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ol>
 *     <li>Solve this problem using function</li>
 *     <li>Don't use any leading or trilling spaces.</li>
 * </ol>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5</h2>
 * <h1>Output:</h1>
 * <h2>1 2 3 4 5</h2>
 */

public class PrintExample {
    public static void main(String[] args) {
        printAllNumbersFrom1ToTargetNumber(new Scanner(System.in).nextShort());
    }

    private static void printAllNumbersFrom1ToTargetNumber(final short TARGET_NUMBER) {
        for (short number = 1; number <= TARGET_NUMBER; number++) {
            System.out.print(number);
            if (number < TARGET_NUMBER) System.out.print(" ");
        }
    }
}