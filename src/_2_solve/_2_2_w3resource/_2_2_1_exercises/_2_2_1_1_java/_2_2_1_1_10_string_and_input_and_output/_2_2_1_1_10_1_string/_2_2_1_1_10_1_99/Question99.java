package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_99;

import java.util.stream.IntStream;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to return an updated string using every character of even position from a given string.</h2>
 */

public class Question99 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRemoveOddPosition("N_u_l_l_e_x_i_a"));
    }

    private static String getTextAfterRemoveOddPosition(final String TEXT) {
        return IntStream.range(0, TEXT.length())
                .filter(index -> index % 2 == 0)
                .mapToObj(TEXT::charAt)
                .collect(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append
                ).toString();
    }
}