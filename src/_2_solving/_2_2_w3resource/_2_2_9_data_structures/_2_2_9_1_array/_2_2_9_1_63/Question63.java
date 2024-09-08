package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_63;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to replace each element of the array with the product of every other element in a given array of integers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * First Numbers = { 1, 2, 3, 4, 5, 6, 7}
 * <br/>
 * Second Numbers = {0, 1, 2, 3, 4, 5, 6, 7}
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Array with product of every other element:
 * <br/>
 * [5040, 2520, 1680, 1260, 1008, 840, 720]
 * <br/>
 * Array with product of every other element:
 * <br/>
 * [5040, 0, 0, 0, 0, 0, 0, 0]
 * </h2>
 */

public class Question63 {
    public static void main(final String[] PARAMETERS) {
        final int[] FIRST_NUMBERS = {1, 2, 3, 4, 5, 6, 7},
                SECOND_NUMBERS = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println("First Numbers: " + Arrays.toString(FIRST_NUMBERS));
        System.out.println(Arrays.toString(getProductOfEveryOtherNumber(FIRST_NUMBERS)) + '\n');
        System.out.println("Second Numbers: " + Arrays.toString(FIRST_NUMBERS));
        System.out.print(Arrays.toString(getProductOfEveryOtherNumber(SECOND_NUMBERS)));
    }

    private static int[] getProductOfEveryOtherNumber(final int[] NUMBERS) {
        int totalProduct = 1,
                zeroCount = 0;
        for (final int NUMBER : NUMBERS)
            if (NUMBER != 0)
                totalProduct *= NUMBER;
            else
                zeroCount++;
        System.out.println("Array with product of every other element:");
        final int[] TOTAL_PRODUCT_NUMBERS = new int[NUMBERS.length];
        for (int index = 0; index < NUMBERS.length; index++)
            if (zeroCount > 1)
                TOTAL_PRODUCT_NUMBERS[index] = 0;
            else if (zeroCount == 1)
                TOTAL_PRODUCT_NUMBERS[index] = (NUMBERS[index] == 0)
                        ? totalProduct
                        : 0;
            else
                TOTAL_PRODUCT_NUMBERS[index] = totalProduct / NUMBERS[index];
        return TOTAL_PRODUCT_NUMBERS;
    }
}