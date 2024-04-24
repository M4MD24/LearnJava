package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_179_question_179;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to add one to a positive number represented as an array of digits.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [9, 9, 9, 9]
 * <br/>
 * Array of digits: [1, 0, 0, 0, 0]
 * </h2>
 */

public class Question179 {
    private static int[] numbers = {9, 9, 9, 9};

    public static void main(final String[] ARGS) {
        System.out.println(STR."Original array: \{Arrays.toString(numbers)}");
        addValue(1);
        System.out.print(STR."Array of digits: \{Arrays.toString(numbers)}");
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