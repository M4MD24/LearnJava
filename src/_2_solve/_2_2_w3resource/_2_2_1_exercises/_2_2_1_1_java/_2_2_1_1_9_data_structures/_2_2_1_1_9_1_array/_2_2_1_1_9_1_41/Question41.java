package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_41;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the smallest and second smallest elements of a given array.</h2>
 */

public class Question41 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {654, 23, 421, 543, -5, 43, 52, 3, -1, 4, 5, 34, 650, 544, 53, 324};
        System.out.println("Smallest Number: " + getSmallestNumber(NUMBERS));
        System.out.print("Second Smallest Number: " + getSecondSmallestNumber(NUMBERS));
    }

    private static int getSmallestNumber(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS)
                .min()
                .getAsInt();
    }

    private static int getSecondSmallestNumber(final int[] NUMBERS) {
        Arrays.sort(NUMBERS);
        return NUMBERS[1];
    }
}