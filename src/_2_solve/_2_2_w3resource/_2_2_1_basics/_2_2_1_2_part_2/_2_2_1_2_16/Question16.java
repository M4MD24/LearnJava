package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_16;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to transform a given integer into String format.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input an integer: 35</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>String format of the said integer: 35</h2>
 */

public class Question16 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print("Input an integer: ");
        final int NUMBER = new Scanner(System.in).nextInt();
        System.out.printf("String format of the said integer: %s", String.valueOf(NUMBER));
    }
}