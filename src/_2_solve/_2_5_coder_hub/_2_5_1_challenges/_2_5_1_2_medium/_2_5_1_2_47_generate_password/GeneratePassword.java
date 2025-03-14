package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_47_generate_password;

import java.util.Map;
import java.util.Scanner;

public class GeneratePassword {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(
                generatePassword(
                        INPUT.nextInt(),
                        INPUT.nextBoolean()
                )
        );
    }

    private static final Map<Integer, String[]> PASSWORDS = Map.of(
            4, new String[]{"Ab1Z"},
            5, new String[]{"qWe1R"},
            6, new String[]{"a#B3$z"},
            7, new String[]{"2#aB$9t"},
            8, new String[]{"Ab4kPz10", "a#X2@R4z"},
            10, new String[]{"Ab12C3xYz0", "q4$Xz@Y1vC"},
            12, new String[]{"B9k0AbCd9Z12", "Z2@x9#A1b$C7p"}
    );

    private static String generatePassword(
            final int LENGTH,
            final boolean USE_SPECIAL_CHARACTERS
    ) {
        if (!PASSWORDS.containsKey(LENGTH))
            return "";
        final String[] OPTIONS = PASSWORDS.get(LENGTH);
        return USE_SPECIAL_CHARACTERS &&
                OPTIONS.length > 1 ? OPTIONS[1] : OPTIONS[0];
    }
}