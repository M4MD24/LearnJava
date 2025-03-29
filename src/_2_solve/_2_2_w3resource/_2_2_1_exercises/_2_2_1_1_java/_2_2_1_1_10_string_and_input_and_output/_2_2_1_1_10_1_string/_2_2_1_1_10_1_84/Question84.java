package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_84;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to make an original string made of p number of characters from the first character in a given string. This is followed by p-1 number of characters till p is greater than zero.</h2>
 */

public class Question84 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRepeatSubStringsAndRemoveLastCharacterAfterEveryTimeToEnd("Welcome", 0));
    }

    private static String getTextAfterRepeatSubStringsAndRemoveLastCharacterAfterEveryTimeToEnd(final String TEXT, final int COUNT_OF_REPEAT_AND_LENGTH) {
        if (COUNT_OF_REPEAT_AND_LENGTH > 0) {
            final StringBuilder TEXT_AFTER_REPEAT_SUBSTRINGS_AND_REMOVE_LAST_CHARACTER_AFTER_EVERY_TIME_TO_END = new StringBuilder(TEXT.substring(0, COUNT_OF_REPEAT_AND_LENGTH));
            for (int index = 1; index < COUNT_OF_REPEAT_AND_LENGTH; index++)
                TEXT_AFTER_REPEAT_SUBSTRINGS_AND_REMOVE_LAST_CHARACTER_AFTER_EVERY_TIME_TO_END.append(
                        TEXT,
                        0,
                        COUNT_OF_REPEAT_AND_LENGTH - index
                );
            return TEXT_AFTER_REPEAT_SUBSTRINGS_AND_REMOVE_LAST_CHARACTER_AFTER_EVERY_TIME_TO_END.toString();
        } else
            return new Exception("\u001B[31mCount of repeat and length of text must be greater than zero!").getMessage();
    }
}