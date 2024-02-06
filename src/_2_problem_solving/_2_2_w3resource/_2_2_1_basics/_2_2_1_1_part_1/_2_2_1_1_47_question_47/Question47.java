package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_47_question_47;

import java.text.SimpleDateFormat;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to display the current date and time in a specific format.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Now: 2017/06/16 08:52:03.066</h2>
 */

public class Question47 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:SSS");
        System.out.printf("Now: %s", simpleDateFormat.format(System.currentTimeMillis()));
    }
}