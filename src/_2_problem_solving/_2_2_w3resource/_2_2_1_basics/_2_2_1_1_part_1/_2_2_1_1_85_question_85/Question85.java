package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_85_question_85;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check if a string starts with a specified word.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input text: Salam, how are you?</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>true</h2>
 */

public class Question85 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = input.nextLine(),
                specifiedWord = "Salam";
        System.out.print(text.startsWith(specifiedWord));
    }
}