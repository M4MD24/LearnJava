package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_q_digits;

import java.util.Scanner;

/**
 * <h1>Q. Digits</h1>
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
 * <h2>Given a number N. Print the digits of that number from right to left separated by space.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 121
 * <br/>
 * 39
 * <br/>
 * 123456
 * <br/>
 * 1200
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 1 2 1
 * <br/>
 * 9 3
 * <br/>
 * 6 5 4 3 2 1
 * <br/>
 * 0 0 2 1
 * </h2>
 */
public class DigitsExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGS) {
        final int LENGTH = INPUT.nextInt();
        inputValues(LENGTH);
    }

    private static void inputValues(final int LENGTH) {
        for (int index = 0; index < LENGTH; index++) {
            final int NUMBER = INPUT.nextInt();
            printReversesNumber(NUMBER);
            if (index < LENGTH - 1) System.out.println();
        }
    }

    private static void printReversesNumber(int number) {
        String numberString = Integer.toString(number);
        for (int index = numberString.length() - 1; index >= 0; index--) System.out.print(numberString.charAt(index) + " ");
    }
}