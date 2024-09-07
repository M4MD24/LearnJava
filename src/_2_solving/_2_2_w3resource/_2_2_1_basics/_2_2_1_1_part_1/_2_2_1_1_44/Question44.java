package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_44;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number: 5</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>5 + 55  + 555</h2>
 */

public class Question44 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = input.nextInt();

        System.out.print(number + " + " + number + number + " + " + number + number + number);
    }
}