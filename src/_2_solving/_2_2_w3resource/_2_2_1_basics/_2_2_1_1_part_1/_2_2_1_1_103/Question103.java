package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_103;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an array from a given array of integers. The newly created array will contain elements from the given array after the last element value is 10.</h2>
 */

public class Question103 {
    public static void main(final String[] PARAMETERS) {
        int[] ORIGINAL_ARRAY = {11, 15, 13, 10, 45, 20, 33, 53},
                NEW_ARRAY = addElementsAfterSpecificNumberToNewArray(ORIGINAL_ARRAY, 10);

        System.out.println("Original Array           : " + Arrays.toString(ORIGINAL_ARRAY));
        System.out.print("New Array                : " + Arrays.toString(NEW_ARRAY));
    }

    private static int[] addElementsAfterSpecificNumberToNewArray(final int[] ORIGINAL_ARRAY, final int SPECIFIC_NUMBER) {
        int length = ORIGINAL_ARRAY.length - 1;
        for (int index = length; index >= 0; index--)
            if (ORIGINAL_ARRAY[index] == SPECIFIC_NUMBER) {
                length = index;
                break;
            }
        length += 1;
        int[] newArray = new int[length];
        for (int index = 0, endAt = length; index < endAt; index++, length++) newArray[index] = ORIGINAL_ARRAY[length];
        return newArray;
    }
}