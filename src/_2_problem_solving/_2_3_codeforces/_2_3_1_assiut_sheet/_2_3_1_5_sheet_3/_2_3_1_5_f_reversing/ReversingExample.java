package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_f_reversing;

import java.util.Scanner;

/**
 * <h1>F. Reversing</h1>
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
 * <h2>Given a number N and an array A of N numbers. Print the array in a reversed order.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Don't use built-in-functions.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 5 1 3 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>2 3 1 5</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 2 3 4 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>5 4 3 2 1</h2>
 */

public class ReversingExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static short length = INPUT.nextShort();
    private static final int[] NUMBERS = new int[length];

    public static void main(final String[] ARGS) {
        inputValues();
        printReverseValues();
    }

    private static void printReverseValues() {
        while (length-- > 0) {
            System.out.print(NUMBERS[length]);
            if (length > 0) System.out.print(" ");
        }
    }

    private static void inputValues() {
        for (int index = 0; index < length; index++) NUMBERS[index] = INPUT.nextInt();
    }
}