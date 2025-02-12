package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_1_array._2_2_1_9_1_37;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an array of its anti-diagonals from a given square matrix.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * 1 2
 * <br/>
 * 3 4
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * [
 * <br/>
 * [1, 0, 0],
 * <br/>
 * [2, 3, 0],
 * <br/>
 * [4, 0, 0]
 * <br/>
 * ]
 * </h2>
 */

public class Question37 {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int countOfNumbers;
    private static int[][] numbers;

    public static void main(final String[] ARGUMENTS) {
        inputCountOfNumbers();
        inputShapeValues();
        printShapeValues();
    }

    private static void printShapeValues() {
        System.out.println('[');
        for (int row = 0; row < numbers.length; row++) {
            System.out.print('[');
            for (int column = 0; column < numbers[row].length; column++) {
                final int NUMBER = numbers[row][column];
                System.out.print(NUMBER);
                if (column < numbers[row].length - 1)
                    System.out.print(", ");
                else
                    System.out.print(']');
            }
            if (row < numbers.length - 1)
                System.out.println(",");
            else
                System.out.print("\n]");
        }
    }

    private static void inputCountOfNumbers() {
        System.out.print("Enter count of numbers greater than 3: ");
        while (true) {
            countOfNumbers = INPUT.nextInt();
            final boolean IS_NOT_PERFECT_NUMBER_OR_LESS_THAN_4 = countOfNumbers < 4 || !isPerfectSquare(countOfNumbers);
            if (IS_NOT_PERFECT_NUMBER_OR_LESS_THAN_4)
                System.err.print("Enter count of numbers greater than 3 and perfect square: ");
            else
                break;
        }
    }

    private static boolean isPerfectSquare(final int NUMBER) {
        final int INTEGER_NUMBER = (int) Math.sqrt(NUMBER);
        final double DOUBLE_NUMBER = Math.sqrt(NUMBER);
        return INTEGER_NUMBER == DOUBLE_NUMBER;
    }

    private static void inputShapeValues() {
        final int MAXIMUM_MIDDLE_NUMBER_OF_SHAPE = (int) Math.sqrt(countOfNumbers),
                MAXIMUM_DOWN_NUMBER_OF_SHAPE = MAXIMUM_MIDDLE_NUMBER_OF_SHAPE + MAXIMUM_MIDDLE_NUMBER_OF_SHAPE - 1;
        numbers = new int[MAXIMUM_DOWN_NUMBER_OF_SHAPE][MAXIMUM_DOWN_NUMBER_OF_SHAPE];
        int toRight = 1;
        final int MIDDLE_DOWN_NUMBER_OF_SHAPE = MAXIMUM_DOWN_NUMBER_OF_SHAPE / 2;
        for (int firstIndex = 0; firstIndex < MAXIMUM_DOWN_NUMBER_OF_SHAPE; firstIndex++) {
            for (int secondIndex = 0; secondIndex < toRight; secondIndex++) {
                final int NUMBER = INPUT.nextInt();
                numbers[firstIndex][secondIndex] = NUMBER;
            }
            if (firstIndex < MIDDLE_DOWN_NUMBER_OF_SHAPE)
                toRight++;
            else
                toRight--;
        }
    }
}