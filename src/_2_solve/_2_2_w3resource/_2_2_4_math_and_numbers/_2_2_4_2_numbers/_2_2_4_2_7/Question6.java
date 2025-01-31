package _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_7;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to display the first 10 lucas numbers.
 * <br/>
 * The Lucas numbers or series are an integer sequence named after the mathematician François Édouard Anatole Lucas, who studied both that sequence and the closely related Fibonacci numbers. Lucas numbers and Fibonacci numbers form complementary instances of Lucas sequences.
 * <br/>
 * The sequence of Lucas numbers is: 2, 1, 3, 4, 7, 11, 18, 29, ….
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * First ten Lucas a numbers:
 * <br/>
 * 2
 * <br/>
 * 1
 * <br/>
 * 3
 * <br/>
 * 4
 * <br/>
 * 7
 * <br/>
 * 11
 * <br/>
 * 18
 * <br/>
 * 29
 * <br/>
 * 47
 * <br/>
 * 76
 * </h2>
 *
 * @see _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_7.images <h2>Lucas Numbers Spiral</h2>
 */
public class Question6 {
    public static void main(final String[] ARGUMENTS) {
        final int COUNT_OF_NUMBERS = 10;
        System.out.printf("First %d Lucas a numbers:%n", COUNT_OF_NUMBERS);
        printFirstTenLucasNumbers(COUNT_OF_NUMBERS);
    }

    private static void printFirstTenLucasNumbers(final int COUNT_OF_NUMBERS) {
        if (COUNT_OF_NUMBERS == 1)
            System.out.print(2);
        else if (COUNT_OF_NUMBERS == 2)
            System.out.printf("%d%n%d%n", 2, 1);
        else {
            System.out.printf("%d%n%d%n", 2, 1);
            for (int index = 0, firstNumber = 2, secondNumber = 1; index < COUNT_OF_NUMBERS - 2; index++) {
                System.out.print(firstNumber + secondNumber);
                final int TEMPORARY_SECOND_NUMBER = secondNumber;
                secondNumber = firstNumber + secondNumber;
                firstNumber = TEMPORARY_SECOND_NUMBER;
                if (index < COUNT_OF_NUMBERS - 3)
                    System.out.println();
            }
        }
    }
}