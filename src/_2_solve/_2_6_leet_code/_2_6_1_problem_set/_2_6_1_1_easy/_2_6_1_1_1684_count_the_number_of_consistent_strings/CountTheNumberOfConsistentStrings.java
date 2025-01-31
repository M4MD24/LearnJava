package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_1684_count_the_number_of_consistent_strings;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
 * <br/>
 * <br/>
 * Return the number of consistent strings in the array words.
 * </h2>
 */

public class CountTheNumberOfConsistentStrings {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
    }

    private static int countConsistentStrings(final String ALLOWED_WORD, final String[] WORDS) {
        System.gc();
        final boolean[] ALLOWED_CHARACTERS = new boolean[26];
        int consistentCount = WORDS.length;
        for (final char CHARACTER : ALLOWED_WORD.toCharArray())
            ALLOWED_CHARACTERS[CHARACTER - 'a'] = true;
        for (final String WORD : WORDS)
            for (final char CHARACTER : WORD.toCharArray())
                if (!ALLOWED_CHARACTERS[CHARACTER - 'a']) {
                    consistentCount--;
                    break;
                }
        return consistentCount;
    }

    /*private static int countConsistentStrings(final String ALLOWED_WORD, final String[] WORDS) {
        final HashSet<Character> ALLOWED_CHARACTER_SET = new HashSet<>();
        for (final char CHARACTER : ALLOWED_WORD.toCharArray())
            ALLOWED_CHARACTER_SET.add(CHARACTER);
        int countOfConsistentStrings = 0;
        for (final String WORD : WORDS) {
            boolean isConsistentString = true;
            for (final char CHARACTER : WORD.toCharArray())
                if (!ALLOWED_CHARACTER_SET.contains(CHARACTER)) {
                    isConsistentString = false;
                    break;
                }
            countOfConsistentStrings += isConsistentString ? 1 : 0;
        }
        return countOfConsistentStrings;
    }*/
}