package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_77;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that reads a text (only alphabetical characters and spaces) and prints two words. The first one is the word which is frequently used in the text. The second one is the word with the most letters.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>A word is a sequence of letters which is separated by the spaces.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a text in a line:
 * <br/>
 * Thank you for your comment and your participation.
 * <br/>
 * Most frequent text and the word which has the maximum number of letters:
 * <br/>
 * your participation.
 * </h2>
 */

public class Question77 {
    public static void main(final String[] ARGS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.println("Input a text in a line:");
        final String TEXT = INPUT.nextLine();
        System.out.println("Most frequent text and the word which has the maximum number of letters:");
        System.out.print(getLongestTextsBetweenFirstDuplicateWord(TEXT));
    }

    private static String getLongestTextsBetweenFirstDuplicateWord(final String PARAGRAPH) {
        final String[][] LINE = new String[][]{PARAGRAPH.split(" ")};
        final String DUPLICATED_WORD = getDuplicatedWord(LINE),
                LONGEST_WORD = getLongestWord(LINE);
        if (!DUPLICATED_WORD.isEmpty() && !LONGEST_WORD.isEmpty())
            return String.format("%s %s",
                    DUPLICATED_WORD,
                    LONGEST_WORD);
        else if (!DUPLICATED_WORD.isEmpty())
            return DUPLICATED_WORD;
        else if (!LONGEST_WORD.isEmpty())
            return LONGEST_WORD;
        else
            return "";
    }

    private static String getLongestWord(final String[][] LINE) {
        String longestWord = "";
        for (final String[] WORDS : LINE)
            for (final String WORD : WORDS)
                if (WORD.length() > longestWord.length())
                    longestWord = WORD;
        return longestWord;
    }

    private static String getDuplicatedWord(final String[][] LINE) {
        for (int round = 0; round < LINE[0].length; round++)
            for (int index = 0; index < LINE[0].length; index++)
                if (round != index)
                    if (LINE[0][round].equals(LINE[0][index]))
                        return LINE[0][round];
        return "";
    }
}