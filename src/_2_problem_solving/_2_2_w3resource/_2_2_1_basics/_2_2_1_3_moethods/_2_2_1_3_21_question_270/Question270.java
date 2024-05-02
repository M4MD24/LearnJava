package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_moethods._2_2_1_3_21_question_270;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to display the factors of 3 in a given integer.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input an number(positive/negative): 81
 * <br/>
 * Factors of 3 of the said number:
 * <br/>
 * 81 = 3 * 3 * 3 * 3 * 1
 * </h2>
 */
public class Question270 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 81;
        System.out.println(STR."Input an number (positive/negative): \{NUMBER}");
        System.out.println("Factors of 3 of the said number");
        System.out.print(getFactorsThreeNumber(NUMBER));
    }

    private static int getFactorsThreeNumber(int number) {
        System.out.print(81 + " = ");
        while (number % 3 == 0) {
            System.out.print("3 * ");
            number = number / 3;
        }
        return number;
    }
}