package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_156_question_156;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that returns the largest integer but not larger than the base-2 logarithm of a specified integer.</h2>
 * <br/>
 * <h1>Input Output:</h1>
 * <h2>2350</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Number: 2350
 * <br/>
 * Result: 11
 * </h2>
 */

public class Question156 {
    public static void main(String[] args) {
        final int ORIGINAL_NUMBER = 2350;
        System.out.println("Original Number: " + ORIGINAL_NUMBER);
        System.out.print("Result: " + largestIntegerLogBase2(ORIGINAL_NUMBER));
    }

    public static int largestIntegerLogBase2(final int NUMBER) {
        if (NUMBER <= 0) throw new IllegalArgumentException("Input must be a positive integer!");
        return (int) (Math.log(NUMBER) / Math.log(2));
    }
}