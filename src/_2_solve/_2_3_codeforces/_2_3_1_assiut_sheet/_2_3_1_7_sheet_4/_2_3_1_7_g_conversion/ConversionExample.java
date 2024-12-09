package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_g_conversion;

import java.util.Scanner;

/**
 * <h1>G. Conversion</h1>
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
 * <h2>Given a string S. Print the origin string after replacing the following:</h2>
 * <ul>
 *     <li>Replace every comma character ',' with a space character.</li>
 *     <li>Replace every capital character in S with its respective small character and Vice Versa.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>happy,NewYear,enjoy</h2>
 * <h1>Output:</h1>
 * <h2>HAPPY nEWyEAR ENJOY</h2>
 */

public class ConversionExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final String TEXT = INPUT.nextLine();
        System.out.print(afterReplaceEveryCommaCharacterAndCapitalCharacter(TEXT));
    }

    private static String afterReplaceEveryCommaCharacterAndCapitalCharacter(final String TEXT) {
        final char[] TEXT_CHARACTERS = TEXT.toCharArray();
        final StringBuilder TEXT_AFTER_REPLACING = new StringBuilder();
        for (final char CURRENT_CHARACTER : TEXT_CHARACTERS) {
            if (CURRENT_CHARACTER > 64 && CURRENT_CHARACTER < 91) TEXT_AFTER_REPLACING.append((char) (CURRENT_CHARACTER + 32));
            else if (CURRENT_CHARACTER > 96 && CURRENT_CHARACTER < 123) TEXT_AFTER_REPLACING.append((char) (CURRENT_CHARACTER - 32));
            else if (CURRENT_CHARACTER == ',') TEXT_AFTER_REPLACING.append(' ');
        }
        return String.valueOf(TEXT_AFTER_REPLACING);
    }
}