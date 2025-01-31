package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_37;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the length of the longest substring of a given string without repeating characters.</h2>
 */

public class Question37 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "pickoutthelongestsubstring";
        System.out.print(getLongestContinuousSubSequenceWithoutDuplicateCharacters(TEXT));
    }

    private static String getLongestContinuousSubSequenceWithoutDuplicateCharacters(final String TARGET_TEXT) {
        StringBuilder longestSubText = new StringBuilder();
        int startIndex = 0;
        int currentIndex = startIndex;
        StringBuilder currentSubText = new StringBuilder();
        while (startIndex < TARGET_TEXT.length() &&
                longestSubText.length() <= TARGET_TEXT.length() - startIndex)
            if (currentIndex < TARGET_TEXT.length()) {
                final char CURRENT_CHARACTER = TARGET_TEXT.charAt(currentIndex++);
                if (!currentSubText.toString().contains(String.valueOf(CURRENT_CHARACTER)))
                    currentSubText.append(CURRENT_CHARACTER);
                else {
                    if (currentSubText.length() > longestSubText.length())
                        longestSubText = currentSubText;
                    currentSubText = new StringBuilder();
                    startIndex++;
                    currentIndex = startIndex;
                }
            } else {
                if (currentSubText.length() > longestSubText.length())
                    longestSubText = currentSubText;
                break;
            }
        return String.format("""
                        Longest Continuous SubSequence With out Duplicate Characters: %s
                        Length of Longest Continuous SubSequence Without Duplicate Characters: %d""",
                longestSubText,
                longestSubText.length());
    }
}