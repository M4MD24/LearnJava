package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_49;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the first non-repeating character from a stream of characters.</h2>
 */

public class Question49 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getFirstNonRepeatCharacter("abcddbe"));
    }

    private static char getFirstNonRepeatCharacter(final String TEXT) {
        return (char) TEXT.chars()
                .filter(character -> TEXT.indexOf(character) != TEXT.lastIndexOf(character))
                .findFirst()
                .getAsInt();
    }
}