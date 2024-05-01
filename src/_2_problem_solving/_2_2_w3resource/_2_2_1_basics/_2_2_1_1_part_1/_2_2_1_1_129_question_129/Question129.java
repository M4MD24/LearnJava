package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_129_question_129;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find a number that appears only once in a given array of integers. All numbers occur twice.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Source Array: [10, 20, 10, 20, 30, 40, 40, 30, 50]
 * <br/>
 * 50 appears only once
 * </h2>
 */

public class Question129 {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int arrayLength;
    private static int[] array;
    private static boolean continueQuestion = true;

    public static void main(final String[] ARGS) {
        while (continueQuestion) {
            inputArrayLength();
            inputArrayValue();
            System.out.println("Source Array: " + Arrays.toString(array));
            System.out.println(checkForAppearsTheNumberOnlyOnceInArray() + " appears only once");
            continueQuestion();
        }
    }

    private static void inputArrayLength() {
        System.out.print("Enter Array Length: ");
        arrayLength = INPUT.nextInt();
        array = new int[arrayLength];
    }

    private static void inputArrayValue() {
        for (int index = 0; index < arrayLength; index++) {
            System.out.print("Enter value of index " + (index + 1) + ": ");
            array[index] = INPUT.nextInt();
        }
    }

    private static String checkForAppearsTheNumberOnlyOnceInArray() {
        String number = null;
        for (int index = 0; index < arrayLength; index++) {
            int selectedNumber = array[index];
            for (int index2 = 0, anotherNumber; index2 < arrayLength; index2++) {
                if (index != index2) {
                    anotherNumber = array[index2];
                    if (selectedNumber != anotherNumber) {
                        number = String.valueOf(selectedNumber);
                        if (index2 == arrayLength - 1) return number;
                    } else {
                        number = null;
                        break;
                    }
                }
            }
        }
        return (number == null) ? "Nothing" : number;
    }

    private static void continueQuestion() {
        System.out.println("You want to get median of another array? (true/false)");
        continueQuestion = INPUT.nextBoolean();
    }
}