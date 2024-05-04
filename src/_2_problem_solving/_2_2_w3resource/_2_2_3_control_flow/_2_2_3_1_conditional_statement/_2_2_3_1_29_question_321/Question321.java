package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_29_question_321;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input an integer number less than ten billion: 125463</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Number of digits in the number: 6</h2>
 */

public class Question321 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 125463;
        System.out.println(STR."Input an integer number less than ten billion: \{NUMBER}");
        System.out.print(STR."Number of digits in the number: \{String.valueOf(NUMBER).length()}");
    }
}