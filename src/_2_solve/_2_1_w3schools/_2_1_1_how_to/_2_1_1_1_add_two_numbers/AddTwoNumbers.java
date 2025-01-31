package _2_solve._2_1_w3schools._2_1_1_how_to._2_1_1_1_add_two_numbers;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(final String[] ARGUMENTS) {
        int number1, number2, result;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers to display:\n\nEnter Number 1 = ");
        number1 = input.nextInt();

        System.out.print("Enter Number 2 = ");
        number2 = input.nextInt();

        input.close();

        result = number1 + number2;
        System.out.print("\nResult:\n" + number1 + " + " + number2 + " = " + result);
    }
}