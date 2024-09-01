package _2_solving._2_2_w3resource._2_2_2_data_types._2_2_2_1_data_types._2_2_2_1_6;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to compute the body mass index (BMI).</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input weight in pounds: 452
 * <br/>
 * Input height in inches: 72
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Body Mass Index is 61.30159143458721</h2>
 */

public class Question6 {
    public static void main(final String[] ARGS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        final double POUNDS = INPUT.nextDouble();
        System.out.print("Input height in inches: ");
        final double INCHES = INPUT.nextDouble();
        System.out.printf("Body mass index is: %f", getBodyMassIndexWithPoundsAndInches(POUNDS, INCHES));
    }

    private static double getBodyMassIndexWithPoundsAndInches(final double POUNDS, final double INCHES) {
        return POUNDS * 0.45359237 / (Math.pow(INCHES * 0.0254, 2));
    }
}