package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_7;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to prove that Euclid’s algorithm computes the greatest common divisor of two integers that have positive values.
 * <br/>
 * According to Wikipedia "The Euclidean algorithm is based on the principle that the greatest common divisor of two numbers does not change if the larger number is replaced by its difference with the smaller number. For example, 21 is the GCD of 252 and 105 (as 252 = 21 × 12 and 105 = 21 × 5), and the same number 21 is also the GCD of 105 and 252 − 105 = 147. Since this replacement reduces the larger of the two numbers, repeating this process gives successively smaller pairs of numbers until the two numbers become equal. When that occurs, they are the GCD of the original two numbers. By reversing the steps, the GCD can be expressed as a sum of the two original numbers each multiplied by a positive or negative integer, e.g., 21 = 5 × 105 + (−2) × 252. The fact that the GCD can always be expressed in this way is known as Bézout's identity.
 * </h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * 48 24
 * <br/>
 * 125463 9658
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Result: 24
 * <br/>
 * Result: 1
 * </h2>
 */

public class Question7 {
    public static void main(final String[] ARGS) {
        System.out.printf("Result: %d\n", getGreatestCommonDivisor(48, 24));
        System.out.printf("Result: %d", getGreatestCommonDivisor(125463, 9658));
    }

    private static long getGreatestCommonDivisor(long number1, long number2) {
        while (number2 != 0) {
            number1 += number2;
            number2 = number1 - number2;
            number1 -= number2;
            number2 %= number1;
        }
        return number1;
    }
}