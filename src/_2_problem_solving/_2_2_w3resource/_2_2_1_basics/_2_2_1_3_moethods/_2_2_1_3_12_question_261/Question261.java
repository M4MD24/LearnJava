package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_moethods._2_2_1_3_12_question_261;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method (takes n as input) to display an n-by-n matrix.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 10
 * <br/>
 * 1 0 0 1 1 0 0 0 1 1
 * <br/>
 * 0 0 1 0 1 0 1 0 0 0
 * <br/>
 * 0 1 0 1 0 0 0 0 0 1
 * <br/>
 * 1 1 1 0 0 0 0 1 1 1
 * <br/>
 * 1 1 0 1 1 1 0 1 0 0
 * <br/>
 * 1 0 0 0 1 1 0 0 0 0
 * <br/>
 * 0 0 1 0 0 0 0 1 1 1
 * <br/>
 * 1 1 0 1 0 1 0 0 1 0
 * <br/>
 * 0 0 1 0 0 0 0 1 1 0
 * <br/>
 * 1 1 1 0 0 1 1 1 1 0
 * </h2>
 */
public class Question261 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 10;
        System.out.println(STR."Input a number: \{NUMBER}");
        printRandomNumbers(NUMBER);
    }

    private static void printRandomNumbers(final int ROWS_AND_COLUMNS) {
        for (int row = 0; row < ROWS_AND_COLUMNS; row++) {
            for (int column = 0; column < ROWS_AND_COLUMNS; column++)
                System.out.print(STR."\{(byte) (Math.random() * 2)} ");
            System.out.println();
        }
    }
}