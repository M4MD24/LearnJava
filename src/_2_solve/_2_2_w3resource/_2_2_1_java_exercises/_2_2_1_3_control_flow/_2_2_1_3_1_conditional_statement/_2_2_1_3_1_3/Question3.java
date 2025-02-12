package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_3_control_flow._2_2_1_3_1_conditional_statement._2_2_1_3_1_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that takes three numbers from the user and prints the greatest number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input the 1st number: 25
 * <br/>
 * Input the 2nd number: 78
 * <br/>
 * Input the 3rd number: 87
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The greatest: 87</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        final int FIRST_NUMBER = 25,
                SECOND_NUMBER = 78,
                THIRD_NUMBER = 87;
        System.out.printf("""
                        Input the 1st number: %d
                        Input the 2nd number: %d
                        Input the 3rd number: %d
                        """,
                FIRST_NUMBER,
                SECOND_NUMBER,
                THIRD_NUMBER);
        System.out.printf("The greatest: %d", getMaximumNumber(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER));
    }

    private static int getMaximumNumber(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        if (FIRST_NUMBER >= SECOND_NUMBER && FIRST_NUMBER >= THIRD_NUMBER)
            return FIRST_NUMBER;
        else if (SECOND_NUMBER >= FIRST_NUMBER && SECOND_NUMBER >= THIRD_NUMBER)
            return SECOND_NUMBER;
        else
            return THIRD_NUMBER;
    }
}