package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_4_math_and_numbers._2_2_1_4_2_numbers._2_2_1_4_2_21;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to find any number between 1 and n that can be expressed as the sum of two cubes in two (or more) different ways.
 * <br/>
 * Here are some examples of Ramanujan numbers:
 * <br/>
 * 1729 = 1^3 + 12^3 = 9^3 + 10^3
 * <br/>
 * * 10000
 * <br/>
 * 1729 = 1^3 + 12^3 = 9^3 + 10^3
 * <br/>
 * 4104 = 2^3 + 16^3 = 9^3 + 15^3
 * <br/>
 * * 100000
 * <br/>
 * 1729 = 1^3 + 12^3 = 9^3 + 10^3
 * <br/>
 * 4104 = 2^3 + 16^3 = 9^3 + 15^3
 * <br/>
 * 13832 = 2^3 + 24^3 = 18^3 + 20^3
 * <br/>
 * 39312 = 2^3 + 34^3 = 15^3 + 33^3
 * <br/>
 * 46683 = 3^3 + 36^3 = 27^3 + 30^3
 * <br/>
 * 32832 = 4^3 + 32^3 = 18^3 + 30^3
 * <br/>
 * 40033 = 9^3 + 34^3 = 16^3 + 33^3
 * <br/>
 * 20683 = 10^3 + 27^3 = 19^3 + 24^3
 * <br/>
 * 65728 = 12^3 + 40^3 = 31^3 + 33^3
 * <br/>
 * 64232 = 17^3 + 39^3 = 26^3 + 36^3
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 1729 = 1^3 + 12^3 = 9^3 + 10^3
 * <br/>
 * 4104 = 2^3 + 16^3 = 9^3 + 15^3
 * <br/>
 * 13832 = 2^3 + 24^3 = 18^3 + 20^3
 * <br/>
 * 39312 = 2^3 + 34^3 = 15^3 + 33^3
 * <br/>
 * 46683 = 3^3 + 36^3 = 27^3 + 30^3
 * <br/>
 * 32832 = 4^3 + 32^3 = 18^3 + 30^3
 * <br/>
 * 40033 = 9^3 + 34^3 = 16^3 + 33^3
 * <br/>
 * 20683 = 10^3 + 27^3 = 19^3 + 24^3
 * <br/>
 * 65728 = 12^3 + 40^3 = 31^3 + 33^3
 * <br/>
 * 64232 = 17^3 + 39^3 = 26^3 + 36^3
 * </h2>
 */
public class Question21 {
    public static void main(final String[] ARGUMENTS) {
        printRamanujanNumber(100_000);
    }

    private static void printRamanujanNumber(final int LIMIT) {
        for (int firstNumber = 1; firstNumber <= LIMIT; firstNumber++) {
            final int FIRST_CUBE_NUMBER = firstNumber * firstNumber * firstNumber;
            if (FIRST_CUBE_NUMBER > LIMIT) break;
            for (int secondNumber = firstNumber; secondNumber <= LIMIT; secondNumber++) {
                final int SECOND_CUBE_NUMBER = secondNumber * secondNumber * secondNumber;
                if (FIRST_CUBE_NUMBER + SECOND_CUBE_NUMBER > LIMIT) break;
                for (int thirdNumber = firstNumber + 1; thirdNumber <= LIMIT; thirdNumber++) {
                    final int THIRD_CUBE_NUMBER = thirdNumber * thirdNumber * thirdNumber;
                    if (THIRD_CUBE_NUMBER > FIRST_CUBE_NUMBER + SECOND_CUBE_NUMBER) break;
                    for (int fourthNumber = thirdNumber; fourthNumber <= LIMIT; fourthNumber++) {
                        final int FOURTH_CUBE_NUMBER = fourthNumber * fourthNumber * fourthNumber;
                        if (THIRD_CUBE_NUMBER + FOURTH_CUBE_NUMBER > FIRST_CUBE_NUMBER + SECOND_CUBE_NUMBER) break;
                        if (THIRD_CUBE_NUMBER + FOURTH_CUBE_NUMBER == FIRST_CUBE_NUMBER + SECOND_CUBE_NUMBER) {
                            System.out.print((FIRST_CUBE_NUMBER + SECOND_CUBE_NUMBER) + " = ");
                            System.out.print(firstNumber + "^3 + " + secondNumber + "^3 = ");
                            System.out.print(thirdNumber + "^3 + " + fourthNumber + "^3");
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}