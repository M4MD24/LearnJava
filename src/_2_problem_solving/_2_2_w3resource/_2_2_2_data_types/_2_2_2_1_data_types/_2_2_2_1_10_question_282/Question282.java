package _2_problem_solving._2_2_w3resource._2_2_2_data_types._2_2_2_1_data_types._2_2_2_1_10_question_282;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to break an integer into a sequence of digits.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input six non-negative digits: 123456</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>1 2 3 4 5 6</h2>
 */

public class Question282 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 123456;
        System.out.println(STR."Input six non-negative digits: \{NUMBER}");
        printDigitsWithSpaces(NUMBER);
    }

    private static void printDigitsWithSpaces(final int NUMBER) {
        final StringBuilder DIGITS = new StringBuilder(String.valueOf(NUMBER));
        while (!DIGITS.isEmpty()) {
            System.out.print(DIGITS.charAt(0));
            DIGITS.deleteCharAt(0);
            if (!DIGITS.isEmpty())
                System.out.print(" ");
        }
    }
}