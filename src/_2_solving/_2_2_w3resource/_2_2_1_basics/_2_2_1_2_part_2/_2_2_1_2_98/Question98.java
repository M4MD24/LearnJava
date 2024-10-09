package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_98;

/**
 * <h1>Problem:</h1>
 * <h2>
 * From Wikipedia, An abecedarian (or abecedary) is an inscription consisting of the letters of an alphabet, almost always listed in order. Typically, abecedarian (or abecedarian) are practice exercises.
 * <br/>
 * Write a Java program to check if each letter of a given word (Abecedarian word) is less than the one before it.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a word: ABCD
 * <br/>
 * Is Abecedarian word? true
 * </h2>
 */

public class Question98 {
    public static void main(final String[] PARAMETERS) {
        final String WORD = "ABCD";
        System.out.printf("Input a word: %s\n", WORD);
        System.out.printf("Is Abecadrian word?: %b", IsAbecedarianWord(WORD));
    }

    private static boolean IsAbecedarianWord(final String WORD) {
        byte lastCharacter = (byte) WORD.charAt(0);
        for (int index = 1; index < WORD.length(); index++)
            if (lastCharacter >= WORD.charAt(index))
                return false;
        return true;
    }
}