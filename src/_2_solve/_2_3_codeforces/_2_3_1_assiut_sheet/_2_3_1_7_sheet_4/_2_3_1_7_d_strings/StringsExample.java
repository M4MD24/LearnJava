package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_d_strings;

import java.util.Scanner;

/**
 * <h1>D. Strings</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given two strings A and B. Print three lines contain the following:</h2>
 * <ul>
 *     <li>The size of the string A and size of the string B separated by a space</li>
 *     <li>The string produced by concatenating A and B (A+B).</li>
 *     <li>The two strings separated by a single space respectively, after swapping their first character.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * abcd
 * <br/>
 * ef
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 4 2
 * <br/>
 * abcdef
 * <br/>
 * ebcd af
 * </h2>
 */

public class StringsExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final String FIRST_TEXT = INPUT.next(),
                SECOND_TEXT = INPUT.next();
        System.out.println(FIRST_TEXT.length() + " " + SECOND_TEXT.length());
        System.out.println(FIRST_TEXT + SECOND_TEXT);
        System.out.printf("%s %s",
                SECOND_TEXT.charAt(0) + FIRST_TEXT.substring(1),
                FIRST_TEXT.charAt(0) + SECOND_TEXT.substring(1));
    }
}