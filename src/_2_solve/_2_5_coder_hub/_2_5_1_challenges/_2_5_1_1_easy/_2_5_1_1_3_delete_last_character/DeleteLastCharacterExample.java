package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_3_delete_last_character;

import java.util.Scanner;

public class DeleteLastCharacterExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(deleteLastCharacter(INPUT.nextLine()));
    }

    private static String deleteLastCharacter(final String TEXT) {
        return new StringBuilder(TEXT).deleteCharAt(TEXT.length() - 1).toString();
    }
}