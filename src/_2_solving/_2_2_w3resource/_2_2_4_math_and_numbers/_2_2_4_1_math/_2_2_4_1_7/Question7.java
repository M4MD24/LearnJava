package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_7;

import java.util.HashMap;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert a Roman number to an integer number.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Roman Number: DCCVII
 * <br/>
 * Equivalent Number: 707
 * </h2>
 */

public class Question7 {
    private static final HashMap<Character, Integer> ROMAN_NUMBERS = new HashMap<>();

    static {
        ROMAN_NUMBERS.put('I', 1);
        ROMAN_NUMBERS.put('V', 5);
        ROMAN_NUMBERS.put('X', 10);
        ROMAN_NUMBERS.put('L', 50);
        ROMAN_NUMBERS.put('C', 100);
        ROMAN_NUMBERS.put('D', 500);
        ROMAN_NUMBERS.put('M', 1000);
    }

    public static void main(final String[] PARAMETERS) {
        final String ROMAN_CHARACTERS = "DCCVII";
        System.out.printf("""
                        Roman Numbers:\s%s
                        Equivalent:\s%d""",
                ROMAN_CHARACTERS,
                getEquivalentNumber(ROMAN_CHARACTERS));
    }

    private static int getEquivalentNumber(final String ROMAN_CHARACTERS) {
        int equivalentNumber = 0;
        for (final char ROMAN_CHARACTER : ROMAN_CHARACTERS.toCharArray())
            equivalentNumber += ROMAN_NUMBERS.get(ROMAN_CHARACTER);
        return equivalentNumber;
    }
}