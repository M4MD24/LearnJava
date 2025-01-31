package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_47;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to test if a given number (positive integer) is a perfect square or not.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a positive integer: 6
 * <br/>
 * Is the said number perfect square? false
 * </h2>
 */

public class Question47 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 25;
        System.out.printf("Input a positive integer: %d\n", NUMBER);
        System.out.printf("Is the said number perfect square? %b", isPerfectSquare(NUMBER));
    }

    private static boolean isPerfectSquare(final int NUMBER) {
        final int INTEGER_NUMBER = (int) Math.sqrt(NUMBER);
        final double DOUBLE_NUMBER = Math.sqrt(NUMBER);
        return INTEGER_NUMBER == DOUBLE_NUMBER;
    }
}