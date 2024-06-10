package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_13;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to display the cube of the given number up to an integer.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input target number of terms: 4</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Current number is: 1 and cube of 1 is: 1
 * <br/>
 * Current number is: 2 and cube of 2 is: 8
 * <br/>
 * Current number is: 3 and cube of 3 is: 27
 * <br/>
 * Current number is: 4 and cube of 4 is: 64
 * </h2>
 */

public class Question13 {
    public static void main(final String[] ARGS) {
        final int TARGET_NUMBER = 4;
        System.out.printf("Input number of terms: %d\n", TARGET_NUMBER);
        printCubeNumbersToTargetNumber(TARGET_NUMBER);
    }

    private static void printCubeNumbersToTargetNumber(final int TARGET_NUMBER) {
        for (int currentNumber = 1; currentNumber <= TARGET_NUMBER; currentNumber++) {
            System.out.printf("Current number is: %d and cube of %d is: %d",
                    currentNumber,
                    currentNumber,
                    (int) Math.pow(currentNumber, 3));
            if (currentNumber != TARGET_NUMBER)
                System.out.println();
        }
    }
}