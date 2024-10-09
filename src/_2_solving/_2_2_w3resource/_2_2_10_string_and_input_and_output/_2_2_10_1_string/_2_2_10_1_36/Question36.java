package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_36;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether two strings interleave of a given string. Assuming that unique characters are present in both strings.</h2>
 */

public class Question36 {
    public static void main(final String[] PARAMETERS) {
        final String FIRST_TEXT = "MNO";
        final String SECOND_TEXT = "PQ";
        final String AFTER_MERGE_TEXTS = "PMQNO";
        System.out.print(isInterleave(FIRST_TEXT, SECOND_TEXT, AFTER_MERGE_TEXTS));
    }

    private static boolean isInterleave(final String FIRST_TEXT, final String SECOND_TEXT, final String AFTER_MERGE_TEXTS) {
        final StringBuilder FIRST_TEXT_AS_STRING_BUILDER = new StringBuilder(FIRST_TEXT),
                SECOND_TEXT_AS_STRING_BUILDER = new StringBuilder(SECOND_TEXT),
                AFTER_MERGE_TEXTS_AS_STRING_BUILDER = new StringBuilder(AFTER_MERGE_TEXTS);
        while (!AFTER_MERGE_TEXTS_AS_STRING_BUILDER.isEmpty()) {
            final int LAST_LENGTH_OF_AFTER_MERGE_TEXTS_AS_STRING_BUILDER = AFTER_MERGE_TEXTS_AS_STRING_BUILDER.length();
            if (AFTER_MERGE_TEXTS_AS_STRING_BUILDER.charAt(0) == FIRST_TEXT_AS_STRING_BUILDER.charAt(0)) {
                AFTER_MERGE_TEXTS_AS_STRING_BUILDER.deleteCharAt(0);
                FIRST_TEXT_AS_STRING_BUILDER.deleteCharAt(0);
            } else if (AFTER_MERGE_TEXTS_AS_STRING_BUILDER.charAt(0) == SECOND_TEXT_AS_STRING_BUILDER.charAt(0)) {
                AFTER_MERGE_TEXTS_AS_STRING_BUILDER.deleteCharAt(0);
                SECOND_TEXT_AS_STRING_BUILDER.deleteCharAt(0);
            }
            if (LAST_LENGTH_OF_AFTER_MERGE_TEXTS_AS_STRING_BUILDER == AFTER_MERGE_TEXTS_AS_STRING_BUILDER.length())
                break;
        }
        return AFTER_MERGE_TEXTS_AS_STRING_BUILDER.isEmpty();
    }
}