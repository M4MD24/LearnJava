package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_12_question_380;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to check whether a number is a Harshad Number or not.
 * <br/>
 * In recreational mathematics, a Harshad number in a given number base, is an integer that is divisible by the sum of its digits when written in that base.
 * <br/>
 * Example: Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0) and 200 is divisible by 2. Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) and 171 is divisible by 9.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 353
 * <br/>
 * 353 isn't a Harshad Number.
 * </h2>
 */
public class Question380 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 353;
        System.out.println("Input a number: " + NUMBER);
        System.out.printf("%d is%s a Harchad Number",
                NUMBER,
                isHarshadNumber(NUMBER) ? "" : "n't");
    }

    private static boolean isHarshadNumber(int number) {
        int sum = 0,
                digits = number;
        while (digits != 0) {
            sum += digits % 10;
            digits /= 10;
        }
        return number % sum == 0;
    }
}