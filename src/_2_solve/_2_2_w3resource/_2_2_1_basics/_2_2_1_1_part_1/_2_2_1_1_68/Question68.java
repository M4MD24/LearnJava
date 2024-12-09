package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_68;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create another string of 4 copies of the last 3 characters of the original string. The original string length must be 3 and above.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input text: 9.6</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>9.69.69.69.6</h2>
 */

public class Question68 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Input text: ");
            final String text = input.nextLine();
            if (text.length() > 2) {
                String last3Character = text.substring(text.length() - 3);
                System.out.print(text + last3Character.repeat(3));
                break;
            } else System.out.println("\nThe text length must be 3 and above!");
        }
    }
}