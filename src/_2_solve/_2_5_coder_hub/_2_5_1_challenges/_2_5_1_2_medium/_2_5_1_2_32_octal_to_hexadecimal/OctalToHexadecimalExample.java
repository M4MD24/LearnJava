package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_32_octal_to_hexadecimal;

import java.util.Scanner;

public class OctalToHexadecimalExample {
    public static void main(final String[] ARGUMENTS) {
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