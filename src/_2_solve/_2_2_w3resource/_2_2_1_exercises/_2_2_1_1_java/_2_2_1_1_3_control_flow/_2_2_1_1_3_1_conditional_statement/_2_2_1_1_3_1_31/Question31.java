package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_3_control_flow._2_2_1_1_3_1_conditional_statement._2_2_1_1_3_1_31;

/**
 * <h1>Problem:</h1>
 * <h2>Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first number: 1524
 * <br/>
 * Input second number: 2345
 * <br/>
 * Input third number: 3321
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Increasing order</h2>
 */

public class Question31 {
    private static final int FIRST_NUMBER = 1524,
            SECOND_NUMBER = 2345,
            THIRD_NUMBER = 3321;

    public static void main(final String[] ARGUMENTS) {
        printNumbers();
        System.out.printf("%s order", getNumbersStatus());
    }

    private static String getNumbersStatus() {
        if (THIRD_NUMBER > SECOND_NUMBER && SECOND_NUMBER > FIRST_NUMBER)
            return "Increasing";
        else if (FIRST_NUMBER > SECOND_NUMBER && SECOND_NUMBER > THIRD_NUMBER)
            return "Decreasing";
        else
            return "Neither increasing or decreasing";
    }

    private static void printNumbers() {
        System.out.printf("""
                        Input first number: %d
                        Input second number: %d
                        Input third number: %d
                        """,
                FIRST_NUMBER,
                SECOND_NUMBER,
                THIRD_NUMBER);
    }
}