package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_33;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program and compute the sum of an integer's digits.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input an integer: 25</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The sum of the digits is: 7</h2>
 */
public class Question33 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer: ");
        long number = input.nextLong();

        System.out.println("The sum of the digits is: " + sumDigits(number));
    }

    public static int sumDigits(long number) {
        int sum = 0;

        while (number != 0) {
//            System.out.println(number + " | " + sum);
            sum += (int) (number % 10);
            number /= 10;
        }

        return sum;
    }
}