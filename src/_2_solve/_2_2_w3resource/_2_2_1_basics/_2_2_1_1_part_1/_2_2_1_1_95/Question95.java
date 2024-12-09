package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_95;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1.</h2>
 */

public class Question95 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        String[] arrayDigits = new String[input.nextInt()];
        for (int index = 0; index < arrayDigits.length; index++) arrayDigits[index] = String.valueOf(index);
        System.out.print("Array: " + Arrays.toString(arrayDigits));
    }
}