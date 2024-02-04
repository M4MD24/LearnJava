package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_15_question_15;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to swap two variables.</h2>
 */

public class Question15 {
    public static void main(String[] args) {
        int variable1 = 1;
        int variable2 = 2;

        System.out.println("Before swap:\nVariable 1 = " + variable1 +
                "\nVariable 2 = " + variable2);

        withTemporaryVariable(variable1, variable2);

        withoutTemporaryVariable(variable1, variable2);
    }

    static void withTemporaryVariable(int variable1, int variable2) {
        int temporary = variable1;
        variable1 = variable2;
        variable2 = temporary;

        System.out.println("\nAfter swap with temporary variable:\nVariable 1 = " + variable1 +
                "\nVariable 2 = " + variable2);
    }

    static void withoutTemporaryVariable(int variable1, int variable2) {
        variable1 += variable2;
        variable2 = variable1 - variable2;
        variable1 -= variable2;

        System.out.println("\nAfter swap without temporary variable:\nVariable 1 = " + variable1 +
                "\nVariable 2 = " + variable2);
    }
}