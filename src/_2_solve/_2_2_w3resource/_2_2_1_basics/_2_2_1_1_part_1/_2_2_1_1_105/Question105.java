package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_105;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if a group of specific number at the start and end of a given array are the same.</h2>
 */

public class Question105 {
    public static void main(final String[] PARAMETERS) {
        final int[] ARRAY = {11, 15, 13, 10, 45, 20, 11, 15};
        System.out.println("Array: " + Arrays.toString(ARRAY));
        System.out.print(checkStartAndEndSame(ARRAY, 2));
    }

    private static boolean checkStartAndEndSame(final int[] ARRAY, final int START_AND_END_LENGTH) {
        boolean status = false;
        for (int startIndex = 0, endIndex = ARRAY.length - START_AND_END_LENGTH; startIndex < START_AND_END_LENGTH; startIndex++, endIndex++) {
            if (ARRAY[startIndex] == ARRAY[endIndex]) status = true;
            else {
                status = false;
                break;
            }
        }
        return status;
    }
}