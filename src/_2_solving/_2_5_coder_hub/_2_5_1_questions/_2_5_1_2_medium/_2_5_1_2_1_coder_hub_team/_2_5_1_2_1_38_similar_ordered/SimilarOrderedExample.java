package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_38_similar_ordered;

public class SimilarOrderedExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(getLongestSimilarOrderedOrderedSubString("washing", "waiting"));
        System.out.println(getLongestSimilarOrderedOrderedSubString("me", "meet"));
        System.out.println(getLongestSimilarOrderedOrderedSubString("Reem", "Nouf"));
        System.out.print(getLongestSimilarOrderedOrderedSubString("abcdefggghi", "abcdefghirr"));
    }

    private static String getLongestSimilarOrderedOrderedSubString(final String FIRST_TEXT, final String SECOND_TEXT) {
        final char[] SORTED_UNIQUE_FIRST_TEXT = FIRST_TEXT.chars()
                .distinct()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString()
                .toCharArray();

        final char[] SORTED_UNIQUE_SECOND_TEXT = SECOND_TEXT.chars()
                .distinct()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString()
                .toCharArray();

        final StringBuilder LONGEST_SIMILAR_ORDERED_CHARACTERS = findLongestSimilarOrderedSubString(SORTED_UNIQUE_FIRST_TEXT, SORTED_UNIQUE_SECOND_TEXT);

        return LONGEST_SIMILAR_ORDERED_CHARACTERS.isEmpty()
                ? "No matches found"
                : LONGEST_SIMILAR_ORDERED_CHARACTERS.toString();
    }

    private static StringBuilder findLongestSimilarOrderedSubString(final char[] FIRST_TEXT_CHARACTER, final char[] SECOND_TEXT_CHARACTER) {
        StringBuilder longestSimilarOrderedCharacters = new StringBuilder(),
                currentSimilarOrderedCharacters = new StringBuilder();
        for (int round = 0; round < FIRST_TEXT_CHARACTER.length; round++) {
            final char CURRENT_CHARACTER = FIRST_TEXT_CHARACTER[round];
            boolean isCurrentCharacterSameAnotherCharacter = false,
                    isContainCurrentCharacterInCurrentSimilarOrderedCharacters = longestSimilarOrderedCharacters.chars().anyMatch(character -> character == CURRENT_CHARACTER);
            if (!isContainCurrentCharacterInCurrentSimilarOrderedCharacters)
                for (final char ANOTHER_CHARACTER : SECOND_TEXT_CHARACTER) {
                    if (FIRST_TEXT_CHARACTER[round] == ANOTHER_CHARACTER) {
                        currentSimilarOrderedCharacters.append(FIRST_TEXT_CHARACTER[round]);
                        isCurrentCharacterSameAnotherCharacter = true;
                        break;
                    }
                }
            else isCurrentCharacterSameAnotherCharacter = true;
            if (!isCurrentCharacterSameAnotherCharacter || round == FIRST_TEXT_CHARACTER.length - 1) {
                if (currentSimilarOrderedCharacters.length() > longestSimilarOrderedCharacters.length())
                    longestSimilarOrderedCharacters = currentSimilarOrderedCharacters;
                currentSimilarOrderedCharacters = new StringBuilder();
            }
        }
        return longestSimilarOrderedCharacters;
    }
}