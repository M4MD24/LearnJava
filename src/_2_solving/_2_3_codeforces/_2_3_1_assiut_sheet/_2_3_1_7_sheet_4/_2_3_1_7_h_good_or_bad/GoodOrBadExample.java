package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_h_good_or_bad;

import java.util.Scanner;

/**
 * <h1>H. Good or Bad</h1>
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
 * <h1>Question:</h1>
 * <h2>Given a string S. Determine whether this string is Good or Bad.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * The string is Good if and only if it has "010" or "101" as one of its sub-strings and it's not necessary to have both of them.
 * <br/>
 * A substring of a string is a contiguous subsequence of that string. So, string "forces" is substring of string "codeforces", but string "coder" is not.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * 11111110
 * <br/>
 * 10101010101010
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * Bad
 * <br/>
 * Good
 * </h2>
 */

public class GoodOrBadExample {
    public static void main(final String[] PARAMETERS) {
        inputValues();
    }

    private static void inputValues() {
        final Scanner INPUT = new Scanner(System.in);
        byte countOfTestCases = INPUT.nextByte();
        while (countOfTestCases > 0) {
            System.out.print(isGoodOrBad(INPUT.next()));
            if (countOfTestCases-- > 1) System.out.println();
        }
    }

    private static String isGoodOrBad(final String TEXT) {
        return (TEXT.contains("010") || TEXT.contains("101")) ? "Good" : "Bad";
    }
}