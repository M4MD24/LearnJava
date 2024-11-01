package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_39_all_same_case;

import java.util.Scanner;

public class AllSameCaseExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(concatTexts(INPUT.nextLine(), INPUT.nextLine()));
    }

    private static String concatTexts(final String FIRST_TEXT, final String SECOND_TEXT) {
        return FIRST_TEXT + ' ' + SECOND_TEXT;
    }
}