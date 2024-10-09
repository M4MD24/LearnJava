package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_29;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to add one to a positive number represented as an array of digits.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [9, 9, 9, 9]
 * <br/>
 * Array of digits: [1, 0, 0, 0, 0]
 * </h2>
 */

public class Question29 {
    private static int[] numbers = {9, 9, 9, 9};

    public static void main(final String[] PARAMETERS) {
        System.out.printf("Original array: %s\n", Arrays.toString(numbers));
        addValue(1);
        System.out.printf("Array of digits: %s", Arrays.toString(numbers));
    }

    private static void addValue(final int VALUE) {
        StringBuilder numbersText = new StringBuilder();
        for (final int DIGIT : numbers)
            numbersText.append(DIGIT);
        final BigInteger NUMBERS = new BigInteger(String.valueOf(numbersText)).add(BigInteger.valueOf(VALUE));
        numbersText = new StringBuilder(String.valueOf(NUMBERS));
        numbers = new int[numbersText.length()];
        for (int index = 0; index < numbersText.length(); index++)
            numbers[index] = numbersText.charAt(index) - '0';
    }
}