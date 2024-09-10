package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_35_return_string_letters;

import java.util.Scanner;

public class NumbersRangeExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(printNumbersToTargetNumber(INPUT.nextLine(), INPUT.nextLine()));
    }

    private static int printNumbersToTargetNumber(final String FIRST_TEXT, final String SECOND_TEXT) {
        return Math.max(FIRST_TEXT.length(), SECOND_TEXT.length());
    }
}