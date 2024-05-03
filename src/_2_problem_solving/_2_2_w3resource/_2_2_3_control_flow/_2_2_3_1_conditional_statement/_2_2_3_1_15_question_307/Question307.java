package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_15_question_307;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that displays the sum of n odd natural numbers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number of terms is: 5</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * The odd numbers are:
 * <br/>
 * 1
 * <br/>
 * 3
 * <br/>
 * 5
 * <br/>
 * 7
 * <br/>
 * 9
 * <br/>
 * The sum of odd natural number up to 5 terms is: 25
 * </h2>
 */

public class Question307 {
    private static int sumOfOddNumbers = 0;

    public static void main(final String[] ARGS) {
        final int NUMBER_OF_TERMS = 5;
        System.out.println(STR."Input number if terms is: \{NUMBER_OF_TERMS}");
        System.out.println("The odd numbers are:");
        printOddNumbers(NUMBER_OF_TERMS);
        System.out.print(STR."The sum of odd natural number up to \{NUMBER_OF_TERMS} is: \{sumOfOddNumbers}");
    }

    private static void printOddNumbers(int numberOfTerms) {
        for (int number = 1; numberOfTerms-- > 0; number += 2) {
            System.out.println(number);
            sumOfOddNumbers += number;
        }
    }
}