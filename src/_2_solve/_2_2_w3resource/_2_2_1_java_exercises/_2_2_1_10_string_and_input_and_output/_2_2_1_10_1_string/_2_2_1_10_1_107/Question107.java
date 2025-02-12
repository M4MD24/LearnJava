package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_107;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count occurrences of a certain character in a given string.</h2>
 */

public class Question107 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getCountOfSpecificCharacter("Java", 'a'));
    }

    private static long getCountOfSpecificCharacter(final String TEXT, final char SPECIFIC_CHARACTER) {
        return TEXT.chars()
                .filter(character -> character == SPECIFIC_CHARACTER)
                .count();
    }
}