package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_3_hard._2_6_2_3_30_substring_with_concatenation_of_all_words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given a string s and an array of strings words. All the strings of words are of the same length.
 * <br/>
 * A concatenated string is a string that exactly contains all the strings of any permutation of words concatenated.
 * <br/>
 * For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated string because it is not the concatenation of any permutation of words.
 * <br/>
 * Return an array of the starting indices of all the concatenated substrings in s. You can return the answer in any order.
 * </h2>
 */

public class SubstringWithConcatenationOfAllWords {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "barfoothefoobarman";
        final String[] WORDS = {"foo", "bar"};
        System.out.print(findSubstring(TEXT, WORDS));
    }

    private static List<Integer> findSubstring(final String TEXT, final String[] WORDS) {
        final int WORD_LENGTH = WORDS[0].length(),
                TEXT_LENGTH = TEXT.length();
        final List<Integer> SUB_TEXTS = new ArrayList<>();
        final Map<String, Integer> WORD_COUNT = new HashMap<>();
        for (final String WORD : WORDS)
            WORD_COUNT.put(
                    WORD,
                    WORD_COUNT.getOrDefault(
                            WORD,
                            0
                    ) + 1
            );
        for (int index = 0; index < WORD_LENGTH; index++) {
            final Map<String, Integer> SEEN = new HashMap<>();
            for (int startPosition = index, endPosition = index, count = 0; endPosition + WORD_LENGTH <= TEXT_LENGTH; endPosition += WORD_LENGTH) {
                final String WORD = TEXT.substring(
                        endPosition,
                        endPosition + WORD_LENGTH
                );
                if (WORD_COUNT.containsKey(WORD)) {
                    SEEN.put(
                            WORD,
                            SEEN.getOrDefault(
                                    WORD,
                                    0
                            ) + 1
                    );
                    count++;
                    while (SEEN.get(WORD) > WORD_COUNT.get(WORD)) {
                        final String REMOVE_WORD = TEXT.substring(
                                startPosition,
                                startPosition + WORD_LENGTH
                        );
                        SEEN.put(
                                REMOVE_WORD,
                                SEEN.get(REMOVE_WORD) - 1
                        );
                        startPosition += WORD_LENGTH;
                        count--;
                    }
                    if (count == WORDS.length)
                        SUB_TEXTS.add(startPosition);
                } else {
                    SEEN.clear();
                    count = 0;
                    startPosition = endPosition + WORD_LENGTH;
                }
            }
        }
        return SUB_TEXTS;
    }
}