package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_136_question_136;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find possible distinct paths from the top-left corner to the bottom-right corner of a given grid (m x n).</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>You can move either down or right at any point in time.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Unique paths from top-left corner to bottom-right corner of the said grid: 3</h2>
 */
public class Question136 {
    public static void main(final String[] ARGS) {
        final int MAX_HEIGHT = 0,
                MAX_WIDTH = 0;
        System.out.println("Unique paths from top-left corner to bottom-right corner of the said grid: " + countUniquePaths(MAX_HEIGHT, MAX_WIDTH));
    }

    private static int countUniquePaths(int maxHeight, int maxWidth) {
        if (maxHeight == 0 || maxWidth == 0) return 0;
        else if (maxHeight == 1 || maxWidth == 1) return 1;
        else {
            --maxHeight;
            --maxWidth;
            return factorial((maxHeight - 1) + (maxWidth - 1)) / (factorial(maxHeight - 1) * factorial(maxWidth - 1));
        }
    }

    private static int factorial(final int NUMBER) {
        if (NUMBER == 0) return 0;
        int product = 1;
        for (int currentNumber = 1; currentNumber <= NUMBER; currentNumber++) product *= currentNumber;
        return product;
    }
}