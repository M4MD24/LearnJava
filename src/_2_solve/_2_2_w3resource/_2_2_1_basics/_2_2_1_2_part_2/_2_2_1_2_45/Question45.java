package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_45;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if three given side lengths (integers) can make a triangle or not.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first side: 5
 * <br/>
 * Input second side: 6
 * <br/>
 * Input third side: 8
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Is the said sides form a triangle: true</h2>
 */

public class Question45 {
    private static int FIRST_SIDE,
            SECOND_SIDE,
            THIRD_SIDE;

    public static void main(final String[] ARGUMENTS) {
        inputValues();
        System.out.printf("Is the said sides from a triangle: %b", isTriangle());
    }

    private static void inputValues() {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input first side: ");
        FIRST_SIDE = INPUT.nextInt();
        System.out.print("Input second side: ");
        SECOND_SIDE = INPUT.nextInt();
        System.out.print("Input third side: ");
        THIRD_SIDE = INPUT.nextInt();
    }

    private static boolean isTriangle() {
        return FIRST_SIDE + SECOND_SIDE > THIRD_SIDE && SECOND_SIDE + THIRD_SIDE > FIRST_SIDE && THIRD_SIDE + FIRST_SIDE > SECOND_SIDE;
    }
}