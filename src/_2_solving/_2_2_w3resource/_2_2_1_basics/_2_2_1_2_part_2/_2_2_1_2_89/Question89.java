package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_89;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>
 * A search engine giant such as Google accepts thousands of web pages from around the world and categorizes them, creating a huge database of information. Search engines also analyze search keywords entered by the user and create database queries based on those keywords. In both cases, complicated processing is carried out to realize efficient retrieval, but the basics are all about cutting out words from sentences.
 * <br/>
 * Write a Java program to cut out words of 3 to 6 characters length from a given sentence not more than 1024 characters.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a sentence (1024 characters. max.)
 * <br/>
 * The quick brown fox
 * <br/>
 * <br/>
 * 3 to 6 characters length of words:
 * <br/>
 * The quick brown fox
 * </h2>
 */

public class Question89 {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.println("Input a sentence (1024 characters. max.)");
        final String TEXT = INPUT.nextLine();
        if (TEXT.length() < 1025) {
            System.out.println(TEXT);
            System.out.println("\n3 to 6 characters length of words:");
            printWordsFromThreeToSixCharacters(TEXT);
        } else {
            System.out.println("\u001B[31mText characters length Greater than 1024\u001B[0m");
            Question89.main(PARAMETERS);
        }
    }

    private static void printWordsFromThreeToSixCharacters(final String TEXT) {
        final String[][] WORDS = new String[][]{TEXT.split(" ")};
        for (final String[] LINE : WORDS)
            for (final String WORD : LINE)
                if (WORD.length() > 2 && WORD.length() < 7)
                    System.out.printf("%s ", WORD);
    }
}