package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_j_count_letters;

import java.util.Scanner;

/**
 * <h1>J. Count Letters</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a string S. Determine how many times does each letter occurred in S.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>aaabbc</h2>
 * <h1>Output:</h1>
 * <h2>
 * a : 3
 * <br/>
 * b : 2
 * <br/>
 * c : 1
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>regff</h2>
 * <h1>Output:</h1>
 * <h2>
 * e : 1
 * <br/>
 * f : 2
 * <br/>
 * g : 1
 * <br/>
 * r : 1
 * </h2>
 */

public class CountLettersExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final String TEXT = INPUT.next();
    private static final int[] COUNTER_TEXT_LETTERS = new int[26];

    public static void main(final String[] ARGS) {
        printTimesEachLetter();
    }

    private static void printTimesEachLetter() {
        countTimesEachLetter();
        for (int index = 0; index < COUNTER_TEXT_LETTERS.length; index++) {
            final int TOTAL_TIMES_LETTER = COUNTER_TEXT_LETTERS[index];
            if (TOTAL_TIMES_LETTER != 0) System.out.println((char) (index + 97) + " : " + TOTAL_TIMES_LETTER);
        }
    }

    private static void countTimesEachLetter() {
        for (int index = 0; index < TEXT.length(); index++) COUNTER_TEXT_LETTERS[TEXT.charAt(index) - 'a']++;
    }
}