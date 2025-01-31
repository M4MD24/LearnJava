package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_116;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that iterates integers from 1 to 100. For multiples of three print "three" instead of the number and print "five" for five. When the number is divided by three and five, print "three and five".</h2>
 */

public class Question116 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        final int number = input.nextInt();
        String THREE = "three",
                FIVE = "five";
        for (int index = 0, complicationNumber3 = 3, complicationNumber5 = 5; index <= number; index++) {
            if (index == complicationNumber3 && index == complicationNumber5) {
                System.out.print(index + ": " + THREE + " and " + FIVE);
                complicationNumber3 += 3;
                complicationNumber5 += 5;
                if (index != number) System.out.println();
            } else if (index == complicationNumber3) {
                System.out.print(index + ": " + THREE);
                complicationNumber3 += 3;
                if (index != number) System.out.println();
            } else if (index == complicationNumber5) {
                System.out.print(index + ": " + FIVE);
                complicationNumber5 += 5;
                if (index != number) System.out.println();
            }
        }
    }
}