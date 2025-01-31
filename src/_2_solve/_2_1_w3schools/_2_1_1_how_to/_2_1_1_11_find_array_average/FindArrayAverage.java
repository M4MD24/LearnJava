package _2_solve._2_1_w3schools._2_1_1_how_to._2_1_1_11_find_array_average;

import java.util.Arrays;

public class FindArrayAverage {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 5, 2, 3};
        System.out.print(averageOfNumbers(NUMBERS));
    }

    private static double averageOfNumbers(final int[] NUMBERS) {
        return (double) Arrays.stream(NUMBERS).sum() / NUMBERS.length;
    }
}