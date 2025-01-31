package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_30_is_mirrored;

import java.util.Scanner;

public class IsMirroredExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(isPalindromeNumbers(INPUT.nextInt()));
    }

    private static boolean isPalindromeNumbers(final int NUMBER) {
        return String.valueOf(NUMBER).contentEquals(new StringBuilder(String.valueOf(NUMBER)).reverse());
    }
}