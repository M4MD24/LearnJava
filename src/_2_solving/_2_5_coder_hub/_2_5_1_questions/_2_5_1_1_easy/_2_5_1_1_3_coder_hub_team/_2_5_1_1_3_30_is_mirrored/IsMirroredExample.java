package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_30_is_mirrored;

import java.util.Scanner;

public class IsMirroredExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(isPalindromeNumbers(INPUT.nextInt()));
    }

    private static boolean isPalindromeNumbers(final int NUMBER) {
        return String.valueOf(NUMBER).contentEquals(new StringBuilder(String.valueOf(NUMBER)).reverse());
    }
}