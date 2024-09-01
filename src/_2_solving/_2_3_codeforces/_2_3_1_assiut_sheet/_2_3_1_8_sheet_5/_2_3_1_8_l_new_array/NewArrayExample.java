package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_l_new_array;

import java.util.Scanner;

/**
 * <h1>L. New Array</h1>
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
 * <h2>Given two arrays A and B of size N. Print a new array C that holds the concatenation of array B followed by array A.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using function</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * 1 2
 * <br/>
 * 3 4
 * </h2>
 * <h1>Output:</h1>
 * <h2>3 4 1 2 </h2>
 */

public class NewArrayExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static short length = (short) (INPUT.nextShort() * 2);
    private static final int[] NUMBERS = new int[length];

    public static void main(final String[] ARGS) {
        inputValues();
        printValues();
    }

    private static void printValues() {
        for (int number : NUMBERS) System.out.print(number + " ");
    }

    private static void inputValues() {
        for (int index = length / 2; index < length; index++)
            NUMBERS[index] = INPUT.nextInt();
        length /= 2;
        for (int index = 0; index < length; index++)
            NUMBERS[index] = INPUT.nextInt();
    }
}