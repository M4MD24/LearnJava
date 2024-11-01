package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_1_string_contains;

import java.util.Scanner;

public class StringContainsExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(stringContains(INPUT.nextLine(), INPUT.nextLine()));
    }

    private static boolean stringContains(final String SOURCE_TEXT, final String TARGET_TEXT) {
        return SOURCE_TEXT.contains(TARGET_TEXT);
    }
}