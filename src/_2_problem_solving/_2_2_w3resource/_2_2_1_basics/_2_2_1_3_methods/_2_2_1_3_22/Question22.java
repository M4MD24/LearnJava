package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_22;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to check whether every digit of a given integer is even. Return true if every digit is odd otherwise false.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input an number: 8642
 * <br/>
 * Check whether every digit of the said number is even or not!
 * <br/>
 * true
 * </h2>
 */
public class Question22 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 8642;
        System.out.printf("Input an number: \n%d", NUMBER);
        System.out.println("Check whether every digit of the said number is even or not!");
        System.out.print(allDigitsAreEven(NUMBER));
    }

    private static boolean allDigitsAreEven(int number) {
        while (number > 0)
            if (number % 10 % 2 != 0)
                return false;
            else
                number /= 10;
        return true;
    }
}