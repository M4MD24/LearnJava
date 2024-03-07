package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_o_pyramids;

import java.util.Scanner;

/**
 * <h1>O. Pyramids</h1>
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
 * <h2>Given a number N. Print a left angled triangle that has N rows.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4</h2>
 * <h1>Output:</h1>
 * <h2>
 * *
 * <br/>
 * **
 * <br/>
 * ***
 * <br/>
 * ****
 * </h2>
 */
public class PyramidsExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        final int TARGET_NUMBER = INPUT.nextInt();
        printPyramidsStarts(TARGET_NUMBER);
    }

    private static void printPyramidsStarts(final int TARGET_NUMBER) {
        for (int round = 1; round <= TARGET_NUMBER; round++) {
            for (int index = 0; index < round; index++) System.out.print('*');
            if (round < TARGET_NUMBER) System.out.println();
        }
    }
}