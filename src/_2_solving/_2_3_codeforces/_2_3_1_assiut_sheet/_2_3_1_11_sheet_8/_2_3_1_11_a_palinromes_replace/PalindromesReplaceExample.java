package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_a_palinromes_replace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>A. Palindromes Replace</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * As it is known Saeed loves palindrome too much. A palindrome is a string that reads the same forwards as backwards.
 * <br/>
 * One day his best friend Mina gave him a string and told him that this string was a palindrome.
 * <br/>
 * When Saeed arrived home he found that some letters are missing and replaced them with '?' letter and now he wonders if there is a way to replace all the '?' with lowercase letters so that the final string is a palindrome.
 * <br/>
 * If there are multiple such strings, choose the lexicographically smallest one.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>a?z?</h2>
 * <h1>Output:</h1>
 * <h2>azza</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>aba</h2>
 * <h1>Output:</h1>
 * <h2>aba</h2>
 */

public class PalindromesReplaceExample {
    private static StringBuilder text;

    public static void main(final String[] ARGS) throws IOException {
        inputValue();
        replaceQuestionMarks();
    }

    private static void replaceQuestionMarks() {
        final byte LENGTH = (byte) text.length();
        for (byte start = 0, end = (byte) (LENGTH - 1); start < end; start++, end--) {
            final char FIRST_CHARACTER = text.charAt(start),
                    SECOND_CHARACTER = text.charAt(end);
            final boolean CHECK_FIRST_CHARACTER_EQUAL_QUESTION_MARK = FIRST_CHARACTER == '?',
                    CHECK_SECOND_CHARACTER_EQUAL_QUESTION_MARK = SECOND_CHARACTER == '?';
            if (!CHECK_FIRST_CHARACTER_EQUAL_QUESTION_MARK &&
                    !CHECK_SECOND_CHARACTER_EQUAL_QUESTION_MARK &&
                    FIRST_CHARACTER != SECOND_CHARACTER) {
                System.out.print(-1);
                return;
            }
            if (CHECK_FIRST_CHARACTER_EQUAL_QUESTION_MARK && CHECK_SECOND_CHARACTER_EQUAL_QUESTION_MARK) {
                text.setCharAt(start, 'a');
                text.setCharAt(end, 'a');
            } else if (CHECK_FIRST_CHARACTER_EQUAL_QUESTION_MARK)
                text.setCharAt(start, SECOND_CHARACTER);
            else if (CHECK_SECOND_CHARACTER_EQUAL_QUESTION_MARK)
                text.setCharAt(end, FIRST_CHARACTER);
        }
        if (LENGTH % 2 == 1 && text.charAt(LENGTH / 2) == '?')
            text.setCharAt(LENGTH / 2, 'a');
        System.out.print(text);
    }

    private static void inputValue() throws IOException {
        text = new StringBuilder(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }
}