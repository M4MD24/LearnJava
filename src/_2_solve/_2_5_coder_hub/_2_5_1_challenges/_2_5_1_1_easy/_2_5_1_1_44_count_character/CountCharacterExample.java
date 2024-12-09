package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_44_count_character;

import java.util.Scanner;

public class CountCharacterExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(countCharacter(INPUT.nextLine(), INPUT.nextLine()));
    }

    private static int countCharacter(final String TEXT, final String SUB_TEXT) {
        return (int) TEXT.chars()
                .filter(character -> character == SUB_TEXT.charAt(0))
                .count();
    }
}