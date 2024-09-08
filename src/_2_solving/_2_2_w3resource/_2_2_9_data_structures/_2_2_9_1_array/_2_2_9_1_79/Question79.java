package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_79;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that returns the missing letter from an array of increasing letters (upper or lower). Assume there will always be one omission from the array.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Original array of elements:
 * <br/>
 * [p, r, s, t]
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Missing letter in the said array: q</h2>
 */

public class Question79 {
    public static void main(final String[] PARAMETERS) {
        final char[] CHARACTERS = {'p', 'r', 's', 't'};
        System.out.println(Arrays.toString(CHARACTERS));
        PrintMissingLettersInTheSaidArray(CHARACTERS);
    }

    private static void PrintMissingLettersInTheSaidArray(final char[] CHARACTERS) {
        for (char currentCharacter = ++CHARACTERS[0], characterOfCharactersIndex = 1;
             characterOfCharactersIndex < CHARACTERS.length;
             characterOfCharactersIndex++, currentCharacter++) {
            while (CHARACTERS[characterOfCharactersIndex] != currentCharacter) {
                System.out.println("Missing letter in the said array: " + currentCharacter);
                currentCharacter++;
            }
        }
    }
}