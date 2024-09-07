package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_52;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.</h2>
 */

public class Question52 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        System.out.println(Arrays.toString(NUMBERS));
        System.out.print(Arrays.toString(arrangeEvenNumbersToLeftSideAndOddNumbersToRightSide(NUMBERS)));
    }

    private static int[] arrangeEvenNumbersToLeftSideAndOddNumbersToRightSide(final int[] NUMBERS) {
        final IntStream EVEN_NUMBERS = Arrays.stream(NUMBERS)
                .filter(number -> number % 2 == 0),
                ODD_NUMBERS = Arrays.stream(NUMBERS)
                        .filter(number -> number % 2 != 0);
        return IntStream.concat(
                EVEN_NUMBERS,
                ODD_NUMBERS
        ).toArray();
    }
}