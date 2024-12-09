package _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_17;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to check if a given number is a circular prime or not.
 * <br/>
 * Circular Prime : A circular prime is a prime number with the property that the number generated at each intermediate step when cyclically permuting its (base 10) digits will be prime.
 * <br/>
 * For example, 1193 is a circular prime, since 1931, 9311 and 3119 all are also prime. A circular prime with at least two digits can only consist of combinations of the digits 1, 3, 7 or 9, because having 0, 2, 4, 6 or 8 as the last digit makes the number divisible by 2, and having 0 or 5 as the last digit makes it divisible by 5.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 35
 * <br/>
 * It's not a circular prime number.
 * </h2>
 */
public class Question17 {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER = 35;
        System.out.println("Input a number: " + NUMBER);
        System.out.printf("It's %sa circular prime number",
                isCircularPrimeNumber(NUMBER)
                        ? ""
                        : "not ");
    }

    private static boolean isCircularPrimeNumber(final int NUMBER) {
        if (NUMBER < 2)
            return false;
        return switch (NUMBER) {
            case 2, 3, 5, 7 -> true;
            default -> {
                final String NUMBER_TEXT = String.valueOf(NUMBER);
                for (int index = 0; index < NUMBER_TEXT.length(); index++)
                    if (!isPrime(Integer.parseInt(NUMBER_TEXT.substring(index) + NUMBER_TEXT.substring(0, index))))
                        yield false;
                yield true;
            }
        };
    }

    private static boolean isPrime(final int NUMBER) {
        if (NUMBER == 2 || NUMBER == 3)
            return true;
        else if (NUMBER % 2 == 0 || NUMBER % 3 == 0)
            return false;
        else
            for (int index = 5; index * index <= NUMBER; index += 2)
                if (NUMBER % index == 0 || (NUMBER % (index + 2)) == 0)
                    return false;
        return true;
    }
}