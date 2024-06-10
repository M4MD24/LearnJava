package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_37;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the index of the first non-repeating character in a given string.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Index of first non-repeating character in 'google' is: 4</h2>
 */

public class Question37 {
    public static void main(final String[] ARGS) {
        final String TEXT = "MOHAMED";
        System.out.printf("Index of first non-repeating character in %s is: %d", TEXT, getFirstNonRepeatingCharacter(TEXT));
    }

    private static int getFirstNonRepeatingCharacter(final String TEXT) {
        boolean isRepeated = false;
        for (int round = 0; round < TEXT.length(); round++) {
            for (int index = 0; index < TEXT.length(); index++)
                if (TEXT.charAt(round) == TEXT.charAt(index) && round != index) {
                    isRepeated = true;
                    break;
                }
            if (!isRepeated) return round;
            isRepeated = false;
        }
        return -1;
    }
}