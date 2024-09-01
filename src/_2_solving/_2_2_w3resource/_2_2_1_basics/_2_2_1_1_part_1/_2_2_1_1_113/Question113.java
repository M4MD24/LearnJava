package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_113;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to merge two given sorted arrays of integers and create another sorted array.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * First Number = [1, 2, 3, 4]
 * <br/>
 * Second Number = [2, 5, 7, 8]
 * <br/>
 * After Merge and Sort = [1, 2, 2, 3, 4, 5, 7, 8]
 * </h2>
 */

public class Question113 {
    public static void main(final String[] ARGS) {
        final int[] FIRST_ARRAY = {4, 8, 3, 0, 67, 20},
                SECOND_ARRAY = {2, 2, 7, 100, 5},
                MERGED_ARRAY = mergeArray(FIRST_ARRAY, SECOND_ARRAY),
                SORTED_ARRAY = insertionSortArray(MERGED_ARRAY);
        System.out.printf("""
                        First array            = %s
                        Second array           = %s
                        After merged and sorted= %s""",
                Arrays.toString(FIRST_ARRAY),
                Arrays.toString(SECOND_ARRAY),
                Arrays.toString(SORTED_ARRAY));
    }

    private static int[] mergeArray(final int[] FIRST_ARRAY, final int[] SECOND_ARRAY) {
        final int FIRST_ARRAY_LENGTH = FIRST_ARRAY.length,
                SECOND_ARRAY_LENGTH = SECOND_ARRAY.length,
                MERGED_ARRAY_LENGTH = FIRST_ARRAY_LENGTH + SECOND_ARRAY_LENGTH;
        int[] MERGED_ARRAY = new int[MERGED_ARRAY_LENGTH];

        for (int index = 0; index < FIRST_ARRAY_LENGTH; index++) MERGED_ARRAY[index] = FIRST_ARRAY[index];
        for (int index = FIRST_ARRAY_LENGTH, index2 = 0; index < MERGED_ARRAY_LENGTH; index++, index2++) MERGED_ARRAY[index] = SECOND_ARRAY[index2];

        return MERGED_ARRAY;
    }

    private static int[] insertionSortArray(int[] array) {
        int number = array.length;
        for (int index = 1; index < number; ++index) {
            int cursor = array[index],
                    index2 = index - 1;
            while (index2 >= 0 && array[index2] > cursor) {
                array[index2 + 1] = array[index2];
                index2 -= 1;
            }
            array[index2 + 1] = cursor;
            System.out.println(cursor);
        }
        return array;
    }
}