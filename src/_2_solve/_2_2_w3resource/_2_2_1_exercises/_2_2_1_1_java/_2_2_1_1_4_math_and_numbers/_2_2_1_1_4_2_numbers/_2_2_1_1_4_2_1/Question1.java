package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_4_math_and_numbers._2_2_1_1_4_2_numbers._2_2_1_1_4_2_1;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to check whether a given number is ugly.
 * <br/>
 * In number system, ugly numbers are positive numbers whose only prime factors are 2, 3 or 5. First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is included.
 * </h2>
 * <br/>
 * <h1>Input Date:</h1>
 * <h2>Input an integer number: 235</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>It is not an ugly number.</h2>
 */

public class Question1 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 235;
        System.out.printf("""
                        Input and integer number: %d
                        It %b and ugly number.""",
                NUMBER,
                isUglyNumber(NUMBER) ? "is" : "isn't");
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