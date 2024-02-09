package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_94_question_94;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers.</h2>
 */

public class Question94 {
    public static void main(String[] args) {
        int[] arrayNumbers = {0, 1, 1, 0, 1, 1, 0, 1, 1, 1};
        System.out.print("Original Array                    : " + Arrays.toString(arrayNumbers));
        System.out.print("\nRearranged Array with New Array   : " + Arrays.toString(rearrangeArrayNumbersWithNewArray(arrayNumbers)));
    }

    private static int[] rearrangeArrayNumbersWithNewArray(int[] arrayNumbers) {
        final int maxLengthArray = arrayNumbers.length;
        int startIndex2 = 0,
                endIndex2 = maxLengthArray - 1;
        int[] rearrangedArrayNumbers = new int[maxLengthArray];
        for (int number : arrayNumbers) {
            if (number % 2 != 0) {
                rearrangedArrayNumbers[startIndex2] = number;
                ++startIndex2;
            } else {
                rearrangedArrayNumbers[endIndex2] = number;
                --endIndex2;
            }
        }
        return rearrangedArrayNumbers;
    }
}