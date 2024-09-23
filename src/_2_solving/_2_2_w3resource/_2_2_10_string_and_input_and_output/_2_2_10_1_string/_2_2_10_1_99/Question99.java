package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_99;

import java.util.stream.IntStream;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to return an updated string using every character of even position from a given string.</h2>
 */

public class Question99 {
    public static void main(final String[] PARAMETERS) {
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