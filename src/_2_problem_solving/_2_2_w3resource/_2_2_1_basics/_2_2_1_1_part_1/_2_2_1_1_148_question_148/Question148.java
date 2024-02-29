package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_148_question_148;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to find the index of the first unique character in a given string.
 * <br/>
 * Assume that there is at least one unique character in the string.
 * </h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input text: Nullexia</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original String: Nullexia
 * <br/>
 * First unique character of the above: 0
 * </h2>
 */

public class Question148 {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input text: ");
        final String TEXT = INPUT.nextLine();
        System.out.printf("Original String: %s\nFirst unique character of the above: %s",
                TEXT,
                getUniqueCharacter(TEXT));
    }

    private static String getUniqueCharacter(final String TEXT) {
        final char[] TEXT_ARRAY = TEXT.toCharArray();
        final int ARRAY_LENGTH = TEXT_ARRAY.length;
        for (int round = 0; round < ARRAY_LENGTH; round++) {
            for (int index = 0; index < ARRAY_LENGTH; index++) {
                if (round != index && TEXT_ARRAY[round] == TEXT_ARRAY[index]) break;
                else if (index == ARRAY_LENGTH - 1) return String.valueOf(round);
            }
        }
        return "Nothing";
    }
}