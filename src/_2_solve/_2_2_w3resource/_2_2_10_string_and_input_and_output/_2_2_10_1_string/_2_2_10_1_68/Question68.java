package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_68;

/**
 * <h1>Problem:</h1>
 * <h2>Write Java program to read a string and return after removing specified characters and their immediate left and right adjacent characters.</h2>
 */

public class Question68 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRemovingSpecifiedCharactersAndImmediateLeftAndRightAdjacentCharacters("test#the#string", '#'));
    }

    private static String getTextAfterRemovingSpecifiedCharactersAndImmediateLeftAndRightAdjacentCharacters(final String TEXT, final char SPECIFIC_CHARACTER) {
        return TEXT.replaceAll(".?[" + SPECIFIC_CHARACTER + "]+.?", "");
    }
}