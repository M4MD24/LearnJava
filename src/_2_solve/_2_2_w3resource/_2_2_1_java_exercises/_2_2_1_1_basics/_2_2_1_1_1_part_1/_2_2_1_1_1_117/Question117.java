package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_117;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to compute the square root of a given number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a positive integer: 25</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Square root of 25 is: 5</h2>
 */

public class Question117 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);
        final int NUMBER;

        System.out.print("Input a positive integer: ");
        NUMBER = input.nextInt();

        System.out.printf("Square root of %d is: %d", NUMBER, getSqrt(NUMBER));
    }

    private static int getSqrt(int number) {
        if (number == 0 || number == 1) return number;
        int first = 0,
                middle,
                last = number;
        while (first <= last) {
            middle = (first + last) >> 1;
            if (number / middle < middle) last = middle - 1;
            else {
                if (number / (middle + 1) <= middle) return middle;
                first = middle + 1;
            }
        }
        return first;
    }
}