package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_84_question_84;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to take the last three characters from a given string. It will add the three characters at both the front and back of the string. String length must be greater than three and more.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input text: Java</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>avaJavaava</h2>
 */

public class Question84 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Input text: ");
            try {
                String text = input.nextLine(),
                        last3CharactersOfText = text.substring(text.length() - 3);
                System.out.print(last3CharactersOfText + text + last3CharactersOfText);
                break;
            } catch (Exception exception) {
                System.out.println("\nText length must be greater than three and more.");
            }
        }
    }
}