package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_c_compare;

import java.util.Scanner;

/**
 * <h1>C. Compare</h1>
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
 * <h2>Given two strings X and Y . Print the smallest lexicographical one.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Lexicographical is the way of ordering the words based on the alphabetical order of their component letters.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * acm
 * <br/>
 * acpc
 * </h2>
 * <h1>Output:</h1>
 * <h2>acm</h2>
 */

public class CompareExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        final String FIRST_TEXT = INPUT.next(),
                SECOND_TEXT = INPUT.next();
        System.out.print(smallestLexicographical(FIRST_TEXT, SECOND_TEXT));
    }

    private static String smallestLexicographical(String FIRST_TEXT, String SECOND_TEXT) {
        final int FIRST_SIZE = FIRST_TEXT.length(),
                SECOND_SIZE = SECOND_TEXT.length(),
                MINIMUM_SIZE = Math.min(FIRST_SIZE, SECOND_SIZE);

        for (int index = 0; index < MINIMUM_SIZE; index++) {
            if (FIRST_TEXT.charAt(index) < SECOND_TEXT.charAt(index)) return FIRST_TEXT;
            else if (SECOND_TEXT.charAt(index) < FIRST_TEXT.charAt(index)) return SECOND_TEXT;
        }

        return (FIRST_SIZE < SECOND_SIZE) ? FIRST_TEXT : SECOND_TEXT;
    }
}