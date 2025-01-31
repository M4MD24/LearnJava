package _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_26;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to check whether a number is a Keith Number or not.
 * <br/>
 * In recreational mathematics, a Keith number or repfigit number (short for repetitive Fibonacci-like digit) is a number in the following integer sequence:
 * <br/>
 * 14, 19, 28, 47, 61, 75, 197, 742, 1104, 1537, 2208, 2580, 3684, 4788, 7385, 7647, 7909, 31331, 34285, 34348, 55604, 62662, 86935, 93993, 120284, 129106, 147640, 156146, 174680, 183186, 298320, 355419, 694280, 925993,
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 75
 * <br/>
 * Keith Number
 * </h2>
 *
 * @see _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_26.images <h2>Image</h2>
 */
public class Question26 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 75;
        System.out.println("Input a number: " + NUMBER);
        System.out.printf("%sKeith Number", isKeithNumber(NUMBER) ? "" : "Not ");
    }

    private static boolean isKeithNumber(final int TARGET_NUMBER) {
        final int LENGTH = String.valueOf(TARGET_NUMBER).length();
        int[] numbers = new int[LENGTH];
        addDigits(TARGET_NUMBER, LENGTH, numbers);
        int sum = 0;
        while (sum <= TARGET_NUMBER) {
            sum = 0;
            for (final int NUMBER : numbers)
                sum += NUMBER;
            if (TARGET_NUMBER == sum)
                return true;
            else {
                System.arraycopy(numbers, 1, numbers, 0, numbers.length - 1);
                numbers[LENGTH - 1] = sum;
            }
        }
        return false;
    }

    private static void addDigits(int number, final int LENGTH, final int[] NUMBERS) {
        for (int index = LENGTH - 1; index > -1; index--) {
            NUMBERS[index] = number % 10;
            number /= 10;
        }
    }
}