package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_13;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print the area and perimeter of a rectangle.</h2>
 * <br/>
 * <h1>Test Data:</h1>
 * <h2>
 * Width = 5.6
 * <br/>
 * Height = 8.5
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 * <br/>
 * Area is 5.6 * 8.5 = 47.60
 * </h2>
 */

public class Question13 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Width = ");
        float width = input.nextFloat();

        System.out.print("Height = ");
        float height = input.nextFloat(),
                perimeterOfRectangle = 2 * (width + height),
                areaOfCircle = width * height;

        System.out.printf("Perimeter is %.2f\nArea is %.2f", perimeterOfRectangle, areaOfCircle);
    }
}