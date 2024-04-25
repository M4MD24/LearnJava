package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_43_question_193;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that accepts an integer and sums the elements from all possible subsets of a set formed by the first n natural numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Sum of subsets of 25 is: 1157627904</h2>
 */

public class Question193 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 25;
        System.out.print(STR."Sum of subsets of \{NUMBER} is \{getSubsetOfNumber(NUMBER)}");
    }

    private static int getSubsetOfNumber(final int NUMBER) {
        return (NUMBER * (NUMBER + 1) / 2) * (1 << (NUMBER - 1));
    }
}