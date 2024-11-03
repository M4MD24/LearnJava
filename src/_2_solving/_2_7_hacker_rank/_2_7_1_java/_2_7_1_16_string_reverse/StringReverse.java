package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_16_string_reverse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_16_string_reverse.files <h2>Question</h2>
 */

public class StringReverse {
    public static void main(final String[] PARAMETERS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        OUTPUT.write(isPalindromeNumber(INPUT.readLine()) ? "Yes" : "No");
        OUTPUT.flush();
    }

    private static boolean isPalindromeNumber(final String TEXT) {
        return String.valueOf(TEXT).contentEquals(new StringBuilder(String.valueOf(TEXT)).reverse());
    }
}