package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_m_palindromes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>M. !Palindromes</h1>
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
 * <h2>
 * Everybody loves palindromes, but Artur doesn't. He has a string S that consists of lowercase English letters (' a' - ' z').
 * <br/>
 * Artur wants to find a substring T of S of the maximal length, so that T isn't a palindrome.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>aba</h2>
 * <h1>Output</h1>
 * <h2>2</h2>
 */

public class PalindromesExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        final StringBuffer TEXT = new StringBuffer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.print(getMaximumSubStringLength(TEXT));
    }

    private static int getMaximumSubStringLength(StringBuffer TEXT) {
        return TEXT.chars().distinct().count() == 1
                ? 0
                : TEXT.compareTo(new StringBuffer(TEXT).reverse()) == 0
                ? TEXT.length() - 1
                : TEXT.length();
    }
}