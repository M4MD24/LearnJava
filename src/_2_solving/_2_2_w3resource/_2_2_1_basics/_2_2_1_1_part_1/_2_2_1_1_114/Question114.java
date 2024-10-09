package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_114;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that rotates a string by an offset (rotate from left to right).</h2>
 */

public class Question114 {
    public static void main(final String[] PARAMETERS) {
        final int[] ARRAY = {11, 15, 13, 10, 45, 20, 11, 15};
        Scanner input = new Scanner(System.in);
        System.out.print("How much left shift?\n= ");
        final int LEFT_SHIFTING_NUMBER = input.nextInt();

        System.out.println("Array               : " + Arrays.toString(ARRAY));
        System.out.print("Array after shifting: " + Arrays.toString(shiftLeftArray(ARRAY, LEFT_SHIFTING_NUMBER)));
    }

    private static int[] shiftLeftArray(final int[] ARRAY, final int LEFT_SHIFTING_NUMBER) {
        for (int time = 0; time < LEFT_SHIFTING_NUMBER; time++)
            for (int index = 0, nextIndex = 1; nextIndex < ARRAY.length; index++, nextIndex++) {
                ARRAY[index] += ARRAY[nextIndex];
                ARRAY[nextIndex] = ARRAY[index] - ARRAY[nextIndex];
                ARRAY[index] -= ARRAY[nextIndex];
            }
        return ARRAY;
    }
}