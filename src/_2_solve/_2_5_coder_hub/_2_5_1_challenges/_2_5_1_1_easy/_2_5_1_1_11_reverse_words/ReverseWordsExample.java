package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_11_reverse_words;

import java.util.Scanner;

public class ReverseWordsExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(reverseWords(INPUT.nextLine(), INPUT.nextLine()));
    }

    private static String reverseWords(final String FIRST_WORD, final String SECOND_WORD) {
        return SECOND_WORD + ", " + FIRST_WORD;
    }
}