package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_30;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first number: 2564
 * <br/>
 * Input second number: 3526
 * <br/>
 * Input third number: 2456
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>All numbers are different</h2>
 */

public class Question30 {
    private static final int FIRST_NUMBER = 2564,
            SECOND_NUMBER = 3526,
            THIRD_NUMBER = 2456;

    public static void main(final String[] ARGS) {
        printNumbers();
        System.out.print(getNumbersStatus());
    }

    private static String getNumbersStatus() {
        if (FIRST_NUMBER == SECOND_NUMBER && SECOND_NUMBER == THIRD_NUMBER)
            return "All numbers are equal";
        else if (FIRST_NUMBER != SECOND_NUMBER && SECOND_NUMBER != THIRD_NUMBER)
            return "All numbers are different";
        else
            return "Neither all are equal or different";
    }

    private static void printNumbers() {
        System.out.printf("""
                        Input first number:\s%d
                        Input second number:\s%d
                        Input third number:\s%d
                        """,
                FIRST_NUMBER,
                SECOND_NUMBER,
                THIRD_NUMBER);
    }
}