package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_n_max_sub_sequence;

import java.util.Scanner;

/**
 * <h1>N. Max Sub-sequence</h1>
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
 * <h2>Given a number N and a string S of size N. Determine the maximum possible size of the sub-sequence T derived from S such that no two adjacent characters in T are the same.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.
 * <br/>
 * For example: The list of all subsequence for the word "apple" would be "a", "ap", "al", "ae", "app", "apl", "ape", "ale", "appl", "appe", "aple", "apple", "p", "pp", "pl", "pe", "ppl", "ppe", "ple", "pple", "l", "le", "e".
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * ababb
 * </h2>
 * <h1>Output:</h1>
 * <h2>4</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * aaaac
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 */

public class MaxSubSequenceExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        INPUT.nextInt();
        final String TEXT = INPUT.next();
        System.out.print(maximumSubSequence(TEXT));
    }

    private static int maximumSubSequence(final String TEXT) {
        char temporaryCharacter = TEXT.charAt(0);
        int counter = 1;
        for (int index = 1; index < TEXT.length(); index++) {
            if (TEXT.charAt(index) != temporaryCharacter) {
                counter++;
                temporaryCharacter = TEXT.charAt(index);
            }
        }
        return counter;
    }
}