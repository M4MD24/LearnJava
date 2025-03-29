package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_42;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to separate 0s and 1s in an array of 0s and 1s into left and right sides.</h2>
 */

public class Question42 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 1, 1, 1, 0, 1, 4, 0, 4, 0, 2, 3, 4},
                NUMBERS_AFTER_ARRANGE_ZEROS_TO_LEFT_SIDE_AND_ONES_TO_RIGHT_SIDE = arrangeZerosToLeftSideAndOnesToRightSide(NUMBERS);
        System.out.println(Arrays.toString(NUMBERS));
        System.out.print(Arrays.toString(NUMBERS_AFTER_ARRANGE_ZEROS_TO_LEFT_SIDE_AND_ONES_TO_RIGHT_SIDE));
    }

    private static int[] arrangeZerosToLeftSideAndOnesToRightSide(final int[] NUMBERS) {
        final IntStream ZEROS = Arrays.stream(NUMBERS)
                .filter(number -> number == 0),
                ONES = Arrays.stream(NUMBERS)
                        .filter(number -> number == 1),
                NON_ZERO_NON_ONE = Arrays.stream(NUMBERS)
                        .filter(number -> number != 0 && number != 1);
        return IntStream.concat(
                IntStream.concat(
                        ZEROS,
                        NON_ZERO_NON_ONE
                ),
                ONES
        ).toArray();
    }
}