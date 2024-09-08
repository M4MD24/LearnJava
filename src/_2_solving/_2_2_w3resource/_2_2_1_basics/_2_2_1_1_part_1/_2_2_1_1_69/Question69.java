package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_69;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to extract the first half of a even string.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input text: Java</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>ja</h2>
 */

public class Question69 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        final String text = input.nextLine();
        System.out.print(text.substring(0, text.length() / 2));
    }
}