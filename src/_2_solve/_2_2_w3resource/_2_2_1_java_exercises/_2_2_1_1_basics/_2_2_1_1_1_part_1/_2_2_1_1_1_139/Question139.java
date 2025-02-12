package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_139;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the index of the first and the last number of a sub-array where the sum of numbers is zero. This is from a given array of integers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array: [1, 2, 3, -6, 5, 4]
 * <br/>
 * Index of the sub-array of the said array where the sum of numbers is zero: [0, 3]
 * </h2>
 */
public class Question139 {
    public static void main(final String[] ARGUMENTS) {
        final int[] ORIGINAL_ARRAY = {1, 2, 3, -6, 5, 4};
        System.out.println("Original Array: " + Arrays.toString(ORIGINAL_ARRAY));
        System.out.print("Index of the sub-array of the said array where the sum of numbers is zero: " + getIndexSubArraySaidArrayWhereTheSumNumbersIsZero(ORIGINAL_ARRAY));
    }

    private static String getIndexSubArraySaidArrayWhereTheSumNumbersIsZero(final int[] ORIGINAL_ARRAY) {
        for (int index = 0, start = index, end; index < ORIGINAL_ARRAY.length; index++, start = index) {
            for (int index2 = index + 1, sum = ORIGINAL_ARRAY[index]; index2 < ORIGINAL_ARRAY.length; index2++) {
                if (ORIGINAL_ARRAY[index2] + sum == 0) {
                    end = index2;
                    return "[" + start + ", " + end + "]";
                } else sum += ORIGINAL_ARRAY[index2];
            }
            System.out.println();
        }
        return "Nothing";
    }
}