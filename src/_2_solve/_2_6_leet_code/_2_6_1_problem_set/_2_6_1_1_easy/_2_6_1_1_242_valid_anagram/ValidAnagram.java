package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_242_valid_anagram;

/**
 * <h1>Problem:</h1>
 * <h2>Given two strings s and t, return true if t is an anagram of s, and false otherwise.</h2>
 */

public class ValidAnagram {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isAnagram(
                "anagram",
                "nagaram"
        ));
    }

    private static boolean isAnagram(final String SOURCE, final String TARGET) {
        if (SOURCE.length() != TARGET.length())
            return false;
        else
            return areCharactersEqualsSourceText(
                    SOURCE,
                    TARGET,
                    getCountOfCharacters(SOURCE)
            );
    }

    private static boolean areCharactersEqualsSourceText(final String SOURCE, final String TARGET, final int[] COUNT_OF_CHARACTERS) {
        for (int index = 0; index < SOURCE.length(); index++)
            if (--COUNT_OF_CHARACTERS[TARGET.charAt(index) - 'a'] < 0)
                return false;
        return true;
    }

    private static int[] getCountOfCharacters(final String SOURCE) {
        final int[] COUNT_OF_CHARACTERS = new int[26];
        for (int index = 0; index < SOURCE.length(); index++)
            ++COUNT_OF_CHARACTERS[SOURCE.charAt(index) - 'a'];
        return COUNT_OF_CHARACTERS;
    }

// >
    /*private static boolean isAnagram(final String SOURCE, final String TARGET) {
        if (SOURCE.length() != TARGET.length())
            return false;
        else {
            final int[] CHARACTERS_OF_SOURCE = new int[26],
                    CHARACTERS_OF_TARGET = new int[26];
            for (int index = 0; index < SOURCE.length(); index++)
                ++CHARACTERS_OF_SOURCE[SOURCE.charAt(index) - 'a'];
            for (int index = 0; index < SOURCE.length(); index++)
                ++CHARACTERS_OF_TARGET[TARGET.charAt(index) - 'a'];
            return Arrays.equals(CHARACTERS_OF_SOURCE, CHARACTERS_OF_TARGET);
        }
    }*/
}