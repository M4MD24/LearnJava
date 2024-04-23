package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_155_question_155;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to print an array after changing the rows and columns of a two-dimensional array.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * 10 20 30
 * <br/>
 * 40 50 60
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array:
 * <br/>
 * 10 20 30
 * <br/>
 * 40 50 60
 * <br/>
 * After changing the rows and columns of the said array:
 * <br/>
 * 10 40
 * <br/>
 * 20 50
 * <br/>
 * 30 60
 * </h2>
 */

public class Question155 {
    private static final byte[][] NUMBERS = {{10, 20, 30}, {40, 50, 60}};

    public static void main(String[] args) {
        printOriginalValues();
        printReverseValues();
    }

    private static void printOriginalValues() {
        System.out.println("Original Array:");
        for (final byte[] NUMBER : NUMBERS) {
            for (byte index = 0; index < NUMBER.length; index++) {
                System.out.print(NUMBER[index]);
                if (index < NUMBER.length - 1) System.out.print(' ');
            }
            System.out.println();
        }
    }

    private static void printReverseValues() {
        System.out.println("After changing the rows and columns of the said array:");
        for (byte round = 0; round < NUMBERS[0].length; round++) {
            for (byte index = 0; index < NUMBERS.length; index++) {
                System.out.print(NUMBERS[index][round]);
                if (index < NUMBERS.length - 1) System.out.print(" ");
            }
            if (round < NUMBERS[0].length - 1) System.out.println();
        }
    }
}