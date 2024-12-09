package _2_solve._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_13;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java recursive method to calculate the product of all numbers in an array.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The product of all numbers in the array is: 105</h2>
 */

public class Question13 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 3, 5, 7};
        System.out.printf("The product of all numbers in the array is: %d", getProductOfAllNumbers(NUMBERS, 1, NUMBERS[0]));
    }

    private static int getProductOfAllNumbers(final int[] NUMBERS, int index, int productOfAllNumbers) {
        if (index == NUMBERS.length)
            return productOfAllNumbers;
        else
            return getProductOfAllNumbers(NUMBERS, index + 1, productOfAllNumbers * NUMBERS[index]);
    }
}