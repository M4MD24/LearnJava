package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_71;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the largest number from a given list of non-negative integers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Numbers = {1, 20, 3, 0, 40, 6}</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Largest number using the said array numbers: 64321000</h2>
 */

public class Question71 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 20, 3, 0, 40, 6};
        System.out.println(Arrays.toString(NUMBERS));
        printLargestNumberUsingArrayNumbers(NUMBERS);
    }

    private static void printLargestNumberUsingArrayNumbers(final int[] NUMBERS) {
        final ArrayList<Integer> NUMBERS_AFTER_SORTED = new ArrayList<>();
        for (final int NUMBER : NUMBERS)
            if (String.valueOf(NUMBER).length() < 2)
                NUMBERS_AFTER_SORTED.add(NUMBER);
            else {
                final char[] DIGITS = String.valueOf(NUMBER).toCharArray();
                for (final int DIGIT : DIGITS)
                    NUMBERS_AFTER_SORTED.add(DIGIT - '0');
            }
        NUMBERS_AFTER_SORTED.sort(Collections.reverseOrder());
        System.out.print("Largest number using the said array numbers: ");
        NUMBERS_AFTER_SORTED.forEach(System.out::print);
    }
}