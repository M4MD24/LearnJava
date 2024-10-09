package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_41;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print the ASCII value of a given character.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input any char: Z</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The ASCII value is: 90</h2>
 */

public class Question41 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input any char: ");
        int c = input.next().charAt(0);

        System.out.print("The ASCII value is: " + c);
    }
}