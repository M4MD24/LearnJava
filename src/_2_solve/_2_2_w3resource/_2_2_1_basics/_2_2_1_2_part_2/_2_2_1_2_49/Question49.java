package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_49;

import java.util.HashMap;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if a string follows a given pattern.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Is the "red black black red" and "xyyx" matched? true
 * <br/>
 * Is the "red black black green" and "xyyx" matched? false
 * <br/>
 * Is the "red black black red" and "xxxx" matched? false
 * <br/>
 * Is the "red red red red" and "xxxx" matched? true
 * </h2>
 */

public class Question49 {
    private static final String[] STRINGS = {"red black black red", "red black black green", "red black black red", "red red red red"},
            PATTERNS = {"xyyx", "xyyx", "xxxx", "xxxx"};

    public static void main(final String[] PARAMETERS) {
        for (int index = 0; index < STRINGS.length; index++)
            System.out.printf("Is the \"%s\" and \"%s\" matched? %b\n",
                    STRINGS[index],
                    PATTERNS[index],
                    isMatched(STRINGS[index], PATTERNS[index]));
    }

    private static boolean isMatched(final String STRING, final String PATTERN) {
        final String[] WORDS = STRING.split(" ");
        if (PATTERN.length() != WORDS.length)
            return false;
        final HashMap<Character, String> PATTERN_AND_STRING = new HashMap<>();
        for (int index = 0; index < PATTERN.length(); index++) {
            final char CHARACTER = PATTERN.charAt(index);
            if (PATTERN_AND_STRING.containsKey(CHARACTER)) {
                if (!PATTERN_AND_STRING.get(CHARACTER).equals(WORDS[index]))
                    return false;
            } else {
                if (PATTERN_AND_STRING.containsValue(WORDS[index]))
                    return false;
                PATTERN_AND_STRING.put(CHARACTER, WORDS[index]);
            }
        }
        return true;
    }
}