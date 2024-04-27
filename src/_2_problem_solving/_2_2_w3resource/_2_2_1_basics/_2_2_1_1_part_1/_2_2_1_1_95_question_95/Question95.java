package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_95_question_95;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1.</h2>
 */

public class Question95 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        String[] arrayDigits = new String[input.nextInt()];
        for (int index = 0; index < arrayDigits.length; index++) arrayDigits[index] = String.valueOf(index);
        System.out.print("Array: " + Arrays.toString(arrayDigits));
    }
}