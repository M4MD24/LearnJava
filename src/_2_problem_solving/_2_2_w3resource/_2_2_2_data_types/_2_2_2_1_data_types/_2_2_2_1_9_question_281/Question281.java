package _2_problem_solving._2_2_w3resource._2_2_2_data_types._2_2_2_1_data_types._2_2_2_1_9_question_281;

/**
 * <h1>Question:</h1>
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

public class Question281 {
    public static void main(final String[] ARGS) {
        final int FIRST_NUMBER = 25,
                SECOND_NUMBER = 5;
        System.out.println(STR."Input 1st number: \{FIRST_NUMBER}");
        System.out.println(STR."Input 2nd number: \{SECOND_NUMBER}\n");
        System.out.println(STR."Sum of two number: \{FIRST_NUMBER + SECOND_NUMBER}");
        System.out.println(STR."Difference of two numbers: \{Math.abs(FIRST_NUMBER - SECOND_NUMBER)}");
        System.out.println(STR."Product of two numbers: \{FIRST_NUMBER * SECOND_NUMBER}");
        System.out.println(STR."Average of two numbers: \{String.format("%.2f", (float) (FIRST_NUMBER + SECOND_NUMBER) / 2)}");
        System.out.println(STR."Distance of two numbers: \{Math.abs(FIRST_NUMBER - SECOND_NUMBER)}");
        System.out.println(STR."Max number: \{Math.max(FIRST_NUMBER, SECOND_NUMBER)}");
        System.out.print(STR."Min number: \{Math.min(FIRST_NUMBER, SECOND_NUMBER)}");
    }
}