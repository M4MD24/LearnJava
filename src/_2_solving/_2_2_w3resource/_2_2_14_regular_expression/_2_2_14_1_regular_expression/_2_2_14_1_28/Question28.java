package _2_solving._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_28;

import java.util.regex.Pattern;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to reverse words longer than 3 in a given string.</h2>
 */

public class Question28 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "avaJ gnimmargorp egaugnal can etaerc snoitacilppa";
        System.out.print(getTextAfterReverseWordsLongerThan3Words(TEXT));
    }

    private static String getTextAfterReverseWordsLongerThan3Words(final String TEXT) {
        return Pattern.compile("\\b\\w{4,}\\b")
                .matcher(TEXT)
                .replaceAll(match -> new StringBuilder(match.group())
                        .reverse()
                        .toString()
                );
    }
}