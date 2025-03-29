package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_52;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if two given strings are rotations of each other.</h2>
 */

public class Question52 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(areRotationTexts("ABACD", "CDABA"));
    }

    private static boolean areRotationTexts(final String FIRST_TEXT, final String SECOND_TEXT) {
        return FIRST_TEXT.length() == SECOND_TEXT.length() &&
                (FIRST_TEXT + FIRST_TEXT).contains(SECOND_TEXT);
    }
}