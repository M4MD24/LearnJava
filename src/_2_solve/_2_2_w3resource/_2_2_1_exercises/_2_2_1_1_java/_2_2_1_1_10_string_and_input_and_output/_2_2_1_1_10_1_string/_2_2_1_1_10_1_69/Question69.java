package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_69;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to return the substring that is between the first and last appearance of the substring 'toast' in the given string, or return an empty string if the substring 'toast' does not exist.</h2>
 */

public class Question69 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextBetweenToastWord("toastNullexiatoastForProgramming"));
    }

    private static String getTextBetweenToastWord(final String TEXT) {
        return TEXT.substring(
                TEXT.indexOf("toast") + 5,
                TEXT.lastIndexOf("toast")
        );
    }
}