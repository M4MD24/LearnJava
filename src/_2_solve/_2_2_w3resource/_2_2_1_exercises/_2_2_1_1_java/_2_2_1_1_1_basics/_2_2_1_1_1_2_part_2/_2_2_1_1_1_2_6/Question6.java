package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_6;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that returns the largest integer but not larger than the base-2 logarithm of a specified integer.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>2350</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Number: 2350
 * <br/>
 * Result: 11
 * </h2>
 */

public class Question6 {
    public static void main(final String[] ARGUMENTS) {
        final int ORIGINAL_NUMBER = 2350;
        System.out.println("Original Number: " + ORIGINAL_NUMBER);
        System.out.print("Result: " + largestIntegerLogBase2(ORIGINAL_NUMBER));
    }

    public static int largestIntegerLogBase2(final int NUMBER) {
        if (NUMBER <= 0) throw new IllegalArgumentException("Input must be a positive integer!");
        return (int) (Math.log(NUMBER) / Math.log(2));
    }
}