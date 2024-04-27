package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_75_question_75;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to test if the first and last elements of an array of integers are the same. The array length must be broader than or equal to 2.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Array length: 7
 * <br/>
 * Enter value of index 1: 50
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
 * Enter value of index 7: 10
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>false</h2>
 */

public class Question75 {
    public static void main(final String[] ARGS) {
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
                        System.out.println((numbers[0] == numbers[numbers.length - 1]));
                        return;
                    }
                }
            } else System.out.println("\nThe array length must be broader than or equal to 2.");
        }
    }
}