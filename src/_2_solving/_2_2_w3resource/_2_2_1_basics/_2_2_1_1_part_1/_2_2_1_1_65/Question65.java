package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_65;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first number: 19
 * <br/>
 * Input second number: 7
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>5</h2>
 */

public class Question65 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        final int FIRST_NUMBER = input.nextInt();

        System.out.print("Input second number: ");
        final int SECOND_NUMBER = input.nextInt();

        System.out.println(modulusOf(FIRST_NUMBER, SECOND_NUMBER));
    }

    private static int modulusOf(int FIRST_NUMBER, int SECOND_NUMBER) {
//        System.out.println(FIRST_NUMBER + " - " + "(" + "( " + FIRST_NUMBER + " / " + SECOND_NUMBER + " )" + " * " + SECOND_NUMBER + " )");
//        System.out.println(FIRST_NUMBER + " - " + "( " + (FIRST_NUMBER / SECOND_NUMBER) + " * " + SECOND_NUMBER + " )");
//        System.out.println(FIRST_NUMBER + " - " + ((FIRST_NUMBER / SECOND_NUMBER) * SECOND_NUMBER));
        return FIRST_NUMBER - ((FIRST_NUMBER / SECOND_NUMBER) * SECOND_NUMBER);
    }
}