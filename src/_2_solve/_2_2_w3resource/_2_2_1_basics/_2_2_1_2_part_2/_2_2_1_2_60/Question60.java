package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_60;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to match any single character (use ?) or any sequence of characters (use *) including empty. The matching should cover the entire input string.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Enter a characters: bb
 * <br/>
 * Enter a pattern: b*
 * <br/>
 * Yes
 * </h2>
 */

public class Question60 {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Enter characters: ");
        final String CHARACTERS = INPUT.nextLine();
        System.out.print("Enter pattern: ");
        final String PATTERN = INPUT.nextLine();
        System.out.println(areCharactersEqualsPattern(CHARACTERS, PATTERN)
                ? "Yes"
                : "No");
    }

    private static boolean areCharactersEqualsPattern(final String CHARACTERS, final String PATTERN) {
        if (PATTERN.isEmpty()) return CHARACTERS.isEmpty();
        if (PATTERN.equals("*")) return true;
        if (CHARACTERS.isEmpty()) return false;
        final char PATTERN_CHARACTER = PATTERN.charAt(0);
        if (PATTERN_CHARACTER == '?') return areCharactersEqualsPattern(CHARACTERS.substring(1), PATTERN.substring(1));
        if (PATTERN_CHARACTER == '*') return areCharactersEqualsPattern(CHARACTERS.substring(1), PATTERN) || areCharactersEqualsPattern(CHARACTERS, PATTERN.substring(1));
        return CHARACTERS.charAt(0) == PATTERN_CHARACTER && areCharactersEqualsPattern(CHARACTERS.substring(1), PATTERN.substring(1));
    }
}