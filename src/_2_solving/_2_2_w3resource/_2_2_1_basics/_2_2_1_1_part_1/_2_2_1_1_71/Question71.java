package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_71;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first text: Java
 * <br/>
 * Input second text: Tutorial
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>avautorial</h2>
 */

public class Question71 {
    public static void main(final String[] PARAMETERS) {
        createStringInTheForm();
    }

    private static void createStringInTheForm() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Input first text: ");
            final String FIRST_TEXT = input.nextLine().substring(1);
            System.out.print("Input second text: ");
            final String SECOND_TEXT = input.nextLine().substring(1);

            if (FIRST_TEXT.length() > 1 && SECOND_TEXT.length() > 1) {
                System.out.print(FIRST_TEXT + SECOND_TEXT);
                break;
            } else System.out.println("\nThe length of the strings must be 1 and above!");
        }
    }
}