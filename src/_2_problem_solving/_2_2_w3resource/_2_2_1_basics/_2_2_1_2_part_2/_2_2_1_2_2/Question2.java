package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_2;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first number: 25
 * <br/>
 * Input second number: 37
 * <br/>
 * Input third number: 45
 * <br/>
 * Input fourth number: 23
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Numbers are not equal!</h2>
 */

public class Question2 {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGS) {
        final numbersValues NUMBERS = inputNumbers();
        displayNumbersStatusAreEqualOrNot(NUMBERS);
    }

    private static numbersValues inputNumbers() {
        System.out.print("Input first number: ");
        final int FIRST_NUMBER = INPUT.nextInt();

        System.out.print("Input second number: ");
        final int SECOND_NUMBER = INPUT.nextInt();

        System.out.print("Input third number: ");
        final int THIRD_NUMBER = INPUT.nextInt();

        System.out.print("Input fourth number: ");
        final int FORTH_NUMBER = INPUT.nextInt();

        return new numbersValues(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, FORTH_NUMBER);
    }

    private record numbersValues(int FIRST_NUMBER, int SECOND_NUMBER, int THIRD_NUMBER, int FORTH_NUMBER) {
    }

    private static void displayNumbersStatusAreEqualOrNot(final numbersValues NUMBERS) {
        System.out.print(numbersAreEqualOrNot(NUMBERS.FIRST_NUMBER, NUMBERS.SECOND_NUMBER, NUMBERS.THIRD_NUMBER, NUMBERS.FORTH_NUMBER));
    }

    private static String numbersAreEqualOrNot(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER, final int FORTH_NUMBER) {
        boolean condition = FIRST_NUMBER == SECOND_NUMBER && SECOND_NUMBER == THIRD_NUMBER && THIRD_NUMBER == FORTH_NUMBER;
        return (condition) ? "Numbers are equal!" : "Numbers aren't equal!";
    }
}