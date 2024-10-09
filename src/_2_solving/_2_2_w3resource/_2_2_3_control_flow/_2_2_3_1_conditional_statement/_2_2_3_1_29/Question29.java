package _2_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_29;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input an integer number less than ten billion: 125463</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Number of digits in the number: 6</h2>
 */

public class Question29 {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER = 125463;
        System.out.printf("Input an integer number less than ten billion: %d\n", NUMBER);
        System.out.printf("Number of digits in the number: %d", String.valueOf(NUMBER).length());
    }
}