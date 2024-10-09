package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_16;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to calculate power of a number without using multiplication(*) and division(/) operators.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the base: 2
 * <br/>
 * Input the exponent: 5
 * <br/>
 * Power of the number: 32
 * </h2>
 */

public class Question16 {
    public static void main(final String[] PARAMETERS) {
        final int BASE = 2,
                EXPONENT = 5;
        System.out.printf("""
                        Input the base: %d
                        Input the exponent: %d
                        Power of the number: %d""",
                BASE,
                EXPONENT,
                getPowerOfTheNumber(BASE, EXPONENT));
    }

    private static int getPowerOfTheNumber(final int BASE, final int EXPONENT) {
        int powerOfTheNumber = BASE,
                temporaryResult = BASE;
        for (int power = 1; power < EXPONENT; power++) {
            for (int counter = 1; counter < BASE; counter++)
                powerOfTheNumber += temporaryResult;
            temporaryResult = powerOfTheNumber;
        }
        return powerOfTheNumber;
    }
}