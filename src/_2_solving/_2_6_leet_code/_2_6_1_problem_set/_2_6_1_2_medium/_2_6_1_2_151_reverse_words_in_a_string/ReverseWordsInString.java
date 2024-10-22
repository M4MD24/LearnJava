package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_151_reverse_words_in_a_string;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an input string s, reverse the order of the words.
 * <br/>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * <br/>
 * Return a string of the words in reverse order concatenated by a single space.
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.</h2>
 */

public class ReverseWordsInString {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "  the    sky   is    blue ";
        System.out.print(reverseWords(TEXT));
    }

    private static String reverseWords(final String TEXT) {
        final String[] WORDS = TEXT.trim().replaceAll(" +", " ").split(" ");
        int leftPosition = 0;
        int rightPosition = WORDS.length - 1;
        while (leftPosition < rightPosition) {
            final String TEMPORARY_WORD = WORDS[leftPosition];
            WORDS[leftPosition++] = WORDS[rightPosition];
            WORDS[rightPosition--] = TEMPORARY_WORD;
        }
        return String.join(" ", WORDS);
    }
}