package _2_solving._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_5;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that matches a string with a 'p' followed by anything ending in 'q'.</h2>
 */

public class Question5 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "p._hello_.q";
        System.out.print(is_p_InStartAnd_q_InEnd(TEXT));
    }

    private static boolean is_p_InStartAnd_q_InEnd(final String TEXT) {
        return TEXT.matches("p.*q");
    }
}