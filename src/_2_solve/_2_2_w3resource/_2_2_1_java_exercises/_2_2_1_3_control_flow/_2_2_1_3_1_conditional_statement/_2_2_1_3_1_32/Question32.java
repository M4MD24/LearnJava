package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_3_control_flow._2_2_1_3_1_conditional_statement._2_2_1_3_1_32;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that accepts two floating point numbers and checks whether they are the same up to two decimal places.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first floating point number: 1235
 * <br/>
 * Input second floating point number: 2534
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>These numbers are different.</h2>
 */

public class Question32 {
    private static final float FIRST_NUMBER = 1235F,
            SECOND_NUMBER = 2534F;

    public static void main(final String[] ARGUMENTS) {
        printNumbers();
        System.out.print(isSameUpToTwoDecimalPlaces()
                ? "These numbers are the same."
                : "These numbers are different.");
    }

    private static boolean isSameUpToTwoDecimalPlaces() {
        return Math.abs(FIRST_NUMBER - SECOND_NUMBER) <= 0.01;
    }

    private static void printNumbers() {
        System.out.printf("""
                        Input first floating point number: %f
                        Input second floating point number: %f
                        """,
                FIRST_NUMBER,
                SECOND_NUMBER);
    }
}