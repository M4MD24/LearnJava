package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_18;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to multiply two given integers without using the multiply operator (*).</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input the first number: 25
 * <br/>
 * Input the second number: 5
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Result: 125</h2>
 */

public class Question18 {
    public static void main(final String[] ARGS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input the first number: ");
        final int FIRST_NUMBER = INPUT.nextInt();
        System.out.print("Input the second number: ");
        final int SECOND_NUMBER = INPUT.nextInt();
        System.out.printf("Result: %d", FIRST_NUMBER * SECOND_NUMBER);
    }
}