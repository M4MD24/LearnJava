package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_38_concat_names;

import java.util.Scanner;

public class ConcatNamesExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(concatTexts(INPUT.nextLine(), INPUT.nextLine()));
    }

    private static String concatTexts(final String FIRST_TEXT, final String SECOND_TEXT) {
        return FIRST_TEXT + ' ' + SECOND_TEXT;
    }
}