package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_w_mahmoud_and_longest_uncommon_subsequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>W. Mahmoud and Longest Uncommon Subsequence</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * While Mahmoud and Ehab were practicing for IOI, they found a problem which name was Longest common subsequence. They solved it, and then Ehab challenged Mahmoud with another problem.
 * <br/>
 * Given two strings a and b, find the length of their longest uncommon subsequence, which is the longest string that is a subsequence of one of them and not a subsequence of the other.
 * <br/>
 * A subsequence of some string is a sequence of characters that appears in the same order in the string, The appearances don't have to be consecutive, for example, strings "ac", "bc", "abc" and "a" are subsequences of string "abc" while strings "abbc" and "acb" are not. The empty string is a subsequence of any string. Any string is a subsequence of itself.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * abcd
 * <br/>
 * defgh
 * </h2>
 * <h1>Output:</h1>
 * <h2>5</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * a
 * <br/>
 * a
 * </h2>
 * <h1>Output:</h1>
 * <h2>-1</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first example: you can choose "defgh" from string b as it is the longest subsequence of string b that doesn't appear as a subsequence of string a.
 * </h2>
 */

public class MahmoudAndLongestUncommonSubsequenceExample {
    private static StringBuffer TEXT_1,
            TEXT_2;

    public static void main(final String[] ARGS) throws IOException {
        inputValues();
        System.out.print(longestSubSequence());
    }

    private static int longestSubSequence() {
        if (TEXT_1.compareTo(TEXT_2) == 0) return -1;
        else return Math.max(TEXT_1.length(), TEXT_2.length());
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        TEXT_1 = new StringBuffer(INPUT.readLine());
        TEXT_2 = new StringBuffer(INPUT.readLine());
    }
}