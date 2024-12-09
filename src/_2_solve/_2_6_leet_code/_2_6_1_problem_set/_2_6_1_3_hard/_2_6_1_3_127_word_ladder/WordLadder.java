package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_127_word_ladder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * <h1>Problem:</h1>
 * <h2>A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:</h2>
 * <ul>
 *     <li>Every adjacent pair of words differs by a single letter.</li>
 *     <li>Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.</li>
 *     <li>sk == endWord</li>
 * </ul>
 * <h2>Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.</h2>
 */

public class WordLadder {
    public static void main(final String[] PARAMETERS) {
        System.out.print(ladderLength(
                "hit",
                "cog",
                List.of("hot", "dot", "dog", "lot", "log", "cog")
        ));
    }

    private static int ladderLength(final String BEGIN_WORD, final String END_WORD, final List<String> WORD_LIST) {
        final Set<String> WORD_SET = new HashSet<>(WORD_LIST);
        if (WORD_SET.contains(END_WORD)) {
            final Queue<String> WORDS = new LinkedList<>();
            WORDS.add(BEGIN_WORD);
            int transformationCount = 1;
            while (!WORDS.isEmpty()) {
                int COUNT_OF_WORDS = WORDS.size();
                for (int index = 0; index < COUNT_OF_WORDS; index++) {
                    final String CURRENT_WORD = WORDS.poll();
                    assert CURRENT_WORD != null;
                    final char[] WORD_CHARACTERS = CURRENT_WORD.toCharArray();
                    for (int charIndex = 0; charIndex < WORD_CHARACTERS.length; charIndex++) {
                        final char ORIGINAL_CHARACTER = WORD_CHARACTERS[charIndex];
                        for (char letter = 'a'; letter <= 'z'; letter++) {
                            WORD_CHARACTERS[charIndex] = letter;
                            final String TRANSFORMED_WORD = new String(WORD_CHARACTERS);
                            if (TRANSFORMED_WORD.equals(END_WORD))
                                return transformationCount + 1;
                            if (WORD_SET.remove(TRANSFORMED_WORD))
                                WORDS.add(TRANSFORMED_WORD);
                        }
                        WORD_CHARACTERS[charIndex] = ORIGINAL_CHARACTER;
                    }
                }
                transformationCount++;
            }
        }
        return 0;
    }
}