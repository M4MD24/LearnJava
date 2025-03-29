package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_97;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to return a string with characters at index positions 0,1,2,5,6,7, ... from a given string.</h2>
 */

public class Question97 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getCharactersFromTextByTargetPositions("0123456789"));
    }

    private static String getCharactersFromTextByTargetPositions(final String TEXT) {
        final StringBuilder CHARACTERS_FROM_TEXT_BY_TARGET_POSITIONS = new StringBuilder();
        for (int index = 0, count = 1; index < TEXT.length(); index++, count++) {
            CHARACTERS_FROM_TEXT_BY_TARGET_POSITIONS.append(TEXT.charAt(index));
            if (count == 3) {
                index += 2;
                count = 0;
            }
        }
        return CHARACTERS_FROM_TEXT_BY_TARGET_POSITIONS.toString();
    }
}