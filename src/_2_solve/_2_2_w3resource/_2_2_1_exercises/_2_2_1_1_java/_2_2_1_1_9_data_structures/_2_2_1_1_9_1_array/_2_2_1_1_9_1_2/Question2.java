package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sum values of an array.</h2>
 */

public class Question2 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Sum of Numbers: " + getSumOfNumbers(NUMBERS));
    }

    private static int getSumOfNumbers(final int[] NUMBERS) {
        int sum = 0;
        for (final int NUMBER : NUMBERS)
            sum += NUMBER;
        return sum;
    }
}