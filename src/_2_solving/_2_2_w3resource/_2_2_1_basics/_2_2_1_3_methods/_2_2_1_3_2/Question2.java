package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_2;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to compute the average of three numbers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input the first number: 25
 * <br/>
 * Input the second number: 45
 * <br/>
 * Input the third number: 65
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The average value is 45</h2>
 */

public class Question2 {
    public static void main(final String[] ARGS) {
        final int FIRST_NUMBER = 25,
                SECOND_NUMBER = 45,
                THIRD_NUMBER = 65;
        printNumbers(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER);
        printAverageNumber(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER);
    }

    private static void printNumbers(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        System.out.printf(
                """
                        Input the first number: %d
                        Input the second number: %d
                        Input the third number: %d
                        """,
                FIRST_NUMBER,
                SECOND_NUMBER,
                THIRD_NUMBER
        );
    }

    private static void printAverageNumber(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        System.out.printf("The average value is %d", getAverageNumbers(
                FIRST_NUMBER,
                SECOND_NUMBER,
                THIRD_NUMBER
        ));
    }

    private static int getAverageNumbers(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        return (FIRST_NUMBER + SECOND_NUMBER + THIRD_NUMBER) / 3;
    }
}