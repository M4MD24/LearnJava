package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_98;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether the first instance of a given character is immediately followed by the same character in a given string.</h2>
 */

public class Question98 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(isAfterTargetCharacterSameCharacter("132__123", '_'));
    }

    private static boolean isAfterTargetCharacterSameCharacter(final String TEXT, final char SPECIFIC_CHARACTER) {
        final int TARGET_INDEX = TEXT.indexOf(SPECIFIC_CHARACTER);
        return TEXT.charAt(TARGET_INDEX) == TEXT.charAt(TARGET_INDEX + 1);
    }
}