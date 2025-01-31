package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_25;

import java.util.Arrays;
import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find common elements in three sorted (in non-decreasing order) arrays.</h2>
 */

public class Question25 {
    public static void main(final String[] ARGUMENTS) {
        final int[] FIRST_NUMBERS = {2, 4, 8},
                SECOND_NUMBERS = {2, 3, 4, 8, 10, 16},
                THIRD_NUMBERS = {4, 8, 14, 40};
        printCommonNumbersInThreeSortedArrays(FIRST_NUMBERS, SECOND_NUMBERS, THIRD_NUMBERS);
    }

    private static void printCommonNumbersInThreeSortedArrays(final int[] FIRST_NUMBERS, final int[] SECOND_NUMBERS, final int[] THIRD_NUMBERS) {
        if (isSorted(FIRST_NUMBERS) &&
                isSorted(SECOND_NUMBERS) &&
                isSorted(THIRD_NUMBERS)) {
            int firstNumber = 0,
                    secondNumber = 0,
                    thirdNumber = 0;
            final HashSet<Integer> COMMON_NUMBERS = new HashSet<>();

            while (firstNumber < FIRST_NUMBERS.length && secondNumber < SECOND_NUMBERS.length && thirdNumber < THIRD_NUMBERS.length)
                if (FIRST_NUMBERS[firstNumber] == SECOND_NUMBERS[secondNumber] && SECOND_NUMBERS[secondNumber] == THIRD_NUMBERS[thirdNumber]) {
                    COMMON_NUMBERS.add(FIRST_NUMBERS[firstNumber]);
                    firstNumber++;
                    secondNumber++;
                    thirdNumber++;
                } else if (FIRST_NUMBERS[firstNumber] < SECOND_NUMBERS[secondNumber])
                    firstNumber++;
                else if (SECOND_NUMBERS[secondNumber] < THIRD_NUMBERS[thirdNumber])
                    secondNumber++;
                else
                    thirdNumber++;

            if (COMMON_NUMBERS.isEmpty())
                System.out.print("No common elements found!");
            else
                System.out.print("Common elements: " + COMMON_NUMBERS);
        } else
            System.out.println("Arrays not sorted!");
    }

    private static boolean isSorted(final int[] NUMBERS) {
        final int[] SORTED_NUMBERS = Arrays.copyOf(NUMBERS, NUMBERS.length);
        Arrays.sort(SORTED_NUMBERS);
        return Arrays.equals(NUMBERS, SORTED_NUMBERS);
    }
}