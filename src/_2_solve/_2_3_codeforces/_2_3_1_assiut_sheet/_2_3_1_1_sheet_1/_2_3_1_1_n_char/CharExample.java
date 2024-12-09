package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_n_char;

import java.util.Scanner;

/**
 * <h1>N. Char</h1>
 * <h2>
 * time limit per test: 0.25 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given a letter X. If the letter is lowercase print the letter after converting it from lowercase letter to uppercase letter. Otherwise print the letter after converting it from uppercase letter to lowercase letter</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>a</h2>
 * <h1>Output:</h1>
 * <h2>A</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>A</h2>
 * <h1>Output:</h1>
 * <h2>a</h2>
 */

public class CharExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LETTER = INPUT.next().charAt(0);
    private static final boolean CONDITION_CAPITAL = LETTER > 64 && LETTER < 91;
    private static final char CHANGE_CASE = (char) ((CONDITION_CAPITAL) ? LETTER + 32 : LETTER - 32);

    public static void main(final String[] PARAMETERS) {
        System.out.print(CHANGE_CASE);
    }
}