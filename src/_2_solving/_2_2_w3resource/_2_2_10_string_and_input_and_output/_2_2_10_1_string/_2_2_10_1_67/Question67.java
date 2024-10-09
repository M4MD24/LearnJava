package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_67;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read a string and remove the first two characters if one or both are equal to a specified character, otherwise leave them unchanged.</h2>
 */

public class Question67 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getTextAfterRemoveFirstTwoCharactersEqualsSpecificCharacter("Java", 'a'));
    }

    private static String getTextAfterRemoveFirstTwoCharactersEqualsSpecificCharacter(final String TEXT, final char SPECIFIC_CHARACTER) {
        if (TEXT.charAt(0) == SPECIFIC_CHARACTER && TEXT.charAt(1) == SPECIFIC_CHARACTER)
            return TEXT.substring(2);
        else if (TEXT.charAt(1) == SPECIFIC_CHARACTER)
            return TEXT.charAt(0) + TEXT.substring(2);
        else if (TEXT.charAt(0) == SPECIFIC_CHARACTER)
            return TEXT.substring(1);
        else
            return TEXT;
    }
}