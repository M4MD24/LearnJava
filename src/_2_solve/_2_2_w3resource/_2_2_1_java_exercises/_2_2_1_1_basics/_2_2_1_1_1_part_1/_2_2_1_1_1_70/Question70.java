package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_70;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a string in the form of short_string + long_string + short_string from two strings. The strings must not have the same length.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first text: Java
 * <br/>
 * Input second text: Tutorial
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>Java Tutorial Java</h2>
 */

public class Question70 {
    public static void main(final String[] ARGUMENTS) {
        createStringInTheForm();
    }

    private static void createStringInTheForm() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Input first text: ");
            final String FIRST_TEXT = input.nextLine();
            System.out.print("Input second text: ");
            final String SECOND_TEXT = input.nextLine();
            if (FIRST_TEXT.length() > SECOND_TEXT.length()) {
                System.out.print(SECOND_TEXT + FIRST_TEXT + SECOND_TEXT);
                break;
            } else if (SECOND_TEXT.length() > FIRST_TEXT.length()) {
                System.out.print(FIRST_TEXT + SECOND_TEXT + FIRST_TEXT);
                break;
            } else System.out.println("\nThe strings must not have the same length!");
        }
    }
}