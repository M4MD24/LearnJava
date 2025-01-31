package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_94;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the longest mirror image string at both ends of a given string.</h2>
 */

public class Question94 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getLongestPalindromeTextAtBothEnds("ABCDCBA"));
    }

    private static String getLongestPalindromeTextAtBothEnds(final String TEXT) {
        for (int index = TEXT.length(); index > 0; index--) {
            final String FIRST_SUB_TEXT = TEXT.substring(0, index),
                    LAST_SUB_TEXT = TEXT.substring(0, index);
            if (FIRST_SUB_TEXT.contentEquals(new StringBuilder(LAST_SUB_TEXT).reverse()))
                return FIRST_SUB_TEXT;
        }
        return "";
    }
}