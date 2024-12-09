package _2_solve._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_6;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input floating-point number: 25.586
 * <br/>
 * Input floating-point another number: 25.589
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>They are different</h2>
 */

public class Question6 {
    public static void main(final String[] PARAMETERS) {
        final float NUMBER = 25.586F,
                ANOTHER_NUMBER = 25.589F;
        System.out.printf("""
                        Input floating-point number:\s%f
                        Input floating-point another number:\s%f
                        """,
                NUMBER,
                ANOTHER_NUMBER);
        System.out.printf("They are %s", areEquals(NUMBER, ANOTHER_NUMBER));
    }

    private static String areEquals(final float NUMBER, final float ANOTHER_NUMBER) {
        return Float.compare(NUMBER, ANOTHER_NUMBER) == 0
                ? "equals"
                : "different";
    }
}