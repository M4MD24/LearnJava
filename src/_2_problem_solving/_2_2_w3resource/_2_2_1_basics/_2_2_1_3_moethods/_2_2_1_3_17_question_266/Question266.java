package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_moethods._2_2_1_3_17_question_266;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to count the number of digits in an integer with the value 2. The integer may be assumed to be non-negative.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 12541
 * <br/>
 * 1
 * </h2>
 */
public class Question266 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 12541;
        System.out.println(STR."Input a number: \{NUMBER}");
        System.out.print(getCountDigitTwo(NUMBER));
    }

    private static int getCountDigitTwo(int number) {
        int countDigitTwo = 0;
        while (number > 0) {
            if (number % 10 == 2)
                countDigitTwo++;
            number = number / 10;
        }
        return countDigitTwo;
    }
}