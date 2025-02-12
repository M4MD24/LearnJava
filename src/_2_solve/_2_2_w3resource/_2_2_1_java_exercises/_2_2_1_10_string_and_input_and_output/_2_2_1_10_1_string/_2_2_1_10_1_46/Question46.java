package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_46;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to reverse every word in a string using methods.</h2>
 */

public class Question46 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Learn Java Programming Language";
        System.out.print(getTextAfterReverseWords(TEXT));
    }

    private static String getTextAfterReverseWords(final String TEXT) {
        final String[] CURRENT_WORDS = TEXT.split(" ");
        for (int index = 0; index < CURRENT_WORDS.length; index++)
            CURRENT_WORDS[index] = new StringBuilder(CURRENT_WORDS[index]).reverse().toString();
        return String.join(
                " ",
                CURRENT_WORDS
        );
    }
}