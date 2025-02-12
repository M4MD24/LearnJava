package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_81;

import java.util.regex.Pattern;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether two strings of first and second target texts appear the same number of times in a given string.</h2>
 */

public class Question81 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(areTwoTextsOfFirstAndSecondTargetTextAppearSameCount("redcapmanwithbluecar", "red", "blue"));
    }

    private static boolean areTwoTextsOfFirstAndSecondTargetTextAppearSameCount(final String TEXT, final String FIRST_TARGET_TEXT, final String SECOND_TARGET_TEXT) {
        return Pattern.compile(FIRST_TARGET_TEXT).matcher(TEXT).results().count() ==
                Pattern.compile(SECOND_TARGET_TEXT).matcher(TEXT).results().count();
    }
}