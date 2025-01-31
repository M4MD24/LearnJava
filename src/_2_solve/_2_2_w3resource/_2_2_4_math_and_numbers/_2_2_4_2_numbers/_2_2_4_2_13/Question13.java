package _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_13;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to check whether a number is a Pronic or Heteromeric Number or not.
 * <br/>
 * A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1).
 * <br/>
 * The first few pronic numbers are:
 * <br/>
 * 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 … etc.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number : 110
 * <br/>
 * Pronic Number.
 * </h2>
 */
public class Question13 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 110;
        System.out.println("Input a number: " + NUMBER);
        System.out.printf("%sPronic Number.", isPronicNumber(NUMBER) ? "" : "Not ");
    }

    private static boolean isPronicNumber(int number) {
        if (number == 0) return true;
        else
            for (int firstNumber = 1, secondNumber = 2; secondNumber <= number / 2; firstNumber++, secondNumber++)
                if (firstNumber * secondNumber == number)
                    return true;
        return false;
    }
}