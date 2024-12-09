package _2_solve._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to solve quadratic equations (use if, else if and else).</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first number: 1
 * <br/>
 * Input second number: 5
 * <br/>
 * Input third number: 1
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The roots are -0.20871215252208009 and -4.7912878474779195</h2>
 */

public class Question2 {
    public static void main(final String[] PARAMETERS) {
        final int FIRST_NUMBER = 1,
                SECOND_NUMBER = 5,
                THIRD_NUMBER = 1;
        System.out.printf("""
                        Input first number:\s%d
                        Input second number:\s%d
                        Input third number:\s%d
                        """,
                FIRST_NUMBER,
                SECOND_NUMBER,
                THIRD_NUMBER);
        System.out.print(getRoot(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER));
    }

    private static String getRoot(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        final double DISCRIMINANT = SECOND_NUMBER * SECOND_NUMBER - 4 * FIRST_NUMBER * THIRD_NUMBER;
        if (DISCRIMINANT > 0) {
            final double FIRST_ROOT = (-SECOND_NUMBER + Math.sqrt(DISCRIMINANT)) / (2 * FIRST_NUMBER),
                    SECOND_ROOT = (-SECOND_NUMBER - Math.sqrt(DISCRIMINANT)) / (2 * FIRST_NUMBER);
            return String.format("The roots are %f and %f",
                    FIRST_ROOT,
                    SECOND_ROOT);
        } else if (DISCRIMINANT == 0) {
            final double ROOT = (double) -SECOND_NUMBER / (2 * FIRST_NUMBER);
            return String.format("The Root is: %f", ROOT);
        } else
            return "The equation has no real roots.";
    }
}