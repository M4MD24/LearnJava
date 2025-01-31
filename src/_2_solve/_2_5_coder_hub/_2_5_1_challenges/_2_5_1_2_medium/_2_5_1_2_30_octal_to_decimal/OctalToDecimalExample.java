package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_30_octal_to_decimal;

import java.util.Scanner;

public class OctalToDecimalExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getDecimalNumberFromOctalNumber(INPUT.nextInt()));
    }

    private static int getDecimalNumberFromOctalNumber(final int OCTAL_NUMBER) {
        return Integer.parseInt(String.valueOf(OCTAL_NUMBER),8);
    }
}