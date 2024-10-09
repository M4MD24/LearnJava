package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_54;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the smallest window in a string containing all characters in another string.</h2>
 */

public class Question54 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getSmallestSubStringContainingAllCharactersFromTargetTextInSourceText("Nullexia for Programming", "NP"));
    }

    private static String getSmallestSubStringContainingAllCharactersFromTargetTextInSourceText(final String SOURCE_TEXT, final String TARGET_TEXT) {
        String smallestSubStringContainingAllCharactersFromSourceTextInTargetText = SOURCE_TEXT;
        for (int startIndex = 0; startIndex < SOURCE_TEXT.length() - TARGET_TEXT.length(); startIndex++) {
            for (int endIndex = startIndex + TARGET_TEXT.length(); endIndex < SOURCE_TEXT.length(); endIndex++) {
                final String CURRENT_SUBSTRING_CONTAINING_ALL_CHARACTERS_FROM_FIRST_TEXT_IN_SECOND_TEXT = SOURCE_TEXT.substring(startIndex, endIndex);
                if (areTargetTextAllContainedInSourceText(CURRENT_SUBSTRING_CONTAINING_ALL_CHARACTERS_FROM_FIRST_TEXT_IN_SECOND_TEXT, TARGET_TEXT) &&
                        CURRENT_SUBSTRING_CONTAINING_ALL_CHARACTERS_FROM_FIRST_TEXT_IN_SECOND_TEXT.length() < smallestSubStringContainingAllCharactersFromSourceTextInTargetText.length())
                    smallestSubStringContainingAllCharactersFromSourceTextInTargetText = CURRENT_SUBSTRING_CONTAINING_ALL_CHARACTERS_FROM_FIRST_TEXT_IN_SECOND_TEXT;
            }
        }
        if (smallestSubStringContainingAllCharactersFromSourceTextInTargetText.equals(SOURCE_TEXT)) {
            if (areTargetTextAllContainedInSourceText(smallestSubStringContainingAllCharactersFromSourceTextInTargetText, TARGET_TEXT))
                return smallestSubStringContainingAllCharactersFromSourceTextInTargetText;
            else
                return "Nothing!";
        } else
            return smallestSubStringContainingAllCharactersFromSourceTextInTargetText;
    }

    private static boolean areTargetTextAllContainedInSourceText(final String SOURCE_TEXT, final String TARGET_TEXT) {
        for (final char TARGET_TEXT_CHARACTER : TARGET_TEXT.toCharArray()) {
            boolean areTargetTextAllContainedInSourceText = false;
            for (final char SOURCE_TEXT_CHARACTER : SOURCE_TEXT.toCharArray())
                if (TARGET_TEXT_CHARACTER == SOURCE_TEXT_CHARACTER) {
                    areTargetTextAllContainedInSourceText = true;
                    break;
                }
            if (!areTargetTextAllContainedInSourceText)
                return false;
        }
        return true;
    }
}