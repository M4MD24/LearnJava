package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_76;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to test if the first and last element of two integer arrays are the same. The array length must be greater than or equal to 2.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * First array length: 7
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
 * Enter value of index 7: 11
 * <br/>
 * <br/>
 * Second array length: 7
 * <br/>
 * Enter value of index 1: 45
 * <br/>
 * Enter value of index 2: 20
 * <br/>
 * Enter value of index 3: 10
 * <br/>
 * Enter value of index 4: 20
 * <br/>
 * Enter value of index 5: 30
 * <br/>
 * Enter value of index 6: 50
 * <br/>
 * Enter value of index 7: 11
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>true</h2>
 */

public class Question76 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);
        int[] firstNumbers,
                secondNumbers;
        final String errorText = "\nThe array length must be broader than or equal to 2.";

        while (true) {
            System.out.print("First array length: ");
            firstNumbers = new int[input.nextInt()];
            if (firstNumbers.length > 1) {
                for (int index = 0; index <= firstNumbers.length; index++) {
                    if (index != firstNumbers.length) {
                        System.out.print("Enter value of index " + (index + 1) + ": ");
                        firstNumbers[index] = input.nextInt();
                    } else break;
                }
            } else System.out.println(errorText);

            System.out.print("\nSecond array length: ");
            secondNumbers = new int[input.nextInt()];
            if (secondNumbers.length > 1) {
                for (int index = 0; index <= secondNumbers.length; index++) {
                    if (index != secondNumbers.length) {
                        System.out.print("Enter value of index " + (index + 1) + ": ");
                        secondNumbers[index] = input.nextInt();
                    } else {
                        System.out.printf("\n%b", (firstNumbers[0] == secondNumbers[0]) || (firstNumbers[firstNumbers.length - 1] == secondNumbers[secondNumbers.length - 1]));
                        return;
                    }
                }
            } else System.out.println(errorText);
        }
    }
}