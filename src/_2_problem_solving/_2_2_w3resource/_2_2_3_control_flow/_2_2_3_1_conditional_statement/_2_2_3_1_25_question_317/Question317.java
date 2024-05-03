package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_25_question_317;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to display the number rhombus structure.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input the target number: 7</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 */
/*
 *
 *       1
 *      212
 *     32123
 *    4321234
 *   543212345
 *  65432123456
 * 7654321234567
 *  65432123456
 *   543212345
 *    4321234
 *     32123
 *      212
 *       1
 * */
public class Question317 {
    private static final int TARGET_NUMBER = 7;

    public static void main(final String[] ARGS) {
        System.out.println(STR."Enter the maximum number of the rhombus pattern: \{TARGET_NUMBER}");
        printNumberRhombus();
    }

    public static void printNumberRhombus() {
        printTheUpHalfOfRhombus();
        printTheDownHalfOfRhombus();
    }

    private static void printTheUpHalfOfRhombus() {
        for (int round = 1; round <= TARGET_NUMBER; round++) {
            printSpaces(round);
            printTheLeftHalfOfRhombus(round);
            printTheRightHalfOfRhombus(round);
            System.out.println();
        }
    }

    private static void printTheRightHalfOfRhombus(final int ROUND) {
        for (int number = 2; number <= ROUND; number++)
            System.out.print(number);
    }

    private static void printTheLeftHalfOfRhombus(final int ROUND) {
        for (int number = ROUND; number >= 1; number--)
            System.out.print(number);
    }

    private static void printSpaces(final int ROUND) {
        System.out.print(" ".repeat(TARGET_NUMBER - ROUND));
    }

    private static void printTheDownHalfOfRhombus() {
        for (int round = TARGET_NUMBER - 1; round >= 1; round--) {
            printSpaces(round);
            printTheLeftHalfOfRhombus(round);
            printTheRightHalfOfRhombus(round);
            if (round > 1)
                System.out.println();
        }
    }
}