package _2_solve._2_2_w3resource._2_2_2_data_types._2_2_2_1_data_types._2_2_2_1_9;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input 1st integer: 25
 * <br/>
 * Input 2nd integer: 5
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Sum of two integers: 30
 * <br/>
 * Difference of two integers: 20
 * <br/>
 * Product of two integers: 125
 * <br/>
 * Average of two integers: 15.00
 * <br/>
 * Distance of two integers: 20
 * <br/>
 * Max integer: 25
 * <br/>
 * Min integer: 5
 * </h2>
 */

public class Question9 {
    public static void main(final String[] PARAMETERS) {
        final int FIRST_NUMBER = 25,
                SECOND_NUMBER = 5;
        System.out.printf("Input 1st number: %d\n", FIRST_NUMBER);
        System.out.printf("Input 2nd number: %d\n\n", SECOND_NUMBER);
        System.out.printf("Sum of two number: %d\n", FIRST_NUMBER + SECOND_NUMBER);
        System.out.printf("Difference of two numbers: %d\n", Math.abs(FIRST_NUMBER - SECOND_NUMBER));
        System.out.printf("Product of two numbers: %d\n", FIRST_NUMBER * SECOND_NUMBER);
        System.out.printf("Average of two numbers: %.2f\n", (float) (FIRST_NUMBER + SECOND_NUMBER) / 2);
        System.out.printf("Distance of two numbers: %d\n", Math.abs(FIRST_NUMBER - SECOND_NUMBER));
        System.out.printf("Max number: %d\n", Math.max(FIRST_NUMBER, SECOND_NUMBER));
        System.out.printf("Min number: %d", Math.min(FIRST_NUMBER, SECOND_NUMBER));
    }
}