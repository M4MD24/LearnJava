package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_41;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove duplicate characters from a given string that appear in another given string.</h2>
 */

public class Question41 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "AsdAddnndAAcbbA";
        final String TEXT_CHARACTERS_FOR_REMOVE = "sddnbccc";
        System.out.print(getTextAfterRemoveTargetTextCharacters(TEXT, TEXT_CHARACTERS_FOR_REMOVE));
    }

    private static String getTextAfterRemoveTargetTextCharacters(final String TEXT, final String TEXT_CHARACTERS_FOR_REMOVE) {
        return String.join(
                "",
                TEXT.split('[' + TEXT_CHARACTERS_FOR_REMOVE + ']')
        );
    }
}