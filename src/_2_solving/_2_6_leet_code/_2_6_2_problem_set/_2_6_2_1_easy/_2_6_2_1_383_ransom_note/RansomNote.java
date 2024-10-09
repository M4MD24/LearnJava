package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_1_easy._2_6_2_1_383_ransom_note;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given two strings <code>ransomNote</code> and <code>magazine</code>, return <code>true</code><em> if </em><code>ransomNote</code><em> can be constructed by using the letters from </em><code>magazine</code><em> and </em><code>false</code><em> otherwise</em>.
 * <br/>
 * <br/>
 * Each letter in <code>magazine</code> can only be used once in <code>ransomNote</code>.
 * </h2>
 */

public class RansomNote {
    public static void main(final String[] PARAMETERS) {
        System.out.print(canConstruct("aab", "baa"));
    }

    private static boolean canConstruct(final String RANSOM_NOTE, final String MAGAZINE) {
        final int[] TARGET_CHARACTERS = new int[26];
        for (final char CHARACTER : MAGAZINE.toCharArray())
            TARGET_CHARACTERS[CHARACTER - 'a']++;
        for (final char CHARACTER : RANSOM_NOTE.toCharArray())
            if (--TARGET_CHARACTERS[CHARACTER - 'a'] < 0)
                return false;
        return true;
    }
}