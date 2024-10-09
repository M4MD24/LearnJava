package _2_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_17;

/**
 * <h1>Problem:</h1>
 * <h2>Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input target number: 4</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 1
 * <br/>
 * 22
 * <br/>
 * 333
 * <br/>
 * 4444
 * </h2>
 */

public class Question17 {
    public static void main(final String[] PARAMETERS) {
        final int TARGET_NUMBER = 4;
        System.out.printf("Input target number: %d\n", TARGET_NUMBER);
        printTriangleNumbers(TARGET_NUMBER);
    }

    private static void printTriangleNumbers(final int TARGET_NUMBER) {
        for (int currentLineLength = 1; currentLineLength <= TARGET_NUMBER; currentLineLength++) {
            for (int counter = 0; counter < currentLineLength; counter++)
                System.out.print(currentLineLength);
            if (currentLineLength != TARGET_NUMBER)
                System.out.println();
        }
    }
}