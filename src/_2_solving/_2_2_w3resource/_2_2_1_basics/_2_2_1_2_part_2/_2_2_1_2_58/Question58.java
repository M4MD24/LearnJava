package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_58;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a basic string compression method using repeated character counts.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input text: aaaabbbbcccccddddeeee</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The compressed string along with the counts of repeated characters is: a4b4c5d4e4</h2>
 */

public class Question58 {
    public static void main(final String[] PARAMETERS) {
        final StringBuffer TEXT = new StringBuffer("aaaabbbbcccccddddeeee");
        System.out.printf("Input text: %s\n", TEXT);
        System.out.printf("The compressed text along with counts of repeated characters is: %s", compressText(TEXT));
    }

    private static StringBuffer compressText(StringBuffer text) {
        final byte[] CHARACTERS_AND_HER_COUNT = new byte[26];
        countOfCharacters(text, CHARACTERS_AND_HER_COUNT);
        text = addCharacters(CHARACTERS_AND_HER_COUNT);
        return text;
    }

    private static StringBuffer addCharacters(final byte[] CHARACTERS_AND_HER_COUNT) {
        final StringBuffer TEXT = new StringBuffer();
        for (int index = 0; index < 26; index++)
            if (CHARACTERS_AND_HER_COUNT[index] != 0)
                TEXT.append(String.format("%c%c",
                        (char) (index + 'a'),
                        CHARACTERS_AND_HER_COUNT[index]));
        return TEXT;
    }

    private static void countOfCharacters(StringBuffer text, byte[] CHARACTERS_AND_HER_COUNT) {
        for (int index = 0; index < text.length(); index++)
            CHARACTERS_AND_HER_COUNT[text.charAt(index) - 'a']++;
    }
}