package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_39;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the first non-repeating character in a string.</h2>
 */

public class Question39 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "AmAmmzooo";
        System.out.print(getFirstCharacterFirstNonRepeatingCharacter(TEXT));
    }

    private static char getFirstCharacterFirstNonRepeatingCharacter(final String TEXT) {
        return (char) TEXT.chars()
                .filter(character -> TEXT.indexOf(character) == TEXT.lastIndexOf(character))
                .findFirst()
                .getAsInt();
    }
}