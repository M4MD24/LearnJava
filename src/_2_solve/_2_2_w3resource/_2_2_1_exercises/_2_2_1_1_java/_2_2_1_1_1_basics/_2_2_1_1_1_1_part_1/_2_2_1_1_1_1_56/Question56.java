package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_56;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the number of values in a given range divisible by a given value.</h2>
 * <br/>
 * <h1>Example:</h1>
 * <h2>
 * x = 5, y=20 and p =3,
 * <br/>
 * find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>5</h2>
 */

public class Question56 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        final int FIRST_NUMBER = input.nextInt();

        System.out.print("Input second number: ");
        final int SECOND_NUMBER = input.nextInt();

        System.out.print("Input third number: ");
        final int THIRD_NUMBER = input.nextInt();

        int sumOfNumbersDividedBy = 0;
        for (int range = FIRST_NUMBER; range <= SECOND_NUMBER; range++)
            if (range % THIRD_NUMBER == 0) ++sumOfNumbersDividedBy;
        System.out.print(sumOfNumbersDividedBy);
    }
}