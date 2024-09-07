package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_11;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to print the area and perimeter of a circle.</h2>
 * <br/>
 * <h1>Test Data:</h1>
 * <h2>Radius = 7.5</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * Perimeter is = 47.12388980384689
 * <br/>
 * Area is = 176.71458676442586
 * </h2>
 */

public class Question11 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Radius: ");
        double radius = input.nextDouble(),
                perimeterOfCircle = 2 * Math.PI * radius,
                areaOfCircle = Math.PI * (radius * radius);

        System.out.print("Perimeter is = " + perimeterOfCircle +
                "\nArea is = " + areaOfCircle);
    }
}
