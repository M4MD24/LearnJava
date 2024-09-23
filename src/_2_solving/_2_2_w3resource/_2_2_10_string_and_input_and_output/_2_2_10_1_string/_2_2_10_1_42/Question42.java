package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_42;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to print a list of items containing all characters of a given word.</h2>
 */

public class Question42 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(
                Arrays.toString(getTextsContainingAllCharactersOfText(
                        new String[]{"Nullexia", "for", "Programming"},
                        "orrr"
                ))
        );
    }

    private static String[] getTextsContainingAllCharactersOfText(final String[] TEXTS, final String TEXT) {
        return Arrays.stream(TEXTS)
                .filter(
                        text -> text.chars()
                                .anyMatch(
                                        currentCharacter -> TEXT.chars()
                                                .anyMatch(
                                                        anotherCharacter -> currentCharacter == anotherCharacter
                                                )
                                )
                ).toArray(String[]::new);
    }
}