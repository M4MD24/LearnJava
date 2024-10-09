package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_27;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to create the first twenty Hamming numbers.
 * <br/>
 * In computer science, regular numbers are often called Hamming numbers, Hamming Numbers are numbers whose only prime factors are 2, 3 and 5.
 * <br/>
 * The first few hamming numbers are :
 * <br/>
 * 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18, 20, 24, 25, 27, 30, 32
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * First Twenty Hamming numbers: 1 2 3 4 5 6 8 9 10 12 15 16 18 20 24 25 27 30 32 36
 * </h2>
 */
public class Question27 {
    public static void main(final String[] PARAMETERS) {
        printFirstTwentyHammingNumbers();
    }

    private static void printFirstTwentyHammingNumbers() {
        for (int number = 1, count = 0; count < 20; number++)
            if (isHammingNumber(number)) {
                System.out.print(number + " ");
                count++;
            }
    }

    private static boolean isHammingNumber(int number) {
        while (number % 2 == 0)
            number /= 2;
        while (number % 3 == 0)
            number /= 3;
        while (number % 5 == 0)
            number /= 5;
        return number == 1;
    }
}