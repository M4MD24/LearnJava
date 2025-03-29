package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_35;

import java.util.ArrayList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if two strings are isomorphic or not.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Is abca and zbxz are Isomorphic? true</h2>
 */

public class Question135 {
    private static final StringBuffer FIRST_TEXT = new StringBuffer("abca"),
            SECOND_TEXT = new StringBuffer("zbxz");

    public static void main(final String[] ARGUMENTS) {
        System.out.printf("Is abca and zbxz are Isomorphic? %b", isIsomorphic());
    }

    private static boolean isIsomorphic() {
        if (FIRST_TEXT.length() == SECOND_TEXT.length()) {
            final ArrayList<CharacterAndHerCount> FIRST_CHARACTERS_AND_HER_COUNT = new ArrayList<>(),
                    SECOND_CHARACTERS_AND_HER_COUNT = new ArrayList<>();
            readFirstText(FIRST_CHARACTERS_AND_HER_COUNT);
            readSecondText(SECOND_CHARACTERS_AND_HER_COUNT);
            for (int index = 0; index < FIRST_CHARACTERS_AND_HER_COUNT.size(); index++)
                if (FIRST_CHARACTERS_AND_HER_COUNT.get(index).getCount() != SECOND_CHARACTERS_AND_HER_COUNT.get(index).getCount())
                    return false;
            return true;
        } else return true;
    }

    private static void readSecondText(final ArrayList<CharacterAndHerCount> SECOND_CHARACTERS_AND_HER_COUNT) {
        for (int round = 0; round < SECOND_TEXT.length(); round++) {
            final CharacterAndHerCount CURRENT_CHARACTER_AND_HER_COUNT = new CharacterAndHerCount();
            CURRENT_CHARACTER_AND_HER_COUNT.setCharacter(SECOND_TEXT.charAt(round));
            CURRENT_CHARACTER_AND_HER_COUNT.setCount(1);
            if (SECOND_CHARACTERS_AND_HER_COUNT.isEmpty())
                SECOND_CHARACTERS_AND_HER_COUNT.add(CURRENT_CHARACTER_AND_HER_COUNT);
            else
                addForCharacterAndHerCount(SECOND_CHARACTERS_AND_HER_COUNT, CURRENT_CHARACTER_AND_HER_COUNT);
        }
    }

    private static void readFirstText(final ArrayList<CharacterAndHerCount> FIRST_CHARACTERS_AND_HER_COUNT) {
        for (int round = 0; round < FIRST_TEXT.length(); round++) {
            final CharacterAndHerCount CURRENT_CHARACTER_AND_HER_COUNT = new CharacterAndHerCount();
            CURRENT_CHARACTER_AND_HER_COUNT.setCharacter(FIRST_TEXT.charAt(round));
            CURRENT_CHARACTER_AND_HER_COUNT.setCount(1);
            if (FIRST_CHARACTERS_AND_HER_COUNT.isEmpty())
                FIRST_CHARACTERS_AND_HER_COUNT.add(CURRENT_CHARACTER_AND_HER_COUNT);
            else
                addForCharacterAndHerCount(FIRST_CHARACTERS_AND_HER_COUNT, CURRENT_CHARACTER_AND_HER_COUNT);
        }
    }

    private static void addForCharacterAndHerCount(final ArrayList<CharacterAndHerCount> CURRENT_CHARACTERS_AND_HER_COUNT, final CharacterAndHerCount CURRENT_CHARACTER_AND_HER_COUNT) {
        for (final CharacterAndHerCount CHARACTER_AND_HER_COUNT : CURRENT_CHARACTERS_AND_HER_COUNT) {
            if (CURRENT_CHARACTER_AND_HER_COUNT.getCharacter() == CHARACTER_AND_HER_COUNT.getCharacter()) {
                CURRENT_CHARACTER_AND_HER_COUNT.setCount(CURRENT_CHARACTER_AND_HER_COUNT.getCount() + 1);
                CURRENT_CHARACTERS_AND_HER_COUNT.add(CURRENT_CHARACTERS_AND_HER_COUNT.indexOf(CHARACTER_AND_HER_COUNT), CURRENT_CHARACTER_AND_HER_COUNT);
                CURRENT_CHARACTERS_AND_HER_COUNT.remove(CHARACTER_AND_HER_COUNT);
                return;
            }
        }
        CURRENT_CHARACTERS_AND_HER_COUNT.add(CURRENT_CHARACTER_AND_HER_COUNT);
    }
}

class CharacterAndHerCount {
    private char character;
    private int count;

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}