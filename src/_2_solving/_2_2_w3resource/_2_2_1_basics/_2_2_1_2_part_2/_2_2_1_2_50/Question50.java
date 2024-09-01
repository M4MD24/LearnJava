package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_50;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to remove duplicate letters and arrange them in lexicographical order from a given string containing only lowercase letters.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>In mathematics, the lexicographic or lexicographical order (also known as lexical order, dictionary order, alphabetical order or lexicographic(al) product) is a generalization of the way words are alphabetically ordered based on the alphabetical order of their component letters.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original string: zxywooxz
 * <br/>
 * After removing duplicate characters: owxyz
 * </h2>
 */

public class Question50 {
    public static void main(final String[] ARGS) {
        final String CHARACTERS = "zxywooxz";
        System.out.printf("Original characters: %s\n", CHARACTERS);
        printSortCharactersAndDeleteDuplicates(CHARACTERS);
    }

    private static void printSortCharactersAndDeleteDuplicates(final String CHARACTERS) {
        System.out.print("After removing duplicate characters: ");
        final byte[] CHARACTERS_AFTER_SORT_DELETE_DUPLICATES = new byte[26];
        sortCharactersAndDeleteDuplicates(CHARACTERS, CHARACTERS_AFTER_SORT_DELETE_DUPLICATES);
        printCharacters(CHARACTERS_AFTER_SORT_DELETE_DUPLICATES);
    }

    private static void printCharacters(final byte[] CHARACTERS_AFTER_SORT_DELETE_DUPLICATES) {
        for (int index = 0; index < 26; index++)
            if (CHARACTERS_AFTER_SORT_DELETE_DUPLICATES[index] > 0)
                System.out.print((char) (index + 'a'));
    }

    private static void sortCharactersAndDeleteDuplicates(final String CHARACTERS, final byte[] CHARACTERS_AFTER_SORT_DELETE_DUPLICATES) {
        for (int index = 0; index < CHARACTERS.length(); index++)
            CHARACTERS_AFTER_SORT_DELETE_DUPLICATES[CHARACTERS.charAt(index) - 'a']++;
    }
}