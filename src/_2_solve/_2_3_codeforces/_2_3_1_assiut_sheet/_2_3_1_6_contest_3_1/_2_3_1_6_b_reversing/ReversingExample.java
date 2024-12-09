package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_6_contest_3_1._2_3_1_6_b_reversing;

import java.util.Scanner;

/**
 * <h1>B. Reversing</h1>
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
 * <h1>Problem:</h1>
 * <h2>
 * You are given an array a of n integers. we want to make some operations on it.
 * <br/>
 * The operation is at each element that is equal to Zero - starting from the beginning of the array-, reverse the order of all elements before it.
 * <br/>
 * What is the final order of this array?
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 7
 * <br/>
 * 1 2 0 4 0 5 6
 * </h2>
 * <h1>Output:</h1>
 * <h2>4 0 1 2 0 5 6</h2>
 */

public class ReversingExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LENGTH = INPUT.nextInt();
    private static final int[] NUMBERS = new int[LENGTH];

    public static void main(final String[] PARAMETERS) {
        inputNumbers();
        reverseNumbersFromZeroToAnotherZero();
        printNumbers();
    }

    private static void printNumbers() {
        for (int index = 0; index < LENGTH; index++) {
            System.out.print(NUMBERS[index]);
            if (index < LENGTH - 1) System.out.print(" ");
        }
    }

    private static void reverseNumbersFromZeroToAnotherZero() {
        for (int index = 0; index < LENGTH; index++) {
            if (NUMBERS[index] == 0 && index != 0) {
                final int MIDDLE = index / 2;
                for (int start = 0, end = index - 1; start < MIDDLE; start++, end--)
                    swap(start, end);
            }
        }
    }

    private static void swap(final int FIRST, final int SECOND) {
        NUMBERS[FIRST] += NUMBERS[SECOND];
        NUMBERS[SECOND] = NUMBERS[FIRST] - NUMBERS[SECOND];
        NUMBERS[FIRST] -= NUMBERS[SECOND];
    }

    private static void inputNumbers() {
        for (int index = 0; index < LENGTH; index++) NUMBERS[index] = INPUT.nextInt();
    }
}