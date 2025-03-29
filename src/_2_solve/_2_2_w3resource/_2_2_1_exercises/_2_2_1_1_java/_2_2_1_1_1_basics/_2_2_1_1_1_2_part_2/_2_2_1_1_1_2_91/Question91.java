package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_91;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the number of combinations that satisfy p + q + r + s = n where n is a given number <= 4000 and p, q, r, s range from 0 to 1000.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a positive integer: 52
 * <br/>
 * Number of combinations of a,b,c,d: 2731135
 * </h2>
 */

public class Question91 {
    public static void main(final String[] ARGUMENTS) {
        final int TARGET_SUM = 252;
        System.out.printf("Input a positive integer: %d", TARGET_SUM);
        System.out.printf("Number of combinations of a,b,c,d: %d", getCountOfCombinations(TARGET_SUM));
    }

    private static long getCountOfCombinations(final int TARGET_SUM) {
        long countOfCombinations = 0;
        for (int firstNumber = 0; firstNumber <= Math.min(TARGET_SUM, 1000); firstNumber++)
            for (int secondNumber = 0; secondNumber <= Math.min(TARGET_SUM - firstNumber, 1000); secondNumber++)
                for (int thirdNumber = 0; thirdNumber <= Math.min(TARGET_SUM - firstNumber - secondNumber, 1000); thirdNumber++) {
                    final int FOURTH_NUMBER = TARGET_SUM - (firstNumber + secondNumber + thirdNumber);
                    if (FOURTH_NUMBER >= 0 && FOURTH_NUMBER <= 1000)
                        countOfCombinations++;
                }
        return countOfCombinations;
    }
}