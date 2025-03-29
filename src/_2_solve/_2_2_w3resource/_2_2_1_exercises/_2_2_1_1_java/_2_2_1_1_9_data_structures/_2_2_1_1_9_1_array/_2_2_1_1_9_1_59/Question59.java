package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_59;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the maximum product of two integers in a given array of integers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Numbers = {2, 3, 5, 7, -7, 5, 8, -5}</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Pair is (7, 8), Maximum Product: 56</h2>
 */

public class Question59 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {2, 3, 5, 7, -7, 5, 8, -5};
        printPairsAndMaximumProductOfTwoNumbers(NUMBERS);
    }

    private static void printPairsAndMaximumProductOfTwoNumbers(final int[] NUMBERS) {
        int maximumFirstNumber = NUMBERS[0],
                maximumSecondNumber = NUMBERS[1],
                maximumProductOfTwoNumbers = NUMBERS[0] * NUMBERS[1];
        for (int indexOfFirstNumber = 0; indexOfFirstNumber < NUMBERS.length; indexOfFirstNumber++) {
            final int CURRENT_FIRST_NUMBER = NUMBERS[indexOfFirstNumber];
            for (int indexOfSecondNumber = indexOfFirstNumber + 1; indexOfSecondNumber < NUMBERS.length; indexOfSecondNumber++) {
                final int CURRENT_SECOND_NUMBER = NUMBERS[indexOfSecondNumber],
                        CURRENT_PRODUCT_OF_TWO_NUMBERS = CURRENT_FIRST_NUMBER * CURRENT_SECOND_NUMBER;
                if (CURRENT_PRODUCT_OF_TWO_NUMBERS > maximumProductOfTwoNumbers) {
                    maximumProductOfTwoNumbers = CURRENT_PRODUCT_OF_TWO_NUMBERS;
                    maximumFirstNumber = CURRENT_FIRST_NUMBER;
                    maximumSecondNumber = CURRENT_SECOND_NUMBER;
                }
            }
        }
        System.out.printf("""
                        Pair is (%d, %d), Maximum Product: %d""",
                maximumFirstNumber,
                maximumSecondNumber,
                maximumProductOfTwoNumbers);
    }
}