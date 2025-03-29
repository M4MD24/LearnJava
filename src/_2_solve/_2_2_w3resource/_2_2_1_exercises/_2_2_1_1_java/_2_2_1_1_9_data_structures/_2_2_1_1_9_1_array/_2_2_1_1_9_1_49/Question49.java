package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_49;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to arrange the elements of an array of integers so that all positive integers appear before all negative integers.</h2>
 */

public class Question49 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {-4, 8, 6, -5, 6, -2, 1, 0, 2, 3, -11};
        System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
        System.out.print("After Arrangement: " + Arrays.toString(getArrangementPositiveNumbersBeforeNegativeNumbers(NUMBERS)));
    }

    private static int[] getArrangementPositiveNumbersBeforeNegativeNumbers(final int[] NUMBERS) {
        final IntStream POSITIVE_NUMBERS = Arrays.stream(NUMBERS).filter(number -> number > 0),
                ZERO = Arrays.stream(NUMBERS).filter(number -> number == 0),
                NEGATIVE_NUMBERS = Arrays.stream(NUMBERS).filter(number -> number < 0);
        return IntStream.concat(
                IntStream.concat(
                        POSITIVE_NUMBERS,
                        ZERO
                ),
                NEGATIVE_NUMBERS
        ).toArray();
    }
}