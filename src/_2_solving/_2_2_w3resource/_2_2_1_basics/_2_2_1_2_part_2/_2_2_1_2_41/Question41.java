package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_41;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to test whether there are two integers x and y such that x^2 + y^2 is equal to a given positive number.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a positive integer: 25
 * <br/>
 * Is 25 sum of two square numbers? true
 * </h2>
 */

public class Question41 {
    public static void main(final String[] ARGS) {
        final int TARGET_NUMBER = 25;
        System.out.printf("Input a positive integre: %d\n", TARGET_NUMBER);
        System.out.printf("Is %d sum of two square numbers? %b",
                TARGET_NUMBER,
                Math.sqrt(TARGET_NUMBER) == (int) Math.sqrt(TARGET_NUMBER));
    }
}