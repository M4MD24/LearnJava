package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_120_question_120;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that searches for a value in an m x n matrix.</h2>
 */

public class Question120 {
    private static final int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public static void main(String[] args) {
        displayMatrix();


    }

    private static void displayMatrix() {
        for (int index1dimension = 0; index1dimension < matrix.length; index1dimension++) {
            for (int index2dimension = 0; index2dimension < matrix[index1dimension].length; index2dimension++) {
                System.out.print(matrix[index1dimension][index2dimension]);
                if (index2dimension != matrix[index1dimension].length - 1) System.out.print(" ");
                else System.out.println();
            }
        }
    }
}
// Write a Java program
// that searches for a value in an m x n matrix.