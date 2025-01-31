package _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_11;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to check whether a given number is a Disarium number or an unhappy number.
 * <br/>
 * A Disarium number is a number defined by the following process:
 * <br/>
 * Sum of its digits powered with their respective position is equal to the original number.
 * <br/>
 * For example 175 is a Disarium number:
 * <br/>
 * As 1^1+3^2+5^3 = 135
 * <br/>
 * Some other DISARIUM are 89, 175, 518 etc.
 * <br/>
 * A number will be called Disarium if the sum of its digits powered with their respective position is equal with the number itself. Sample Input: 135.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 25
 * <br/>
 * Not a Disarium Number.
 * </h2>
 */
public class Question11 {
    private static int getNumberOfDigits(int number) {
        int numberOfDigits = 0;
        while (number > 0) {
            numberOfDigits++;
            number = number / 10;
        }
        return numberOfDigits;
    }

    private static boolean isDisarium(int number) {
        int sum = 0,
                temporary = number,
                digits = getNumberOfDigits(number);
        while (temporary > 0) {
            final int DIGIT = temporary % 10;
            sum += (int) Math.pow(DIGIT, digits);
            temporary = temporary / 10;
            digits--;
        }
        return sum == number;
    }

    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input a number: ");
        final int NUMBER = INPUT.nextInt();
        if (!isDisarium(NUMBER))
            System.out.print("Not a ");
        System.out.print("Disarium Number.");
    }
}