package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_50;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print numbers between 1 and 100 divisible by (first number), (second number) and (both).</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first number: 3
 * <br/>
 * Input second number: 5
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * Divided by: 3
 * <br/>
 * 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99
 * <br/>
 * <br/>
 * Divided by: 5
 * <br/>
 * 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95
 * <br/>
 * <br/>
 * Divided by: 3 &  5
 * <br/>
 * 15, 30, 45, 60, 75, 90
 * </h2>
 */

public class Question50 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        final int FIRST_NUMBER = input.nextInt();

        System.out.print("Input second number: ");
        final int SECOND_NUMBER = input.nextInt();

        dividedBy(FIRST_NUMBER);

        dividedBy(SECOND_NUMBER);

        dividedBy(FIRST_NUMBER, SECOND_NUMBER);
    }

    private static void dividedBy(final int NUMBER) {
        System.out.println("\nDivided by: " + NUMBER);
        int sum = NUMBER;
        while (sum < 101) {
            System.out.print(sum);
            sum += NUMBER;
            if (sum < 101) System.out.print(", ");
            else {
                System.out.println();
                break;
            }
        }
    }

    private static void dividedBy(final int NUMBER1, final int NUMBER2) {
        System.out.println("\nDivided by: " + NUMBER1 + " & " + NUMBER2);
        int sum = NUMBER1 * NUMBER2;
        while (sum < 101) {
            System.out.print(sum);
            sum += NUMBER1 * NUMBER2;
            if (sum < 101) System.out.print(", ");
            else break;
        }
    }
}