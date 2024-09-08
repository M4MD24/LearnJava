package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_21;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to accept two strings and test if the second string contains the first one.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input first string: Once in a blue moon
 * <br/>
 * Input second string: See eye to eye
 * <br/>
 * If the second string contains the first one? false
 * </h2>
 */

public class Question21 {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input first string: ");
        final String FIRST_TEXT = INPUT.nextLine();
        System.out.print("Input second string: ");
        final String SECOND_TEXT = INPUT.nextLine();
        System.out.printf("If the second string contains the first one? %s", FIRST_TEXT.contentEquals(SECOND_TEXT));
    }
}