package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_f_way_too_long_words;

import java.util.Scanner;

/**
 * <h1>F. Way Too Long Words</h1>
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
 * <h2>Given a string S. Print the origin string if it's not too long otherwise, print the special abbreviation.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>The string is called too long, if its length is strictly more than 10 characters. If the string is too long then you have to print the string in the following manner:</h2>
 * <ul>
 *      <li>Print the first character in the string.</li>
 *      <li>Print number of characters between the first and the last characters.</li>
 *      <li>Print the last character in the string.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * word
 * <br/>
 * localization
 * <br/>
 * internationalization
 * <br/>
 * pneumonoultramicroscopicsilicovolcanoconiosis
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * word
 * <br/>
 * l10n
 * <br/>
 * i18n
 * <br/>
 * p43s
 * </h2>
 */

public class WayTooLongWords {
    private static final Scanner INPUT = new Scanner(System.in);
    private static byte countOfTestCases = INPUT.nextByte();

    public static void main(final String[] ARGUMENTS) {
        inputAndPrintValues();
    }

    private static void inputAndPrintValues() {
        while (countOfTestCases > 0) {
            final String TEXT = INPUT.next();
            if (TEXT.length() < 11) System.out.print(TEXT);
            else System.out.printf("%c%d%c", TEXT.charAt(0), sumMiddleLetters(TEXT), TEXT.charAt(TEXT.length() - 1));
            if (countOfTestCases-- > 1) System.out.println();
        }
    }

    private static byte sumMiddleLetters(final String TEXT) {
        return (byte) (TEXT.length() - 2);
    }
}