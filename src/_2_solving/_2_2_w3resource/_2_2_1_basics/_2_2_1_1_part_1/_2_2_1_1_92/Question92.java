package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_92;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to count the number of even and odd elements in a given array of integers.</h2>
 */

public class Question92 {
    public static void main(final String[] PARAMETERS) {
        countEvenAndOddOfArray(arrayValues());
    }

    private static int[] arrayValues() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int arrayLength = input.nextInt();

        int[] arrayOfNumbers = new int[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            System.out.print("Enter integer value of index " + (index + 1) + ": ");
            arrayOfNumbers[index] = input.nextInt();
        }

        return arrayOfNumbers;
    }

    private static void countEvenAndOddOfArray(final int[] arrayOfNumbers) {
        int evenCount = 0,
                oddCount = 0;
        for (int number : arrayOfNumbers)
            if (number % 2 == 0) evenCount++;
            else oddCount++;

        System.out.println("\nArray: " + Arrays.toString(arrayOfNumbers));
        System.out.printf("Even Count: %d\nOdd Count: %d", evenCount, oddCount);
    }
}