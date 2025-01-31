package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_29_compare_two_words;

import java.util.Scanner;

public class CompareTwoWordsExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(compareTwoWords(INPUT.nextLine(), INPUT.nextLine()));
    }

    private static boolean compareTwoWords(final String FIRST_TEXT, final String SECOND_TEXT) {
        return FIRST_TEXT
                .substring(FIRST_TEXT.length() - 2)
                .equals(SECOND_TEXT
                        .substring(SECOND_TEXT.length() - 2));
    }
}