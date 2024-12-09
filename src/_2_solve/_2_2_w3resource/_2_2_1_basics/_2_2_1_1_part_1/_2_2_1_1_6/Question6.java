package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_6;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.</h2>
 * <br/>
 * <h1>Test Data:</h1>
 * <h2>
 * Input first number: 125
 * <br/>
 * Input second number: 24
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * 125 + 24 = 149
 * <br/>
 * 125 - 24 = 101
 * <br/>
 * 125 x 24 = 3000
 * <br/>
 * 125 / 24 = 5
 * <br/>
 * 125 mod 24 = 5
 * </h2>
 */

public class Question6 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int number1 = input.nextInt();

        System.out.print("Input second number: ");
        int number2 = input.nextInt(),
                additionOfTwoNumbers = number1 + number2,
                subtractOfTwoNumbers = number1 - number2,
                multiplyOfTwoNumbers = number1 * number2,
                divideOfTwoNumbers = number1 / number2,
                reminderOfTwoNumbers = number1 % number2;

        System.out.println(number1 + " + " + number2 + " = " + additionOfTwoNumbers);
        System.out.println(number1 + " - " + number2 + " = " + subtractOfTwoNumbers);
        System.out.println(number1 + " x " + number2 + " = " + multiplyOfTwoNumbers);
        System.out.println(number1 + " / " + number2 + " = " + divideOfTwoNumbers);
        System.out.print(number1 + " mod " + number2 + " = " + reminderOfTwoNumbers);
    }
}