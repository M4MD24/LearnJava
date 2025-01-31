package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_139_word_break;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
 * <br/>
 * <br/>
 * Note: that the same word in the dictionary may be reused multiple times in the segmentation.
 * </h2>
 */

public class WordBreak {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "applepenapple";
        final List<String> WORD_DICTIONARY = List.of("apple", "pen");
        System.out.print(wordBreak(TEXT, WORD_DICTIONARY));
    }

    private static boolean wordBreak(final String TEXT, final List<String> WORD_DICTIONARY) {
        final Set<String> DICTIONARY_SET = new HashSet<>(WORD_DICTIONARY);
        final boolean[] SEGMENTATION_POSSIBILITY = new boolean[TEXT.length() + 1];
        SEGMENTATION_POSSIBILITY[0] = true;
        for (int endIndex = 1; endIndex <= TEXT.length(); endIndex++)
            for (int startIndex = 0; startIndex < endIndex; startIndex++)
                if (SEGMENTATION_POSSIBILITY[startIndex] && DICTIONARY_SET.contains(TEXT.substring(startIndex, endIndex))) {
                    SEGMENTATION_POSSIBILITY[endIndex] = true;
                    break;
                }
        return SEGMENTATION_POSSIBILITY[TEXT.length()];
    }
}