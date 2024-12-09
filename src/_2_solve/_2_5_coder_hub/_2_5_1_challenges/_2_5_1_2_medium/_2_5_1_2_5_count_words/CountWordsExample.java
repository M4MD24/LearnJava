package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_5_count_words;

import java.util.Scanner;

public class CountWordsExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getCountWords(INPUT.nextLine()));
    }

    private static int getCountWords(final String TEXT) {
        return TEXT.split(" +").length;
    }
}