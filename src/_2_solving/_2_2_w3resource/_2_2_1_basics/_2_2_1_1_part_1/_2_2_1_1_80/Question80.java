package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_80;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the largest value between the first and last elements of an array (length 3) of integers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array: [20, 30, 40]
 * <br/>
 * Larger value between first and last element: 40
 * </h2>
 */

public class Question80 {
    public static void main(final String[] PARAMETERS) {
        final int[] originalArray = {20, 30, 40};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Larger value first and last element: " + ((originalArray[0] > originalArray[originalArray.length - 1])? originalArray[0] : originalArray[originalArray.length - 1]));
    }
}