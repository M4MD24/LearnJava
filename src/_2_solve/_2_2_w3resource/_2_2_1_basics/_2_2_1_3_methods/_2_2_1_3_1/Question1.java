package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_1;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java method to find the smallest number among three numbers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input the first number: 25
 * <br/>
 * Input the second number: 37
 * <br/>
 * Input the third number: 29
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The smallest value is 25</h2>
 */

public class Question1 {
    public static void main(final String[] ARGUMENTS) {
        final int FIRST_NUMBER = 25,
                SECOND_NUMBER = 37,
                THIRD_NUMBER = 29;
        printNumbers(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER);
        printSmallestNumber(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER);
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

    private static void printSmallestNumber(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        System.out.printf("The smallest value is %d", smallestNumber(
                FIRST_NUMBER,
                SECOND_NUMBER,
                THIRD_NUMBER
        ));
    }

    private static int smallestNumber(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        return Math.min(FIRST_NUMBER, Math.min(SECOND_NUMBER, THIRD_NUMBER));
    }
}