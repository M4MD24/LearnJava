package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_62;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find equilibrium indices in a given array of integers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Numbers = [-7, 1, 5, 2, -4, 3, 0]</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Equilibrium index found at: 3
 * <br/>
 * Equilibrium index found at: 6
 * </h2>
 */

public class Question62 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println("Numbers: " + Arrays.toString(NUMBERS));
        printEquilibriumIndices(NUMBERS);
    }

    private static void printEquilibriumIndices(final int[] NUMBERS) {
        for (int index = 0; index < NUMBERS.length; index++) {
            final int LEFT_SIDE_SUM_OF_NUMBERS = Arrays.stream(NUMBERS)
                    .limit(index)
                    .sum(),
                    RIGHT_SIDE_SUM_OF_NUMBERS = Arrays.stream(NUMBERS)
                            .skip(index + 1)
                            .sum();
            if (LEFT_SIDE_SUM_OF_NUMBERS == RIGHT_SIDE_SUM_OF_NUMBERS)
                System.out.println("Equilibrium index found at: " + index);
        }
    }
}