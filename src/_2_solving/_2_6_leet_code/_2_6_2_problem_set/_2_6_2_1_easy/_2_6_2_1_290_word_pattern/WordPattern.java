package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_1_easy._2_6_2_1_290_word_pattern;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a pattern and a string s, find if s follows the same pattern.
 * <br/>
 * <br/>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
 * <br/>
 * <br/>
 * <ul>
 * <li>Each letter in pattern maps to exactly one unique word in s.</li>
 * <li>Each unique word in s maps to exactly one letter in pattern.</li>
 * <li>No two letters map to the same word, and no two words map to the same letter.</li>
 * </ul>
 * </h2>
 */

public class WordPattern {
    public static void main(final String[] PARAMETERS) {
        System.out.print(wordPattern(
                "abba",
                "apple orange orange apple"
        ));
    }

    private static boolean wordPattern(final String PATTERN, final String TEXT) {
        final String[] WORDS = TEXT.split(" ");
        if (PATTERN.length() != WORDS.length)
            return false;
        else {
            for (int index = 0; index < PATTERN.length(); index++)
                if (PATTERN.indexOf(PATTERN.charAt(index)) != indexOf(WORDS, WORDS[index]))
                    return false;
            return true;
        }
    }

    private static int indexOf(final String[] WORDS, final String WORD) {
        for (int index = 0; index < WORDS.length; index++)
            if (WORDS[index].equals(WORD))
                return index;
        return -1;
    }

// >
    /*private static boolean wordPattern(final String PATTERN, final String TEXT) {
        if (PATTERN.length() != WORDS.length)
            return false;
        else {
            final Map<Character, String> UNIQUE_CHARACTERS_AND_WORDS = new HashMap<>();
            final String[] WORDS = TEXT.split(" ");
            putUniqueCharactersAndWords(PATTERN, WORDS, UNIQUE_CHARACTERS_AND_WORDS);
            for (int index = 0; index < PATTERN.length(); index++)
                if (!UNIQUE_CHARACTERS_AND_WORDS.get(PATTERN.charAt(index)).equals(WORDS[index]))
                    return false;
            return true;
        }
    }

    private static void putUniqueCharactersAndWords(final String PATTERN, final String[] WORDS, final Map<Character, String> COUNT_OF_WORDS) {
        final Character[] UNIQUE_CHARACTERS = PATTERN.chars().distinct().mapToObj(character -> (char) character).toArray(Character[]::new);
        final String[] UNIQUE_WORDS = Arrays.stream(WORDS).distinct().toArray(String[]::new);
        for (int index = 0; index < UNIQUE_WORDS.length; index++)
            COUNT_OF_WORDS.put(UNIQUE_CHARACTERS[index], UNIQUE_WORDS[index]);
    }*/
}