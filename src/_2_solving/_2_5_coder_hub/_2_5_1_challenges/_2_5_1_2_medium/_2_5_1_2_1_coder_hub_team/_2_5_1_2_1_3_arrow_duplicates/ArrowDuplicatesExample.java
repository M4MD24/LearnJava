package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_3_arrow_duplicates;

import java.util.Scanner;

public class ArrowDuplicatesExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getArrowDuplicates(INPUT.nextLine()));
    }

    private static String getArrowDuplicates(final String WORD) {
        final StringBuilder ARROW_DUPLICATES = new StringBuilder();
        final StringBuilder WORD_AS_STRING_BUILDER = new StringBuilder(WORD.toLowerCase());
        for (int index = 0; index < WORD.length(); index++) {
            final char CHARACTER = WORD_AS_STRING_BUILDER.charAt(index);
            WORD_AS_STRING_BUILDER.deleteCharAt(index);
            if (WORD_AS_STRING_BUILDER.toString().contains(String.valueOf(CHARACTER)))
                ARROW_DUPLICATES.append('<');
            else
                ARROW_DUPLICATES.append('>');
            WORD_AS_STRING_BUILDER.insert(index, CHARACTER);
        }
        return ARROW_DUPLICATES.toString();
    }
}