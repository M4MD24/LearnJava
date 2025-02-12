package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_79;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to rotate an array (length 3) of integers in the left direction.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array: [20, 30, 40]
 * <br/>
 * Rotated Array: [40, 30, 20]
 * </h2>
 */

public class Question79 {
    public static void main(final String[] ARGUMENTS) {
        final int[] originalArray = {20, 30, 40}, rotatedArray = new int[originalArray.length];
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        for (int index = 0, rotatedIndex = originalArray.length - 1; index < originalArray.length; index++, rotatedIndex--) rotatedArray[index] = originalArray[rotatedIndex];
        System.out.print("Rotated Array : " + Arrays.toString(rotatedArray));
    }
}