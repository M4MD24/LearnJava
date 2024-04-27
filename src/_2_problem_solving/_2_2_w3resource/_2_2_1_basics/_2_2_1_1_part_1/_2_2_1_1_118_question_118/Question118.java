package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_118_question_118;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string.</h2>
 */

public class Question118 {
    final static Scanner input = new Scanner(System.in);
    static String TEXT,
            TARGET_TEXT;
    static int index,
            indexTarget;

    public static void main(final String[] ARGS) {
        enterValues();
    }

    private static void enterValues() {
        System.out.print("Input text: ");
        TEXT = input.nextLine();

        System.out.print("Input target string: ");
        TARGET_TEXT = input.nextLine();

        getFirstOccurrence(TEXT, TARGET_TEXT);
    }

    private static void getFirstOccurrence(final String TEXT, String TARGET_TEXT) {
        indexTarget = 0;
        for (index = 0; index < TEXT.length() && indexTarget != TARGET_TEXT.length(); index++) {
            if (TEXT.charAt(index) == TARGET_TEXT.charAt(indexTarget)) indexTarget++;
            else indexTarget = 0;
        }
        System.out.print((indexTarget == TARGET_TEXT.length()) ? index - 1 : "Nothing");
    }
}