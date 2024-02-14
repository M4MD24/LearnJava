package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_122_question_122;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to find a contiguous subarray with the largest sum from a given array of integers.
 * <br/>
 * Note: In computer science, the maximum subarray problem is the task of finding the contiguous subarray within a one-dimensional array of numbers which has the largest sum. For example, for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4; the contiguous subarray with the largest sum is 4, −1, 2, 1, with sum 6. The subarray should contain one integer at least.
 * </h2>
 */

public class Question122 {
    static final Scanner input = new Scanner(System.in);
    static int ARRAY_LENGTH = arrayLength();
    static final int[] ARRAY = new int[ARRAY_LENGTH];
    static int index = 0,
            from = 0,
            to = 0,
            lastSum = 0,
            sum = 0;

    public static void main(String[] args) {
        inputIndexesValuesArray();
        System.out.println("Array: " + Arrays.toString(ARRAY));
        calculateLargesSumContiguousSubArray();
    }

    private static int arrayLength() {
        System.out.print("Enter array length: ");
        return input.nextInt();
    }

    private static void inputIndexesValuesArray() {
        for (int index = 0; index < ARRAY_LENGTH; index++) {
            System.out.print("Input index value of " + index + ": ");
            ARRAY[index] = input.nextInt();
        }
    }

    private static void calculateLargesSumContiguousSubArray() {
        for (int endAt = (ARRAY_LENGTH > 2) ? 2 : 1; endAt < ARRAY_LENGTH; endAt++) {
            for (int startAt = 0; startAt <= ARRAY_LENGTH - endAt; startAt++) {
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