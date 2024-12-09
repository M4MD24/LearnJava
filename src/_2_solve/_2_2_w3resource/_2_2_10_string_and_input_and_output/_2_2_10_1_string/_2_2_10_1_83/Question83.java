package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_83;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a string from two given strings. This is so that each character of the two strings appears individually in the created string.</h2>
 */

public class Question83 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getTextAfterMergeTwoTextAndEachCharactersOfTwoTextsAppearsIndividually("Welcome", "Hello"));
    }

    private static String getTextAfterMergeTwoTextAndEachCharactersOfTwoTextsAppearsIndividually(final String FIRST_TEXT, final String SECOND_TEXT) {
        return IntStream.range(
                0,
                Math.max(
                        FIRST_TEXT.length(),
                        SECOND_TEXT.length()
                )
        ).mapToObj(index -> (index < FIRST_TEXT.length()
                        ? "" + FIRST_TEXT.charAt(index)
                        : ""
                ) + (index < SECOND_TEXT.length()
                        ? "" + SECOND_TEXT.charAt(index)
                        : ""
                )
        ).collect(Collectors.joining());
    }
}