package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_21_word_repeat;

import java.util.Scanner;

public class WordRepeatExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(wordRepeat(INPUT.nextLine(), INPUT.nextInt()));
    }

    private static String wordRepeat(final String WORD, final int REPEAT_NUMBER) {
        if (REPEAT_NUMBER == 1)
            return WORD;
        else
            return (WORD + " ").repeat(REPEAT_NUMBER - 1) + WORD;
    }
}