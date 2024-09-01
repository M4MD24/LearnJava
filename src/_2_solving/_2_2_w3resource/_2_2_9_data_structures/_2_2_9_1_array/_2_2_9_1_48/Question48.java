package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_48;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to arrange the elements of an array of integers so that all negative integers appear before all positive integers.</h2>
 */

public class Question48 {
    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {-4, 8, 6, -5, 6, -2, 1, 0, 2, 3, -11};
        System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
        System.out.print("After Arrangement: " + Arrays.toString(getArrangementNegativeNumbersBeforePositiveNumbers(NUMBERS)));
    }

    private static int[] getArrangementNegativeNumbersBeforePositiveNumbers(final int[] NUMBERS) {
        final IntStream NEGATIVE_NUMBERS = Arrays.stream(NUMBERS).filter(number -> number < 0),
                ZERO = Arrays.stream(NUMBERS).filter(number -> number == 0),
                POSITIVE_NUMBERS = Arrays.stream(NUMBERS).filter(number -> number > 0);
        return IntStream.concat(
                IntStream.concat(
                        NEGATIVE_NUMBERS,
                        ZERO
                ),
                POSITIVE_NUMBERS
        ).toArray();
    }
}