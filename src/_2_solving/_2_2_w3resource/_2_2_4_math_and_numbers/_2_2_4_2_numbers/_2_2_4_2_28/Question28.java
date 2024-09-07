package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_28;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to check whether a number is an Armstrong Number or not.
 * <br/>
 * Armstrong (Michael F. Armstrong) number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input an integer: 153
 * <br/>
 * Is Armstrong number? true
 * </h2>
 */
public class Question28 {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER = 153;
        System.out.println("Input an integers: " + NUMBER);
        System.out.print("Is Armstrong number? " + isArmstrongNumber(NUMBER));
    }

    private static boolean isArmstrongNumber(final int ORIGINAL_NUMBER) {
        int number = ORIGINAL_NUMBER,
                sum = 0;
        while (number != 0) {
            sum += (int) Math.pow(number % 10, 3);
            number /= 10;
        }
        return sum == ORIGINAL_NUMBER;
    }
}