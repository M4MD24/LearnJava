package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_41_match_arrays;

import java.util.Arrays;

public class MatchArraysExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(matchArrays(new String[]{"hello", "there", "word2"}, new String[]{"hello", "there", "word2"}));
        System.out.println(matchArrays(new String[]{"hello", "word2"}, new String[]{"hello", "there", "word2"}));
        System.out.println(matchArrays(new String[]{"hello", "there", "word2"}, new String[]{"hello", "word2"}));
        System.out.print(matchArrays(new String[]{"hello", "there", "word2"}, new String[]{"word2", "there", "hello"}));
    }

    private static boolean matchArrays(final String[] FIRST_TEXTS, final String[] SECOND_TEXTS) {
        Arrays.sort(FIRST_TEXTS);
        Arrays.sort(SECOND_TEXTS);
        return Arrays.equals(FIRST_TEXTS, SECOND_TEXTS);
    }
}