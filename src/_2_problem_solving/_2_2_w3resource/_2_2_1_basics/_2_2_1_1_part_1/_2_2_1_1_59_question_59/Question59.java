package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_59_question_59;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert a string into lowercase.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input string: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>the quick brown fox jumps over the lazy dog.</h2>
 */

public class Question59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input string: ");
        String text = input.nextLine();

        String textWithLowerLettersOfEachWord = text.toLowerCase();
        System.out.print(textWithLowerLettersOfEachWord);
    }
}