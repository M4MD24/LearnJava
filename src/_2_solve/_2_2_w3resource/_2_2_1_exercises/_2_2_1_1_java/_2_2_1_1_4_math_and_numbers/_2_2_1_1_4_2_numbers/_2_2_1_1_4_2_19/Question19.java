package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_4_math_and_numbers._2_2_1_1_4_2_numbers._2_2_1_1_4_2_19;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to check if a number is cyclic or not.
 * <br/>
 * A cyclic number is an integer in which cyclic permutations of the digits are successive multiples of the number. The most widely known are 142857:
 * <br/>
 * 142857 × 1 = 142857
 * <br/>
 * 142857 × 2 = 285714
 * <br/>
 * 142857 × 3 = 428571
 * <br/>
 * 142857 × 4 = 571428
 * <br/>
 * 142857 × 5 = 714285
 * <br/>
 * 142857 × 6 = 857142
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 142857
 * <br/>
 * Is a cyclic number.
 * </h2>
 */
public class Question19 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 142857;
        System.out.println("Input a number: " + NUMBER);
        System.out.printf("Is%s a cyclic number", isCyclicNumber(NUMBER) ? "" : "n't");
    }

    private static boolean isCyclicNumber(final int NUMBER) {
        for (int index = 1; index <= String.valueOf(NUMBER).length(); index++)
            if (!String.valueOf(index * NUMBER).matches(String.format("[%d]+", NUMBER)))
                return false;
        return true;
    }
}