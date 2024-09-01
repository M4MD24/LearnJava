package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the missing string from two given strings.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Missing string: [Solution]</h2>
 */

public class Question40 {
    public static void main(final String[] ARGS) {
        final List<String> MISSING_WORDS = getMissingWords(Arrays.asList("Java Programming Exercises, Practice, Solution".split(" +")),
                Arrays.asList("Java Programming Exercises, Practice,".split(" +")));
        System.out.printf("Missing words: %s", MISSING_WORDS);
    }

    private static ArrayList<String> getMissingWords(final List<String> FIRST_WORDS, final List<String> SECOND_WORDS) {
        final ArrayList<String> MISSING_WORDS = new ArrayList<>();
        if (FIRST_WORDS.size() != SECOND_WORDS.size()) {
            if (FIRST_WORDS.size() > SECOND_WORDS.size())
                findMissingWords(FIRST_WORDS, SECOND_WORDS, MISSING_WORDS);
            else
                findMissingWords(SECOND_WORDS, FIRST_WORDS, MISSING_WORDS);
        }
        return MISSING_WORDS;
    }

    private static void findMissingWords(List<String> CURRENT_WORDS, List<String> ANOTHER_WORDS, ArrayList<String> MISSING_WORDS) {
        for (final String WORD : CURRENT_WORDS)
            if (!ANOTHER_WORDS.contains(WORD))
                MISSING_WORDS.add(WORD);
    }
}