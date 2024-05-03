package _2_problem_solving._2_2_w3resource._2_2_2_data_types._2_2_2_1_data_types._2_2_2_1_8_question_280;

/**
 * <h1>Question:</h1>
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

public class Question280 {
    public static void main(final String[] ARGS) {
        final double SIDE = 15;
        System.out.println(STR."Input the side length value: \{SIDE}\n");
        System.out.println(STR."Square: \{String.format("%.2f", Math.pow(SIDE, 2))}");
        System.out.println(STR."Cube: \{String.format("%.2f", Math.pow(SIDE, 3))}");
        System.out.print(STR."Fourth power: \{String.format("%.2f", Math.pow(SIDE, 4))}");
    }
}