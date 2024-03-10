package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_v_pum;

import java.util.Scanner;

/**
 * <h1>V. Pum</h1>
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
 * <h2>Given a number N. Print N lines that describes PUM game.</h2>
 * <br/>
 * <<h1>Note:</h1>
 * <h2>Don't print any extra spaces.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>7</h2>
 * <h1>Output:</h1>
 * <h2>
 * 1 2 3 PUM
 * <br/>
 * 5 6 7 PUM
 * <br/>
 * 9 10 11 PUM
 * <br/>
 * 13 14 15 PUM
 * <br/>
 * 17 18 19 PUM
 * <br/>
 * 21 22 23 PUM
 * <br/>
 * 25 26 27 PUM
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3</h2>
 * <h1>Output:</h1>
 * <h2>
 * 1 2 3 PUM
 * <br/>
 * 5 6 7 PUM
 * <br/>
 * 9 10 11 PUM
 * </h2>
 */

public class PumExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        final int TARGET_NUMBER = INPUT.nextInt();
        printPUMS(TARGET_NUMBER);
    }

    private static void printPUMS(final int TARGET_NUMBER) {
        for (int round = 0, index = 1, end = 5; round < TARGET_NUMBER; round++, end += 4) {
            while (index < end) {
                if (index % 4 != 0) System.out.print(index + " ");
                else {
                    System.out.print("PUM");
                    if (round != TARGET_NUMBER - 1) System.out.println();
                }
                index++;
            }
        }
    }
}