package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_w_shape_3;

import java.util.Scanner;

/**
 * <h1>W. Shape 3</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input standard input
 * <br/>
 * output standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a number N. Print a pyramid that has N rows.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4</h2>
 * <h1>Output:</h1>
 */
/*
 *    *
 *   ***
 *  *****
 * *******
 * *******
 *  *****
 *   ***
 *    *
 */
public class Shape3Example {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        final int TARGET_NUMBER = INPUT.nextInt();
        printPyramidsStarts(TARGET_NUMBER);
        printReversePyramidsStarts(TARGET_NUMBER);
    }

    private static void printReversePyramidsStarts(final int TARGET_NUMBER) {
        int maximumDigits = 1;
        for (int index = 1; index < TARGET_NUMBER; index++, maximumDigits += 2) ;
        for (int spaces = 0, stars = maximumDigits; stars > 0; spaces++, stars -= 2) {
            System.out.print(" ".repeat(spaces) + "*".repeat(stars));
            if (stars > 1) System.out.println();
        }
    }

    private static void printPyramidsStarts(final int TARGET_NUMBER) {
        int maximumDigits = 1;
        for (int index = 0; index < TARGET_NUMBER; index++, maximumDigits += 2) ;
        int middleDigits = (maximumDigits / 2) + 1;
        for (int spaces = middleDigits - 2, stars = 1; stars < maximumDigits; spaces--, stars += 2) System.out.println(" ".repeat(spaces) + "*".repeat(stars));
    }
}