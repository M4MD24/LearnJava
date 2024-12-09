package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_11_remove_special_characters;

import java.util.Scanner;

public class RemoveSpecialCharactersExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getTextAfterRemoveSpecialCharacters(INPUT.nextLine()));
    }

    private static String getTextAfterRemoveSpecialCharacters(final String TEXT) {
        return TEXT.replaceAll("[^\\w\\s-ـ]", "");
    }
}