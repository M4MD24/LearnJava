package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_4_math_and_numbers._2_2_1_1_4_1_math._2_2_1_1_4_1_14;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the square root of a number using the Babylonian method.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input an integer: 25
 * <br/>
 * Square root of a number using Babylonian method: 5.0
 * </h2>
 */

public class Question14 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 25;
        System.out.printf("""
                        Input an integer: %d
                        Square root of a number using Babylonian method: %f""",
                NUMBER,
                getSquareRootUsingBabylonian(NUMBER));
    }

    private static float getSquareRootUsingBabylonian(final int NUMBER) {
        float guess = NUMBER / 2.0F;
        while (Math.abs(guess * guess - NUMBER) >= 0.00001F)
            guess = (guess + NUMBER / guess) / 2.0F;
        return guess;
    }
}