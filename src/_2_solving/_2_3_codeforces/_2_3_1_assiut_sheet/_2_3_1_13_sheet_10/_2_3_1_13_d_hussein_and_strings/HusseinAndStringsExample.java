package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_d_hussein_and_strings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * <h1>D. Hussein and Strings</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * Hussein has two strings A, B he can make only one operation that can swap any two letters in the String A.
 * <br/>
 * Given two strings A, B if Hussein can make them equal print "YES", otherwise print "NO".
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Hussein will make this operation exactly one.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * aba
 * <br/>
 * aab
 * </h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * abc
 * <br/>
 * def
 * </h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class HusseinAndStringsExample {
    public static void main(final String[] ARGS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        OUTPUT.write(canHusseinSwitch(new StringBuffer(INPUT.readLine()), new StringBuffer(INPUT.readLine())) ? "YES" : "NO");
        OUTPUT.flush();
    }

    private static boolean canHusseinSwitch(final StringBuffer FIRST_TEXT, final StringBuffer SECOND_TEXT) {
        if (FIRST_TEXT.length() != SECOND_TEXT.length()) return false;
        else {
            if (FIRST_TEXT.compareTo(SECOND_TEXT) == 0) {
                final HashSet<Character> UNIQUE_CHARACTERS = new HashSet<>();
                for (int index = 0; index < FIRST_TEXT.length(); index++) UNIQUE_CHARACTERS.add(FIRST_TEXT.charAt(index));
                return UNIQUE_CHARACTERS.size() != FIRST_TEXT.length();
            } else {
                byte difference = 0;
                int firstCharacterIndex = 0, lastCharacterIndex = 1, counter = 0;
                boolean firstCharacterDifferent = false;
                for (int index = 0; index < FIRST_TEXT.length(); index++) {
                    if (FIRST_TEXT.charAt(index) != SECOND_TEXT.charAt(index)) {
                        difference++;
                        counter++;
                    }
                    if (difference == 1 && !firstCharacterDifferent) {
                        firstCharacterIndex = index;
                        firstCharacterDifferent = true;
                    }
                    if (difference == 2) {
                        lastCharacterIndex = index;
                        break;
                    }
                }
                if (counter == 2) {
                    final char TEMPORARY_CHARACTER = FIRST_TEXT.charAt(firstCharacterIndex);
                    FIRST_TEXT.setCharAt(firstCharacterIndex, FIRST_TEXT.charAt(lastCharacterIndex));
                    FIRST_TEXT.setCharAt(lastCharacterIndex, TEMPORARY_CHARACTER);
                    return FIRST_TEXT.compareTo(SECOND_TEXT) == 0;
                } else return false;
            }
        }
    }
}