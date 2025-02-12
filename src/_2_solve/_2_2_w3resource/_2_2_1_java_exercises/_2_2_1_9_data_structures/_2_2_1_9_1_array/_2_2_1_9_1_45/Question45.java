package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_1_array._2_2_1_9_1_45;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to cyclically rotate a given array clockwise by one.</h2>
 */

public class Question45 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9},
                ROTATE_NUMBER_CLOCKWISE = rotateNumberClockwise(NUMBERS);
        System.out.print(Arrays.toString(ROTATE_NUMBER_CLOCKWISE));
    }

    private static int[] rotateNumberClockwise(final int[] NUMBERS) {
        final IntStream NUMBERS_WITHOUT_LAST_NUMBER = Arrays.stream(NUMBERS)
                .limit(NUMBERS.length - 1);
        return IntStream.concat(
                IntStream.of(NUMBERS[NUMBERS.length - 1]),
                NUMBERS_WITHOUT_LAST_NUMBER
        ).toArray();
    }
}