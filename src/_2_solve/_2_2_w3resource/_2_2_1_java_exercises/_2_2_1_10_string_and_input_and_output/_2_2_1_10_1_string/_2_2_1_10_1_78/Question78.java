package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_78;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to repeat a specific number of characters for a specific number of times from the last part of a given string.</h2>
 */

public class Question78 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRepeatLastSubText("Apple", 3));
    }

    private static String getTextAfterRepeatLastSubText(final String TEXT, final int COUNT_OF_REPEAT_AND_LAST_CHARACTERS_LENGTH) {
        return TEXT.substring(COUNT_OF_REPEAT_AND_LAST_CHARACTERS_LENGTH - 1)
                .repeat(COUNT_OF_REPEAT_AND_LAST_CHARACTERS_LENGTH);
    }
}