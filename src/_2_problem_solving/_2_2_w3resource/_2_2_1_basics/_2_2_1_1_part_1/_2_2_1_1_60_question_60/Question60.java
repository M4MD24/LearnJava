package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_60_question_60;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the penultimate (next to the last) word in a sentence.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input string: The quick brown fox jumps over the lazy dog.</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>Penultimate word: lazy</h2>
 */

public class Question60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input string: ");
        String text = input.nextLine();

        String[] words = text.split(" +");

        System.out.print("Penultimate word: " + words[words.length - 2]);
    }
}