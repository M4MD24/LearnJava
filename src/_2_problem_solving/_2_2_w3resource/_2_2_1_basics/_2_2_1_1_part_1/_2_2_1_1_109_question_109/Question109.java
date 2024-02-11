package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_109_question_109;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.</h2>
 */

public class Question109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input positive integer: ");
        final int NUMBER = input.nextInt();

        solution1(NUMBER);
        solution2(NUMBER);
    }

    private static void solution1(final int NUMBER) {
        double sqrtResult = Math.sqrt(8 * NUMBER + 1);
        System.out.println(8 + " * " + NUMBER + " + " + 1 + " = " + sqrtResult);
        int numberRows = (int) ((sqrtResult - 1) / 2);
        System.out.println("( " + sqrtResult + " - " + 1 + " )" + " / " + 2 + " = " + numberRows);
        System.out.println("Number of rows: " + numberRows + "\n");
    }

    private static void solution2(int number) {
        int index = 0,
                cursor = 0,
                column = 1,
                rowsSum = 0;
        while (index < number) {
            index++;
            if (cursor == column) {
                System.out.println();
                cursor = 0;
                ++column;
            }
            System.out.print('#');
            cursor++;
            if (cursor == column) ++rowsSum;
        }
        System.out.print("\nNumber of rows: " + rowsSum);
    }
}