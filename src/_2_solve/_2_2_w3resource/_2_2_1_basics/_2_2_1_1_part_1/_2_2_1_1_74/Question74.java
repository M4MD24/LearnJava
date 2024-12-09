package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_74;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to test if 10 appears as the first or last element of an array of integers. The array length must be broader than or equal to 2.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Array length: 7
 * <br/>
 * Enter value of index 1: 10
 * <br/>
 * Enter value of index 2: -20
 * <br/>
 * Enter value of index 3: 0
 * <br/>
 * Enter value of index 4: 30
 * <br/>
 * Enter value of index 5: 40
 * <br/>
 * Enter value of index 6: 60
 * <br/>
 * Enter value of index 7: 15
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>true</h2>
 */

public class Question74 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);
        int[] numbers;
        while (true) {
            System.out.print("Array length: ");
            numbers = new int[input.nextInt()];
            if (numbers.length > 1) {
                for (int index = 0; index <= numbers.length; index++) {
                    if (index != numbers.length) {
                        System.out.print("Enter value of index " + (index + 1) + ": ");
                        numbers[index] = input.nextInt();
                    } else {
                        System.out.println((numbers[0] == 10 || numbers[numbers.length - 1] == 10));
                        return;
                    }
                }
            } else System.out.println("\nThe array length must be broader than or equal to 2.");
        }
    }
}