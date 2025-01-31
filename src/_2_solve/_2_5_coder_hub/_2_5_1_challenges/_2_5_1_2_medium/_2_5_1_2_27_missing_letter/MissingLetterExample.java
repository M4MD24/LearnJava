package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_27_missing_letter;

import java.util.Scanner;

public class MissingLetterExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getMissingLetter(INPUT.nextLine()));
    }

    private static String getMissingLetter(final String TEXT) {
        final StringBuilder MISSING_LETTERS = new StringBuilder();
        char targetCharacter = TEXT.charAt(0);
        int index = 0;
        while (index < TEXT.length()) {
            final char CURRENT_CHARACTER = TEXT.charAt(index);
            while (CURRENT_CHARACTER != targetCharacter) {
                MISSING_LETTERS.append(targetCharacter);
                targetCharacter++;
            }
            index++;
            targetCharacter++;
        }
        return MISSING_LETTERS.isEmpty()
                ? "No Missing Letter"
                : MISSING_LETTERS.toString();
    }
}