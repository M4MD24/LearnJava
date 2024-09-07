package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_m_sub_sequence_string;

import java.util.Scanner;

/**
 * <h1>M. Sub-sequence String</h1>
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
 * <h2>Given String S. Determine if there is a Subsequence in S that is equal to "hello" or not.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.
 * <br/>
 * For example: The list of all subsequence for the word "apple" would be "a", "ap", "al", "ae", "app", "apl", "ape", "ale", "appl", "appe", "aple", "apple", "p", "pp", "pl", "pe", "ppl", "ppe", "ple", "pple", "l", "le", "e".
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>ahhellllloou</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>hlelo</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class SubSequenceStringExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final String TEXT = INPUT.nextLine();
        System.out.print(isEqualHello(TEXT));
    }

    private static String isEqualHello(final String TEXT) {
        final String TARGET_TEXT = "hello";
        for (int index = 0, targetIndex = 0; index < TEXT.length(); index++) {
            if (TEXT.charAt(index) == TARGET_TEXT.charAt(targetIndex)) {
                targetIndex++;
                if (targetIndex == TARGET_TEXT.length()) return "YES";
            }
        }
        return "NO";
    }
}