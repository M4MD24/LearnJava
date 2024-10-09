package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_32_octal_to_hexadecimal;

import java.util.Scanner;

public class OctalToHexadecimalExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getHexadecimalNumberFromOctalNumber(INPUT.nextInt()));
    }

    private static String getHexadecimalNumberFromOctalNumber(final int OCTAL_NUMBER) {
        return Integer.toHexString(
                Integer.parseInt(
                        String.valueOf(OCTAL_NUMBER),
                        8
                )
        ).toUpperCase();
    }
}