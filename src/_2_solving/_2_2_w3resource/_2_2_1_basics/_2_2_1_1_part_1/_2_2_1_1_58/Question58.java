package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_58;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to capitalize the first letter of each word in a sentence.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a Sentence: the quick brown fox jumps over the lazy dog.</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>The Quick Brown Fox Jumps Over The Lazy Dog.</h2>
 */

public class Question58 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Sentence: ");
        String text = input.nextLine();
        StringBuilder textWithUpperFirstLetterOfEachWord = new StringBuilder();

        Scanner textScan = new Scanner(text);

        while (textScan.hasNext()) {
            String word = textScan.next();
            textWithUpperFirstLetterOfEachWord.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }

        System.out.print(textWithUpperFirstLetterOfEachWord.toString().trim());
    }
}