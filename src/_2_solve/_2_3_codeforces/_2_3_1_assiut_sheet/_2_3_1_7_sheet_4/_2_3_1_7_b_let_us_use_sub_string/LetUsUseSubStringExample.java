package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_b_let_us_use_sub_string;

import java.util.Scanner;

/**
 * <h1>B. Let's use Sub-string</h1>
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
 * <h1>Problem:</h1>
 * <h2>Given a string S. Print the string S from the beginning to the first '\' character without printing the '\'.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>Egyptian collegiate programming\ contest</h2>
 * <h1>Output:</h1>
 * <h2>Egyptian collegiate programming</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>google \or facebook</h2>
 * <h1>Output:</h1>
 * <h2>google </h2>
 */

public class LetUsUseSubStringExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final String TEXT = INPUT.nextLine();
        System.out.print(TEXT.substring(0, TEXT.indexOf("\\")));
    }
}