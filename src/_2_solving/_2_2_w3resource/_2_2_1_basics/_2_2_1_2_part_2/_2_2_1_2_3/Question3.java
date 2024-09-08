package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_3;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first number: 5
 * <br/>
 * Input second number: 1
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>false</h2>
 */

public class Question3 {
    public static void main(final String[] PARAMETERS) {
        Values values = getValues();
        System.out.print(between0And1(values.FIRST_NUMBER()) && between0And1(values.SECOND_NUMBER()));
    }

    private static boolean between0And1(final double NUMBER) {
        return (NUMBER > 0 && NUMBER < 1);
    }

    private static Values getValues() {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input first number: ");
        final double FIRST_NUMBER = INPUT.nextDouble();
        System.out.print("Input second number: ");
        final double SECOND_NUMBER = INPUT.nextDouble();
        return new Values(FIRST_NUMBER, SECOND_NUMBER);
    }

    record Values(double FIRST_NUMBER, double SECOND_NUMBER) {
    }
}