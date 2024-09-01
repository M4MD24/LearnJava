package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_19;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to reverse a sentence (assume a single space between two words) without reverse every word.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a string: The quick brown fox jumps over the lazy dog</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Result: dog lazy the over jumps fox brown quick The</h2>
 */

public class Question19 {
    public static void main(final String[] ARGS) {
        System.out.print("Input the first number: ");
        final String[][] TEXT = new String[][]{new Scanner(System.in).nextLine().split(" +")};
        System.out.printf("Result: %s", reverseText(TEXT));
    }

    private static StringBuffer reverseText(final String[][] TEXT) {
        final StringBuffer TEXT_AFTER_REVERSE = new StringBuffer();
        for (int index = TEXT[0].length - 1; index > -1; index--)
            TEXT_AFTER_REVERSE.append(TEXT[0][index]).append(" ");
        return TEXT_AFTER_REVERSE;
    }
}