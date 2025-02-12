package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_147;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the number of bits required to flip to convert two given integers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first number: 27
 * <br/>
 * Input second number 23
 * </h2>
 * <h1>Excepted Output:</h1>
 * <h2>2</h2>
 */

public class Question147 {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGUMENTS) {
        System.out.print("Input first number: ");
        final int NUMBER_1 = INPUT.nextInt();
        System.out.print("Input second number: ");
        final int NUMBER_2 = INPUT.nextInt();

        System.out.print(bitSwapRequired(NUMBER_1, NUMBER_2));
    }

    public static int bitSwapRequired(final int NUMBER_1, final int NUMBER_2) {
        int counter = 0;
        for (int differingBits = NUMBER_1 ^ NUMBER_2; differingBits != 0; differingBits >>>= 1) counter += differingBits & 1;
        return counter;
    }
}