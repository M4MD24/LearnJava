package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_82_question_232;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to compute the sum of the first n prime numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number (n<=10000) to compute the sum:
 * <br/>
 * 100
 * <br/>
 * Sum of first 100 prime numbers:
 * <br/>
 * 24133
 * </h2>
 */

public class Question232 {
    public static void main(final String[] ARGS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input a number to compute the sum: ");
        final short TARGET_NUMBER = INPUT.nextShort();
        System.out.printf("Sum of first 100 prime numbers: %d", getSum(TARGET_NUMBER));
    }

    private static int getSum(final short TARGET_NUMBER) {
        int currentNumber = 0,
                sum = 0;
        for (int number = 2; currentNumber != TARGET_NUMBER; number++)
            if (isPrime(number)) {
                currentNumber++;
                sum += number;
            }
        return sum;
    }

    private static boolean isPrime(final int NUMBER) {
        if (NUMBER == 2 || NUMBER == 3) return true;
        else if (NUMBER % 2 == 0 || NUMBER % 3 == 0) return false;
        else {
            for (int index = 5; index * index <= NUMBER; index += 2)
                if (NUMBER % index == 0 || (NUMBER % (index + 2)) == 0) return false;
            return true;
        }
    }
}