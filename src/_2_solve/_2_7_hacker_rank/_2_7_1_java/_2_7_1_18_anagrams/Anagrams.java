package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_18_anagrams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_18_anagrams.files <h2>Question</h2>
 */

public class Anagrams {
    public static void main(final String[] ARGUMENTS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final String FIRST_TEXT = INPUT.readLine(),
                SECOND_TEXT = INPUT.readLine();
        OUTPUT.write(isAnagram(FIRST_TEXT, SECOND_TEXT) ? "Anagrams" : "Not Anagrams");
        OUTPUT.flush();
    }

    private static boolean isAnagram(final String FIRST_TEXT, final String SECOND_TEXT) {
        if (FIRST_TEXT.length() != SECOND_TEXT.length())
            return false;
        else {
            final byte[] LETTERS = new byte[26];
            for (final char CHARACTER : FIRST_TEXT.toLowerCase().toCharArray())
                LETTERS[CHARACTER - 'a']++;
            for (final char CHARACTER : SECOND_TEXT.toLowerCase().toCharArray()) {
                LETTERS[CHARACTER - 'a']--;
                if (LETTERS[CHARACTER - 'a'] < 0)
                    return false;
            }
            return true;
        }
    }
}