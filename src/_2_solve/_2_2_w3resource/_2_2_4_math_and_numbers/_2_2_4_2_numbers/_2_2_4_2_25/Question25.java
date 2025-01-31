package _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_25;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to print the first 15 numbers of the Pell series.
 * <br/>
 * In mathematics, the Pell numbers are an infinite sequence of integers. The sequence of Pell numbers starts with 0 and 1, and then each Pell number is the sum of twice the previous Pell number and the Pell number before that.:
 * <br/>
 * thus, 70 is the companion to 29, and 70 = 2 × 29 + 12 = 58 + 12.
 * <br/>
 * The first few terms of the sequence are:
 * <br/>
 * 0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,…
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * First 20 Pell Numbers:
 * <br/>
 * 1 2 5 12 29 70 169 408 985 2378 5741 13860 33461 80782 195025 470832 1136689 2744210 6625109 15994428
 * </h2>
 */
public class Question25 {
    public static void main(final String[] ARGUMENTS) {
        printFirst20PellNumbers();
    }

    private static void printFirst20PellNumbers() {
        System.out.println("First 20 Pell Numbers:");
        int firstNumber = 0,
                secondNumber = 1;
        System.out.print(secondNumber + " ");
        for (int round = 1; round < 20; round++) {
            final int PELL_NUMBER = 2 * secondNumber + firstNumber;
            System.out.print(PELL_NUMBER + " ");
            firstNumber = secondNumber;
            secondNumber = PELL_NUMBER;
        }
    }
}