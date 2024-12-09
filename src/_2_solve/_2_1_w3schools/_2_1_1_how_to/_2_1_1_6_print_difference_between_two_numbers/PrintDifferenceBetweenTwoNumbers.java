package _2_solve._2_1_w3schools._2_1_1_how_to._2_1_1_6_print_difference_between_two_numbers;

import java.util.Scanner;

public class PrintDifferenceBetweenTwoNumbers {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(differenceBetweenTwoNumbers(number1, number2));
    }

    private static int differenceBetweenTwoNumbers(int number1, int number2) {
        if (number1 != number2) {
            if (number1 >= number2) return number1 - number2;
            else return number2 - number1;
        } else return 0;
    }
}