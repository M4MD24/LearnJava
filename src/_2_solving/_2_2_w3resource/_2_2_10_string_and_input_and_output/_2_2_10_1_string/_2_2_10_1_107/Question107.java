package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_107;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count occurrences of a certain character in a given string.</h2>
 */

public class Question107 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getCountOfSpecificCharacter("Java", 'a'));
    }

    private static long getCountOfSpecificCharacter(final String TEXT, final char SPECIFIC_CHARACTER) {
        return TEXT.chars()
                .filter(character -> character == SPECIFIC_CHARACTER)
                .count();
    }
}