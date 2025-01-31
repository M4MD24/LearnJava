package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_141;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if a given string has all distinct characters.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input characters: xyyz</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>String has all unique characters: false</h2>
 */
public class Question141 {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGUMENTS) {
        System.out.print("Input characters: ");
        final String STRING = INPUT.nextLine();

        System.out.print("String has all unique characters: " + checkStringHasAllUniqueCharacters(STRING));
    }

    private static boolean checkStringHasAllUniqueCharacters(final String STRING) {
        final char[] STRING_CHARACTERS = STRING.toCharArray();
        for (int round = 0; round < STRING_CHARACTERS.length - 1; round++)
            for (int index = 0; index < STRING_CHARACTERS.length; index++)
                if (index != round && STRING_CHARACTERS[round] == STRING_CHARACTERS[index]) return false;
        return true;
    }
}