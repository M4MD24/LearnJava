package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_128;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to calculate the median of a non-sorted array of integers.</h2>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [10, 2, 38, 22, 38, 23]
 * Median of the said array of integers: 30
 * </h2>
 * <h2>
 * Original array: [10, 2, 38, 23, 38, 23, 21]
 * Median of the said array of integers: 23
 * </h2>
 */

public class Question128 {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int arrayLength;
    private static int[] array;
    private static boolean continueQuestion = true;

    public static void main(final String[] ARGS) {
        while (continueQuestion) {
            inputArrayLength();
            inputArrayValue();
            System.out.println("Median of the said array of integers: " + arrayMedian());
            continueQuestion();
        }
    }

    private static void inputArrayLength() {
        System.out.print("Enter Array Length: ");
        arrayLength = INPUT.nextInt();
        array = new int[arrayLength];
    }

    private static void inputArrayValue() {
        for (int index = 0; index < arrayLength; index++) {
            System.out.print("Enter value of index " + (index + 1) + ": ");
            array[index] = INPUT.nextInt();
        }
    }

    private static int arrayMedian() {
        int median, arrayOfMiddle = arrayLength / 2;
        if (arrayLength % 2 == 0) median = (array[arrayOfMiddle] + array[(arrayOfMiddle) + 1]) / 2;
        else median = array[arrayOfMiddle];
        return median;
    }

    private static void continueQuestion() {
        System.out.println("you want to get median of another array? (true/false)");
        continueQuestion = INPUT.nextBoolean();
    }
}