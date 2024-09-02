package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_14;

/**
 * <h1>Question:</h1>
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
    public static void main(final String[] ARGS) {
        final int NUMBER = 25;
        System.out.printf("""
                        Input an integer:\s%d
                        Square root of a number using Babylonian method:\s%f""",
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