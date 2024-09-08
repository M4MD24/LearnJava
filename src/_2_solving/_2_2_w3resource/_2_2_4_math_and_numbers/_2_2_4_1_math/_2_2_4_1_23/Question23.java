package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_23;

/**
 * <h1>Question:</h1>
 * <h2>
 * A fast scheme for evaluating a polynomial such as:
 * <br/>
 * -19+ 7x- 4x2 + 6x3
 * <br/>
 * when
 * <br/>
 * x=3
 * <br/>
 * is to arrange the computation as follows: ((((0) X + 6) X + (-4)) X + 7) X + (-19)
 * <br/>
 * Write a Java program to compute the result from the innermost brackets.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>128.0</h2>
 */

public class Question23 {
    public static void main(final String[] PARAMETERS) {
        final int X_NUMBER = 3;
        System.out.print((float) (((((0) * X_NUMBER + 6) * X_NUMBER + (-4)) * X_NUMBER + 7) * X_NUMBER + (-19)));
    }
}