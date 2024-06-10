package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_43;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to print the following string in a specific format (see output).</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 */
/*
 * Twinkle, twinkle, little star,
 *     How I wonder what you are!
 *         Up above the world so high,
 *         Like a diamond in the sky.
 * Twinkle, twinkle, little star,
 *     How I wonder what you are
 * */

public class Question43 {
    public static void main(final String[] ARGS) {
        System.out.print(("""
                Twinkle, twinkle, little star,
                \tHow I wonder what you are!
                \t\tUp above the world so high,
                \t\tLike a diamond in the sky.
                Twinkle, twinkle, little star,
                \tHow I wonder what you are"""));
    }
}