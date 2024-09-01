package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_61;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to reverse a word.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a word: dsaf</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>Reverse word: fasd</h2>
 */

public class Question61 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input word: ");
        String word = input.nextLine().trim();
        StringBuilder reversedWord = new StringBuilder();
        char[] textLetters = word.toCharArray();

        for (int index = textLetters.length - 1; index >= 0; index--) reversedWord.append(textLetters[index]);
        System.out.print("Reverse word: " + reversedWord);
    }
}