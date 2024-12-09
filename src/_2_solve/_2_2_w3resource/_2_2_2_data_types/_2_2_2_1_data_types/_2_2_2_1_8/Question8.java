package _2_solve._2_2_w3resource._2_2_2_data_types._2_2_2_1_data_types._2_2_2_1_8;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reads a number and displays the square, cube, and fourth power.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input the side length value: 15</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Square: 225.00
 * <br/>
 * Cube: 3375.00
 * <br/>
 * Fourth power: 50625.00
 * </h2>
 */

public class Question8 {
    public static void main(final String[] PARAMETERS) {
        final double SIDE = 15;
        System.out.printf("Input the side length value: %f\n\n", SIDE);
        System.out.printf("Square: %.2f\n", Math.pow(SIDE, 2));
        System.out.printf("Cube: %.2f\n", Math.pow(SIDE, 3));
        System.out.printf("Fourth power: %.2f", Math.pow(SIDE, 4));
    }
}