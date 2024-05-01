package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_q_reverse_words;

import java.util.Scanner;

/**
 * <h1>Q. Reverse Words</h1>
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
 * <h2>Given a string S. For each word in S reverse its letters then print it.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Note: words are separated by space.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>I love you</h2>
 * <h1>Output:</h1>
 * <h2>I evol uoy</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>You love me</h2>
 * <h1>Output:</h1>
 * <h2>uoY evol em</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>We are a happy family</h2>
 * <h1>Output:</h1>
 * <h2>eW era a yppah ylimaf</h2>
 */

public class ReverseWordsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final String[] WORDS = INPUT.nextLine().split(" ");
    private static final int WORDS_LENGTH = WORDS.length;

    public static void main(final String[] ARGS) {
        reverseWords();
        printWords();
    }

    private static void printWords() {
        for (int index = 0; index < WORDS_LENGTH; index++) {
            System.out.print(WORDS[index]);
            if (index < WORDS_LENGTH - 1) System.out.print(" ");
        }
    }

    private static void reverseWords() {
        for (int index = 0; index < WORDS_LENGTH; index++)
            WORDS[index] = new String(new StringBuilder(WORDS[index]).reverse());
    }
}