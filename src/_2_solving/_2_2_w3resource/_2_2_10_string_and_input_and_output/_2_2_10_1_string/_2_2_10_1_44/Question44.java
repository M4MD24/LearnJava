package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_44;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to reverse a string using recursion.</h2>
 */

public class Question44 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.print(reverseText(TEXT, 0, TEXT.length() - 1));
    }

    private static String reverseText(final String TEXT, final int FIRST_INDEX, final int LAST_INDEX) {
        if (FIRST_INDEX > LAST_INDEX)
            return TEXT;
        else {
            final StringBuilder TEXT_AS_STRING_BUILDER = new StringBuilder(TEXT);
            TEXT_AS_STRING_BUILDER.setCharAt(
                    FIRST_INDEX,
                    TEXT.charAt(LAST_INDEX)
            );
            TEXT_AS_STRING_BUILDER.setCharAt(
                    LAST_INDEX,
                    TEXT.charAt(FIRST_INDEX)
            );
            return reverseText(TEXT_AS_STRING_BUILDER.toString(), FIRST_INDEX + 1, LAST_INDEX - 1);
        }
    }
}