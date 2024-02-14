package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_122_question_122;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to find a contiguous subarray with the largest sum from a given array of integers.
 * <br/>
 * Note: In computer science, the maximum subarray problem is the task of finding the contiguous subarray within a one-dimensional array of numbers which has the largest sum. For example, for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4; the contiguous subarray with the largest sum is 4, −1, 2, 1, with sum 6. The subarray should contain one integer at least.
 * </h2>
 */

public class Question122 {
    static final int[] ARRAY = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    static int ARRAY_LENGTH = ARRAY.length;
    static int index = 0,
            from = 0,
            to = 0,
            lastSum = 0,
            sum = 0;

    public static void main(String[] args) {
        System.out.println("Array: " + Arrays.toString(ARRAY));

        for (int endAt = 2; endAt < ARRAY_LENGTH; endAt++) {
            for (int startAt = 0; startAt < ARRAY_LENGTH; startAt++) {
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