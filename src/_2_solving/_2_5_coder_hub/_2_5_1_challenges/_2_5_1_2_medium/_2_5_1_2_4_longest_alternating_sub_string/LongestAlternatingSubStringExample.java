package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_4_longest_alternating_sub_string;

import java.util.Scanner;

public class LongestAlternatingSubStringExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getLongestAlternatingSubString(INPUT.nextLine()));
    }

    private static String getLongestAlternatingSubString(final String TEXT) {
        StringBuilder longestAlternatingSubString = new StringBuilder(),
                currentAlternatingSubString = new StringBuilder();
        for (int firstIndexNumber = 0, secondIndexNumber = 1; secondIndexNumber < TEXT.length(); firstIndexNumber++, secondIndexNumber++) {
            final int FIRST_NUMBER = TEXT.charAt(firstIndexNumber) - '0',
                    SECOND_NUMBER = TEXT.charAt(secondIndexNumber) - '0';
            final boolean IS_OPPOSITE_PARITY_BETWEEN_TWO_NUMBERS = (FIRST_NUMBER % 2) != (SECOND_NUMBER % 2);
            if (IS_OPPOSITE_PARITY_BETWEEN_TWO_NUMBERS) {
                if (currentAlternatingSubString.isEmpty())
                    currentAlternatingSubString.append(FIRST_NUMBER)
                            .append(SECOND_NUMBER);
                else
                    currentAlternatingSubString.append(SECOND_NUMBER);
            } else {
                if (currentAlternatingSubString.length() > longestAlternatingSubString.length())
                    longestAlternatingSubString = currentAlternatingSubString;
                currentAlternatingSubString = new StringBuilder();
            }
        }
        return longestAlternatingSubString.toString();
    }
}