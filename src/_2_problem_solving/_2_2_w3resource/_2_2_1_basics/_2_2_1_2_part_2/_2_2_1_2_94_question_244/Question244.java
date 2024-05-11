package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_94_question_244;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program that accepts a string from the user and checks whether it is correct or not.
 * <br/>
 * <br/>
 * The conditions for getting the "correct answer" are:
 * </h2>
 * <ol>
 *   <li>A) There must be only three characters X, Y, and Z in the string, and no other characters.</li>
 *   <li>B) Any string of any form such as aXYZa can get the "correct answer", where a is either an empty string or a string consisting only of the letter X;</li>
 *   <li>C) If aXbZc is true, aXbYZca is also valid, where a, b, c are either empty strings or a string consisting only of the letter X.</li>
 * </ol>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a text: XYZ
 * <br/>
 * Correct format..
 * </h2>
 */

public class Question244 {
    public static void main(final String[] ARGS) {
        final String TEXT = "XYZ";
        System.out.printf("Input a text: %s\n", TEXT);
        System.out.print(isValidString(TEXT)
                ? "Correct format.."
                : "Incorrect format..");
    }

    private static boolean isValidString(final String TEXT) {
        if (!TEXT.matches("[XYZ]+")) return false;
        return TEXT.equals("XYZ") || TEXT.matches("X?XYZ|X?XYZX|X?XYZX?");
    }
}