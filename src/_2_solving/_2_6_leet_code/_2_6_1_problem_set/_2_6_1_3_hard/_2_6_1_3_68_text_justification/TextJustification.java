package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_68_text_justification;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an array of strings words and a width maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.
 * <br/>
 * You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.
 * <br/>
 * Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
 * <br/>
 * For the last line of text, it should be left-justified, and no extra space is inserted between words.
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 * <li>A word is defined as a character sequence consisting of non-space characters only.</li>
 * <br/>
 * <li>Each word's length is guaranteed to be greater than 0 and not exceed maxWidth.</li>
 * <br/>
 * <li>The input array words contains at least one word.</li>
 * </ul>
 */

public class TextJustification {
    public static void main(final String[] PARAMETERS) {
        final String[] WORDS = {"This", "is", "an", "example", "of", "text", "justification."};
        final int MAXIMUM_WIDTH = 16;
        System.out.print(fullJustify(WORDS, MAXIMUM_WIDTH));
    }

    private static List<String> fullJustify(final String[] WORDS, final int MAXIMUM_WIDTH) {
        final List<String> JUSTIFIED_LINES = new ArrayList<>();
        for (int currentIndex = 0, nextWordIndex; currentIndex < WORDS.length; currentIndex = nextWordIndex) {
            int currentLineLength = -1;
            for (nextWordIndex = currentIndex; nextWordIndex < WORDS.length && currentLineLength + WORDS[nextWordIndex].length() + 1 <= MAXIMUM_WIDTH; nextWordIndex++)
                currentLineLength += WORDS[nextWordIndex].length() + 1;
            final StringBuilder CURRENT_LINE = new StringBuilder(WORDS[currentIndex]);
            final int REMAINING_SPACES = MAXIMUM_WIDTH - currentLineLength;
            final int GAPS_BETWEEN_WORDS = nextWordIndex - currentIndex - 1;
            if (nextWordIndex == WORDS.length || GAPS_BETWEEN_WORDS == 0) {
                for (int index = currentIndex + 1; index < nextWordIndex; index++)
                    CURRENT_LINE.append(" ").append(WORDS[index]);
                while (CURRENT_LINE.length() < MAXIMUM_WIDTH)
                    CURRENT_LINE.append(" ");
            } else {
                final int SPACES_BETWEEN_WORDS = REMAINING_SPACES / GAPS_BETWEEN_WORDS;
                final int EXTRA_SPACES = REMAINING_SPACES % GAPS_BETWEEN_WORDS;
                for (int index = currentIndex + 1; index < nextWordIndex; index++) {
                    CURRENT_LINE.append(" ".repeat(Math.max(
                            0,
                            SPACES_BETWEEN_WORDS + (index - currentIndex <= EXTRA_SPACES
                                    ? 1
                                    : 0
                            ) + 1
                    )));
                    CURRENT_LINE.append(WORDS[index]);
                }
            }
            JUSTIFIED_LINES.add(CURRENT_LINE.toString());
        }
        return JUSTIFIED_LINES;
    }
}