package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_40_question_40;

import java.nio.charset.Charset;

public class Question40 {
    public static void main(String[] args) {
        System.out.println("List of available character sets: ");
        for (String type : Charset.availableCharsets().keySet()) System.out.println(type);
    }
}