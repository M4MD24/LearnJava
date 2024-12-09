package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_38;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to get the majority element from an array of integers containing duplicates.
 * <br/>
 * Majority element: A majority element is an element that appears more than n/2 times where n is the array size.
 * </h2>
 */

public class Question38 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {2, 1, 1, 1, 2, 2, 2, 2, 1};
        System.out.println(Arrays.toString(NUMBERS));
        System.out.print(getMajorityNumber(NUMBERS));
    }

    private static String getMajorityNumber(final int[] NUMBERS) {
        Arrays.sort(NUMBERS);
        final int COUNT_OF_LENGTH = NUMBERS.length,
                MIDDLE_OF_LENGTH = COUNT_OF_LENGTH / 2;
        int currentNumber = NUMBERS[0],
                currentCountOfNumber = 1;
        for (int index = 1; index < COUNT_OF_LENGTH; index++) {
            final int NEXT_NUMBER = NUMBERS[index];
            if (currentNumber == NEXT_NUMBER)
                currentCountOfNumber++;
            else
                currentCountOfNumber = 1;
            currentNumber = NEXT_NUMBER;
            if (currentCountOfNumber > MIDDLE_OF_LENGTH)
                return "Majority Number Done Found: " + currentNumber;
        }
        return "Majority Number not Found!";
    }
}