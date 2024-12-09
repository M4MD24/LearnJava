package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_39;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to two non-negative integers num1 and num2 represented as strings, return the sum of num1 and num2.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>"123" + "456" = 579</h2>
 */

public class Question39 {
    public static void main(final String[] PARAMETERS) {
        final String FIRST_NUMBER = "123", SECOND_NUMBER = "456";
        System.out.printf("\"%s\" + \"%s\" = %d",
                FIRST_NUMBER,
                SECOND_NUMBER,
                Integer.parseInt(FIRST_NUMBER) + Integer.parseInt(SECOND_NUMBER));
    }
}