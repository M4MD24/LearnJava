package _2_solving._2_5_coder_hub._2_5_2_medium._2_5_2_1_coder_hub_team._2_5_2_1_29_compare_two_words;

import java.util.Scanner;

public class CompareTwoWordsExample {
    public static void main(final String[] PARAMETERS) {
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