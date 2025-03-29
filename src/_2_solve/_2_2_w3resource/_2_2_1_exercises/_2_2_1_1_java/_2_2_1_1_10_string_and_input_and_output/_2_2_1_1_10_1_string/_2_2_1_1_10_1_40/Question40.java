package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_40;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to divide a string into n equal parts.</h2>
 */

public class Question40 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "aaaaaAAAAA12345bbbbbBBBBB";
        final int SPECIFIC_NUMBER = 5;
        System.out.print(Arrays.toString(getSubTextsAfterDivideTextIntoNumberEqualParts(TEXT, SPECIFIC_NUMBER)));
    }

    private static String[] getSubTextsAfterDivideTextIntoNumberEqualParts(final String TEXT, final int SPECIFIC_NUMBER) {
        if (TEXT.length() % SPECIFIC_NUMBER != 0)
            throw new IllegalArgumentException("String length is not divisible by " + SPECIFIC_NUMBER);
        else
            return TEXT.split("(?<=\\G.{" + SPECIFIC_NUMBER + "})");
    }
}