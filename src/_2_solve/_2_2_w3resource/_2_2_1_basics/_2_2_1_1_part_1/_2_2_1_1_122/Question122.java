package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_122;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to find a contiguous sub-array with the largest sum from a given array of integers.
 * <br/>
 * Note: In computer science, the maximum sub-array problem is the task of finding the contiguous sub-array within a one-dimensional array of numbers which has the largest sum. For example, for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4; the contiguous sub-array with the largest sum is 4, −1, 2, 1, with sum 6. The sub-array should contain one integer at least.
 * </h2>
 */

public class Question122 {
    static final Scanner input = new Scanner(System.in);
    static int[] ARRAY;
    static int ARRAY_LENGTH,
            index = 0,
            from,
            to,
            lastSum,
            sum,
            startAt,
            endAt;

    public static void main(final String[] ARGUMENTS) {
        arrayLength();
        inputIndexesValuesArray();
        System.out.println("Array: " + Arrays.toString(ARRAY));
        calculateLargesSumContiguousSubArray();
    }

    private static void arrayLength() {
        System.out.print("Enter array length (Minimum array length 2): ");
        int arrayLength = input.nextInt();
        if (arrayLength > 1) {
            ARRAY_LENGTH = arrayLength;
            ARRAY = new int[ARRAY_LENGTH];
        } else arrayLength();
    }

    private static void inputIndexesValuesArray() {
        for (index = 0; index < ARRAY_LENGTH; index++) {
            System.out.print("Input index value of " + index + ": ");
            ARRAY[index] = input.nextInt();
        }
        sum = ARRAY[0] + ARRAY[1];
        from = 0;
        to = 1;
    }

    private static void calculateLargesSumContiguousSubArray() {
        for (endAt = 2; endAt < ARRAY_LENGTH; endAt++) {
            for (startAt = 0; startAt <= ARRAY_LENGTH - endAt; startAt++) {
                for (index = startAt; index <= endAt; index++) lastSum += ARRAY[index];
                if (lastSum > sum) {
                    from = startAt;
                    to = index - 1;
                    sum = lastSum;
                }
                lastSum = 0;
            }
        }
        System.out.printf("Largest sum contiguous sub-array: %d\nfrom %d to %d", sum, from, to);
    }
}