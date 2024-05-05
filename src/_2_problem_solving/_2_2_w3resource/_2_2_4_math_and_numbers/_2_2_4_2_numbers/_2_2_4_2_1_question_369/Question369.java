package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_1_question_369;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to check whether a given number is ugly.
 * <br/>
 * In number system, ugly numbers are positive numbers whose only prime factors are 2, 3 or 5. First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is included.
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Input an integer number: 235</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>It is not an ugly number.</h2>
 */

public class Question369 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 235;
        System.out.print(STR."""
                Input and integer number: \{NUMBER}
                It \{isUglyNumber(NUMBER) ? "is" : "isn't"} and ugly number.""");
    }

    private static boolean isUglyNumber(int number) {
        if (number <= 0)
            return false;
        while (number % 2 == 0)
            number /= 2;
        while (number % 3 == 0)
            number /= 3;
        while (number % 5 == 0)
            number /= 5;
        return number == 1;
    }
}