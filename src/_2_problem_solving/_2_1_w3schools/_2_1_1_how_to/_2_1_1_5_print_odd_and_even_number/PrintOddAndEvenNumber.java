package _2_problem_solving._2_1_w3schools._2_1_1_how_to._2_1_1_5_print_odd_and_even_number;

import java.util.Scanner;

public class PrintOddAndEvenNumber {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int number = input.nextInt();
            if (number % 2 == 0) System.out.println("even");
            else System.out.println("odd");
        }
    }
}