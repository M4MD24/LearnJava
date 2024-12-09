package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_3011_find_if_array_can_be_sorted;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given a 0-indexed array of positive integers nums.
 * <br/>
 * <br/>
 * In one operation, you can swap any two adjacent elements if they have the same number of set bits.
 * <br/>
 * You are allowed to do this operation any number of times (including zero).
 * <br/>
 * <br/>
 * Return true if you can sort the array, else return false.
 * </h2>
 */

public class FindIfArrayCanBeSorted {
    public static void main(final String[] PARAMETERS) {
        System.out.print(canSortArray(new int[]{8, 4, 2, 30, 15}));
    }

    private static boolean canSortArray(final int[] NUMBERS) {
        final int MAXIMMUM_NUMBER = NUMBERS.length;
        final int[] VALUES = Arrays.copyOf(NUMBERS, MAXIMMUM_NUMBER);
        for (int index = 0; index < MAXIMMUM_NUMBER - 1; index++)
            if (VALUES[index] > VALUES[index + 1])
                if (bitCount(VALUES[index]) == bitCount(VALUES[index + 1])) {
                    final int TEMPORARY_VALUE = VALUES[index];
                    VALUES[index] = VALUES[index + 1];
                    VALUES[index + 1] = TEMPORARY_VALUE;
                } else
                    return false;
        for (int index = MAXIMMUM_NUMBER - 1; index >= 1; index--)
            if (VALUES[index] < VALUES[index - 1])
                if (bitCount(VALUES[index]) == bitCount(VALUES[index - 1])) {
                    final int TEMPORARY_VALUE = VALUES[index];
                    VALUES[index] = VALUES[index - 1];
                    VALUES[index - 1] = TEMPORARY_VALUE;
                } else
                    return false;
        return true;
    }

    private static int bitCount(int number) {
        int bitCount = 0;
        while (number > 0) {
            if ((number & 1) > 0)
                bitCount++;
            number >>= 1;
        }
        return bitCount;
    }

// >
    /*private static boolean canSortArray(int[] NUMBERS) {
        final int MAXIMMUM_NUMBER = NUMBERS.length;
        final int[] VALUES = Arrays.copyOf(NUMBERS, MAXIMMUM_NUMBER);
        for (int index = 0; index < MAXIMMUM_NUMBER - 1; index++)
            if (VALUES[index] > VALUES[index + 1])
                if (Integer.bitCount(VALUES[index]) == Integer.bitCount(VALUES[index + 1])) {
                    final int TEMPORARY_VALUE = VALUES[index];
                    VALUES[index] = VALUES[index + 1];
                    VALUES[index + 1] = TEMPORARY_VALUE;
                } else
                    return false;
        for (int index = MAXIMMUM_NUMBER - 1; index >= 1; index--)
            if (VALUES[index] < VALUES[index - 1])
                if (Integer.bitCount(VALUES[index]) == Integer.bitCount(VALUES[index - 1])) {
                    final int TEMPORARY_VALUE = VALUES[index];
                    VALUES[index] = VALUES[index - 1];
                    VALUES[index - 1] = TEMPORARY_VALUE;
                } else
                    return false;
        return true;
    }*/
}