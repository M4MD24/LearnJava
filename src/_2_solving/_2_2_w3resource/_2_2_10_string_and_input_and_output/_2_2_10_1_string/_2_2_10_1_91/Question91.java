package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_91;

import java.util.regex.Pattern;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count the number of words ending in 'm' or 'n' (not case sensitive) in a given text.</h2>
 */

public class Question91 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getCountOfWordsEndingIn_m_Or_n("mohammed is in the room"));
    }

    private static long getCountOfWordsEndingIn_m_Or_n(final String TEXT) {
        return Pattern.compile("\\b\\w*[mn]\\b", Pattern.CASE_INSENSITIVE).matcher(TEXT).results().count();
    }
}