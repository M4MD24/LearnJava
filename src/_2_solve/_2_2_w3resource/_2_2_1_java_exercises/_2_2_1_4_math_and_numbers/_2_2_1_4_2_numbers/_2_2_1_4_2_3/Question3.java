package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_4_math_and_numbers._2_2_1_4_2_numbers._2_2_1_4_2_3;

import java.util.Random;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to generate random integers in a specific range.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the starting number of the range: 5
 * <br/>
 * Input the ending number of the range: 25
 * <br/>
 * 10
 * </h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        final int STARTING_NUMBER_OF_RANGE = 5,
                ENDING_NUMBER_OF_RANGE = 25;
        System.out.printf("""
                        Input the starting number of the range%d
                        Input the ending number of the range%d
                        %d""",
                STARTING_NUMBER_OF_RANGE,
                ENDING_NUMBER_OF_RANGE,
                new Random().nextInt(STARTING_NUMBER_OF_RANGE, ENDING_NUMBER_OF_RANGE));
    }
}