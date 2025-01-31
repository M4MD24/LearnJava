package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_10_first_number_vowels;

import java.util.Scanner;

public class FirstNumberVowelsExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getFirstNumberVowels(INPUT.nextLine(), INPUT.nextInt()));
    }

    private static String getFirstNumberVowels(String text, final int TARGET_NUMBER) {
        text = text.replaceAll(" +", "");
        final String VOWELS = "AEIOUaeiou";
        final StringBuilder FIRST_VOWELS = new StringBuilder();
        for (final char CHARACTER : text.toCharArray())
            if (VOWELS.contains(String.valueOf(CHARACTER)))
                FIRST_VOWELS.append(CHARACTER);
        return FIRST_VOWELS.length() > TARGET_NUMBER
                ? "Invalid"
                : String.valueOf(FIRST_VOWELS);
    }
// >
/*    private static String getFirstNumberVowels(final String TEXT, final int TARGET_NUMBER) {
        final String VOWELS = "AEIOUaeiou";
        final String FIRST_VOWELS_OF_TEXT = TEXT.chars()
                .mapToObj(character -> (char) character)
                .filter(character -> VOWELS.indexOf(character) != -1)
                .map(String::valueOf)
                .collect(Collectors.joining());
        return TARGET_NUMBER > FIRST_VOWELS_OF_TEXT.length()
                ? "invalid"
                : FIRST_VOWELS_OF_TEXT.substring(0, TARGET_NUMBER);
    }*/
}