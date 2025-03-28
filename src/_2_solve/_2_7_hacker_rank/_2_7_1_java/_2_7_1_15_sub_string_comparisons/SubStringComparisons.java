package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_15_sub_string_comparisons;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_15_sub_string_comparisons.files <h2>Question</h2>
 */

public class SubStringComparisons {
    public static void main(final String[] ARGUMENTS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final String TEXT = INPUT.readLine();
        final int TARGET_NUMBER = Integer.parseInt(INPUT.readLine());
        final String[] SMALLEST_AND_LARGEST_SUB_STRING = getSmallestAndLargestSubStrings(TEXT, TARGET_NUMBER);
        OUTPUT.write(SMALLEST_AND_LARGEST_SUB_STRING[0] + '\n');
        OUTPUT.write(SMALLEST_AND_LARGEST_SUB_STRING[1]);
        OUTPUT.flush();
    }

    public static String[] getSmallestAndLargestSubStrings(final String TEXT, final int TARGET_NUMBER) {
        String smallestSubString = TEXT.substring(0, TARGET_NUMBER),
                largestSubString = TEXT.substring(0, TARGET_NUMBER);
        for (int indexOfText = 1; indexOfText <= TEXT.length() - TARGET_NUMBER; indexOfText++) {
            final String CURRENT_SUB_STRING = TEXT.substring(indexOfText, indexOfText + TARGET_NUMBER);
            if (CURRENT_SUB_STRING.compareTo(smallestSubString) < 0)
                smallestSubString = CURRENT_SUB_STRING;
            if (CURRENT_SUB_STRING.compareTo(largestSubString) > 0)
                largestSubString = CURRENT_SUB_STRING;
        }
        return new String[]{smallestSubString, largestSubString};
    }
}