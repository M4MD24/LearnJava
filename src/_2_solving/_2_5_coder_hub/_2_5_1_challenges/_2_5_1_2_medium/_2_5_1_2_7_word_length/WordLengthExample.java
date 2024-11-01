package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_7_word_length;

import java.util.Arrays;

public class WordLengthExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(getWordsLength(new String[]{"Code", "hub"})));
        System.out.println(Arrays.toString(getWordsLength(new String[]{"dropbox", "google", "page"})));
        System.out.println(Arrays.toString(getWordsLength(new String[]{"java", "Islam", "javascript", "python"})));
        System.out.print(Arrays.toString(getWordsLength(new String[]{"programming", "languages"})));
    }

    private static int[] getWordsLength(final String[] WORDS) {
        final int COUNT_OF_WORDS = WORDS.length;
        final int[] WORDS_LENGTH = new int[COUNT_OF_WORDS];
        for (int index = 0; index < COUNT_OF_WORDS; index++)
            WORDS_LENGTH[index] = WORDS[index].length();
        return WORDS_LENGTH;
    }
}