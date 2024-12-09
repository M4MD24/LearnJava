package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_17_letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 * <br/>
 * <br/>
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * </h2>
 *
 * @see _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_17_letter_combinations_of_a_phone_number.images <h2>Telephone KeyBoard</h2>
 */

public class LetterCombinationsOfPhoneNumber {
    public static void main(final String[] PARAMETERS) {
        System.out.print(letterCombinations("23456789"));
    }

    private static List<String> letterCombinations(final String DIGITS) {
        if (DIGITS.isEmpty())
            return new ArrayList<>();
        else {
            final List<String> LETTER_COMBINATIONS = new ArrayList<>();
            final Map<Character, String> TELEPHONE_KEYBOARD = new HashMap<>() {{
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }};
            backtrackDigits(
                    LETTER_COMBINATIONS,
                    TELEPHONE_KEYBOARD,
                    DIGITS,
                    new StringBuilder(),
                    0
            );
            return LETTER_COMBINATIONS;
        }
    }

    private static void backtrackDigits(
            final List<String> allCombinations,
            final Map<Character, String> PHONE_KEYBOARD,
            final String DIGITS,
            final StringBuilder CURRENT_COMBINATION,
            final int INDEX
    ) {
        if (INDEX == DIGITS.length())
            allCombinations.add(CURRENT_COMBINATION.toString());
        else {
            for (final char LETTER : PHONE_KEYBOARD.get(DIGITS.charAt(INDEX)).toCharArray()) {
                CURRENT_COMBINATION.append(LETTER);
                backtrackDigits(allCombinations, PHONE_KEYBOARD, DIGITS, CURRENT_COMBINATION, INDEX + 1);
                CURRENT_COMBINATION.deleteCharAt(CURRENT_COMBINATION.length() - 1);
            }
        }
    }
}