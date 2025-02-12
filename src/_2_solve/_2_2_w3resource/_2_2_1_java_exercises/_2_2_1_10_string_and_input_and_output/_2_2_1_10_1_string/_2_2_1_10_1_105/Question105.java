package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_105;

import java.util.regex.Pattern;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count the occurrences of a given string in another given string.</h2>
 */

public class Question105 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getCountOfOccurrencesOfSpecificSubTextInText("AAaAAaAAAA", "AA"));
    }

    private static long getCountOfOccurrencesOfSpecificSubTextInText(final String TEXT, final String SPECIFIC_SUB_TEXT) {
        return TEXT.split("(?=" + Pattern.quote(SPECIFIC_SUB_TEXT) + ")").length;
    }
}