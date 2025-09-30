package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_58_length_of_last_word;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * <br/>
 * A word is a maximal
 * <br/>
 * substring
 * <br/>
 * consisting of non-space characters only.
 * </h2>
 */

public class LengthOfLastWord {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Hadeeth Barmajaa";
        System.out.print(lengthOfLastWord(TEXT));
    }

    private static int lengthOfLastWord(final String TEXT) {
        final String[] WORDS = TEXT.split(" ");
        return WORDS[WORDS.length - 1].length();
    }
}