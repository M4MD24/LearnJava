package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_5;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to compare two strings lexicographically.
 * <br/>
 * Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * First Text: Nullexia 1
 * <br/>
 * Second Text: Nullexia 2
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * First text is less than second text
 * </h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        final String FIRST_TEXT = "Nullexia 1",
                SECOND_TEXT = "Nullexia 2";
        System.out.print("First text is " + getCompareBetweenTwoTexts(FIRST_TEXT, SECOND_TEXT) + " second text");
    }

    private static String getCompareBetweenTwoTexts(final String FIRST_TEXT, final String SECOND_TEXT) {
        return switch (FIRST_TEXT.compareTo(SECOND_TEXT)) {
            case -1 -> "less than";
            case 0 -> "equals";
            case 1 -> "greater than";
            default -> throw new IllegalStateException("Unexpected value: " + FIRST_TEXT.compareTo(SECOND_TEXT));
        };
    }
}