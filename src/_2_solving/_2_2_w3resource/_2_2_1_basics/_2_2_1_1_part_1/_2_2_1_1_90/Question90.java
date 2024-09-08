package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_90;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to get the value of environment variables PATH, TEMP, USERNAME.</h2>
 */

public class Question90 {
    public static void main(final String[] PARAMETERS) {
        System.out.print("■ Environment variables:" +
                "\n\n- PATH:\n" + System.getenv("PATH") +
                "\n\n- TEMP:\n" + System.getenv("TEMP") +
                "\n\n- USERNAME:\n" + System.getenv("USERNAME"));
    }
}