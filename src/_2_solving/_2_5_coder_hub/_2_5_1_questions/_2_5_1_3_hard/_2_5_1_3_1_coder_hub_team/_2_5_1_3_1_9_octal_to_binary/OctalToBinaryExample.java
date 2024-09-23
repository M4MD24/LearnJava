package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_3_hard._2_5_1_3_1_coder_hub_team._2_5_1_3_1_9_octal_to_binary;

import java.util.Scanner;

public class OctalToBinaryExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getBinaryNumberFromOctalNumber(INPUT.nextInt()));
    }

    private static String getBinaryNumberFromOctalNumber(final int OCTAL_NUMBER) {
        return Integer.toBinaryString(
                Integer.parseInt(
                        String.valueOf(
                                OCTAL_NUMBER
                        ),
                        8
                )
        );
    }
}