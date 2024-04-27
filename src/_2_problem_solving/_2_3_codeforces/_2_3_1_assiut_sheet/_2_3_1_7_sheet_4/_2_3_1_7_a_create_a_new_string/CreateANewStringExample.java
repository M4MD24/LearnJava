package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_a_create_a_new_string;

import java.util.Scanner;

/**
 * <h1>A. Create A New String</h1>
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
 * <h2>Given two strings S and T. Print 2 lines that contain the following in the same order:</h2>
 * <ul>
 *     <li>Print the length of S and T separated by space.</li>
 *     <li>Print a new string that contains S and T separated by a space.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * LEVEL
 * <br/>
 * ONE
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 5 3
 * <br/>
 * LEVEL ONE
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * Programming
 * <br/>
 * contest
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 11 7
 * <br/>
 * Programming contest
 * </h2>
 */

public class CreateANewStringExample {
    public static void main(final String[] ARGS) {
        final Scanner INPUT = new Scanner(System.in);
        final String FIRST_TEXT = INPUT.next(),
                SECOND_TEXT = INPUT.next();
        System.out.printf("%d %d\n",
                FIRST_TEXT.length(),
                SECOND_TEXT.length());
        System.out.printf("%s %s",
                FIRST_TEXT,
                SECOND_TEXT);
    }
}