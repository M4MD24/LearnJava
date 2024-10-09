package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_32;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to compare two numbers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first integer: 25
 * <br/>
 * Input second integer: 39
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 25 != 39
 * <br/>
 * 25 < 39
 * <br/>
 * 25 <= 39
 * </h2>
 */
public class Question32 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int number1 = input.nextInt();

        System.out.print("Input first integer: ");
        int number2 = input.nextInt();

        if (number1 == number2) System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2) System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2) System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2) System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2) System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2) System.out.printf("%d >= %d", number1, number2);
    }
}