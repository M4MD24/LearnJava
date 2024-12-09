package _2_solve._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_11;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to display n terms of natural numbers and their sum.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input number:
 * <br/>
 * 7
 * <br/>
 * The first n natural numbers are: 7
 * <br/>
 * 1
 * <br/>
 * 2
 * <br/>
 * 3
 * <br/>
 * 4
 * <br/>
 * 5
 * <br/>
 * 6
 * <br/>
 * 7
 * <br/>
 * The Sum of Natural Number up to n terms:
 * <br/>
 * 28
 * </h2>
 */

public class Question11 {
    private static int sumOfNumbers = 0;

    public static void main(final String[] PARAMETERS) {
        final int TARGET_NUMBER = 7;
        System.out.printf("Input number: %d\n", TARGET_NUMBER);
        System.out.printf("The first number natural numbers are: %d\n", TARGET_NUMBER);
        printNaturalNumbersToTargetNumber(TARGET_NUMBER);
        System.out.println("The Sum of Natural Number up to target number terms:");
        System.out.print(sumOfNumbers);
    }

    private static void printNaturalNumbersToTargetNumber(final int TARGET_NUMBER) {
        for (int number = 1; number <= TARGET_NUMBER; number++) {
            System.out.println(number);
            sumOfNumbers += number;
        }
    }
}