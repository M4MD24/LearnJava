package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_5_name_character_length;

import java.util.Scanner;

public class NameCharacterLengthExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(nameCharacterLength(INPUT.nextLine()));
    }

    private static int nameCharacterLength(final String TEXT) {
        return TEXT.length();
    }
}