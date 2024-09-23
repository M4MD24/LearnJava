package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_11_reverse_words;

import java.util.Scanner;

public class ReverseWordsExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(reverseWords(INPUT.nextLine(), INPUT.nextLine()));
    }

    private static String reverseWords(final String FIRST_WORD, final String SECOND_WORD) {
        return SECOND_WORD + ", " + FIRST_WORD;
    }
}