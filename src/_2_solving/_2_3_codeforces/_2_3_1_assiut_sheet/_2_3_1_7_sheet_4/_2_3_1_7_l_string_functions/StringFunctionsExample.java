package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_l_string_functions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>L. String Functions</h1>
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
 * <h2>Given two numbers N, Q and a string S of size N. Followed by Q lines of the following queries:</h2>
 * <ul>
 *     <li><b>pop_back:</b> remove the last character in the string.</li>
 *     <li><b>front:</b> print the first character in the string.</li>
 *     <li><b>back:</b> print the last character in the string.</li>
 *     <li><b>sort l r:</b> where (1≤l,r≤|S|) sort all characters of S from l to r.</li>
 *     <li><b>reverse l r:</b> where (1≤l,r≤|S|) reverse all characters of S from l to r.</li>
 *     <li><b>print pos: </b>where (1≤pos≤|S|) print the character in the index pos.</li>
 *     <li><b>substr l r:</b> where (1≤l,r≤|S|) print sub-string of s from l to r.</li>
 *     <li><b>push_back x:</b> add character x in the end of the string.</li>
 * </ul>
 * <h2>
 * For each query, print the answer associated with it in a single line.
 * <br/>
 * It's guaranteed that in the first 7 types of the query, the string is not empty.
 * <br/>
 * it's recommended to use built-in functions of String.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 18 8
 * <br/>
 * assiutinupperegypt
 * <br/>
 * substr 1 6
 * <br/>
 * sort 5 8
 * <br/>
 * pop_back
 * <br/>
 * back
 * <br/>
 * reverse 1 6
 * <br/>
 * front
 * <br/>
 * push_back i
 * <br/>
 * print 4
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * assiut
 * <br/>
 * p
 * <br/>
 * n
 * <br/>
 * s
 * </h2>
 */

public class StringFunctionsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();
    private static short countOfTestCases = INPUT.nextShort();
    private static final String NOTHING = INPUT.nextLine();
    private static String originalText = INPUT.next();
    private static short start,
            end;

    public static void main(final String[] PARAMETERS) {
        while (countOfTestCases-- > 0) {
            final String OPERATIONS = INPUT.next();
            switch (OPERATIONS) {
                case "pop_back" -> originalText = originalText.substring(0, originalText.length() - 1);
                case "front" -> System.out.println(originalText.charAt(0));
                case "back" -> System.out.println(originalText.charAt(originalText.length() - 1));
                case "sort" -> sortText();
                case "reverse" -> reverseText();
                case "print" -> System.out.println(originalText.charAt(INPUT.nextShort() - 1));
                case "substr" -> subStringText();
                case "push_back" -> originalText += INPUT.next().charAt(0);
            }
        }
    }

    private static void sortText() {
        start = INPUT.nextShort();
        end = INPUT.nextShort();
        swapIfStartGreaterThanEnd();
        final char[] CHARACTER_TEXT = originalText.toCharArray();
        Arrays.sort(CHARACTER_TEXT, (short) (start - 1), end);
        originalText = new String(CHARACTER_TEXT);
    }

    private static void reverseText() {
        start = INPUT.nextShort();
        end = INPUT.nextShort();
        swapIfStartGreaterThanEnd();
        originalText = reverseSubstring((short) (start - 1), end);
    }

    private static void subStringText() {
        start = INPUT.nextShort();
        end = INPUT.nextShort();
        swapIfStartGreaterThanEnd();
        System.out.println(originalText.substring((short) (start - 1), end));
    }

    private static void swapIfStartGreaterThanEnd() {
        if (end < start) {
            start += end;
            end = (short) (start - end);
            start -= end;
        }
    }

    public static String reverseSubstring(final short START_INDEX, final short END_INDEX) {
        return originalText.substring(0, START_INDEX) +
                new StringBuilder(originalText.substring(START_INDEX, END_INDEX)).reverse() +
                originalText.substring(END_INDEX);
    }
}