package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_66;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program which reads an integer n and finds the number of combinations of a,b,c and d (0 ≤ a,b,c,d ≤ 9) where (a + b + c + d) equals n.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the number: 5
 * <br/>
 * Number of combinations of a, b, c and d: 56
 * </h2>
 */

public class Question66 {
    public static void main(final String[] ARGUMENTS) {
        final int TARGET_NUMBER = 5;
        System.out.printf("Input the number: %d", TARGET_NUMBER);
        System.out.printf("Number of combinations of four numbers: %d", getCountOfCombinationsOfFourNumbers(TARGET_NUMBER));
    }

    private static int getCountOfCombinationsOfFourNumbers(final int TARGET_NUMBER) {
        int countOfCombinationsOfFourNumbers = 0;
        for (int FIRST_NUMBER = 0; FIRST_NUMBER < 10; FIRST_NUMBER++)
            for (int SECOND_NUMBER = 0; SECOND_NUMBER < 10; SECOND_NUMBER++)
                for (int THIRD_NUMBER = 0; THIRD_NUMBER < 10; THIRD_NUMBER++)
                    for (int FOURTH_NUMBER = 0; FOURTH_NUMBER < 10; FOURTH_NUMBER++)
                        if (FIRST_NUMBER + SECOND_NUMBER + THIRD_NUMBER + FOURTH_NUMBER == TARGET_NUMBER)
                            countOfCombinationsOfFourNumbers++;
        return countOfCombinationsOfFourNumbers;
    }
}