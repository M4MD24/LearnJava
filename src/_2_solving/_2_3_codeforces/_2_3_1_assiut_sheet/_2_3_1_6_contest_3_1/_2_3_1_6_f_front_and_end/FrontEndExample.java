package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_6_contest_3_1._2_3_1_6_f_front_and_end;

import java.util.Scanner;

/**
 * <h1>F. Front - End</h1>
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
 * <h2>You are given an array a of n integers, your task is to print the first (front) element then remove it, then print the last(end) element then remove it, and so on until the array becomes empty.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 2 3 4 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>1 5 2 4 3</h2>
 */

public class FrontEndExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LENGTH = INPUT.nextInt();
    private static final int[] NUMBERS = new int[LENGTH];

    public static void main(final String[] ARGS) {
        inputValues();
        printFrontAndEnd();
    }

    private static void printFrontAndEnd() {
        final int MIDDLE = LENGTH / 2;
        int index = 0;
        while (index != MIDDLE) {
            System.out.print(NUMBERS[index] + " ");
            if (index < MIDDLE) index = LENGTH - 1 - index;
            else index = LENGTH - 1 - index + 1;
        }
        System.out.print(NUMBERS[index]);
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) NUMBERS[index] = INPUT.nextInt();
    }
}