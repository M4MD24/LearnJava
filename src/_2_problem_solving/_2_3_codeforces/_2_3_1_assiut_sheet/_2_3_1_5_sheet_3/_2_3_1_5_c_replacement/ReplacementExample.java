package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_c_replacement;

import java.util.Scanner;

/**
 * <h1>C. Replacement</h1>
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
 * <h2>Given a number N and an array A of N numbers. Print the array after doing the following operations:</h2>
 * <br/>
 * <ul>
 *     <li>Replace every positive number by 1.</li>
 *     <li>Replace every negative number by 2.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 -2 0 3 4
 * </h2>
 * <h1>Output:</h1>
 * <h2>1 2 0 1 1</h2>
 */

public class ReplacementExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();
    private static final int[] NUMBERS = new int[LENGTH];

    public static void main(String[] args) {
        inputValues();
        replacementEveryNumber();
        printValues();
    }

    private static void printValues() {
        for (int index = 0; index < LENGTH; index++) {
            System.out.print(NUMBERS[index]);
            if (index < LENGTH - 1) System.out.print(" ");
        }
    }

    private static void replacementEveryNumber() {
        for (int index = 0; index < LENGTH; index++) {
            if (NUMBERS[index] > 0) NUMBERS[index] = 1;
            else if (NUMBERS[index] < 0) NUMBERS[index] = 2;
        }
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) NUMBERS[index] = INPUT.nextInt();
    }
}