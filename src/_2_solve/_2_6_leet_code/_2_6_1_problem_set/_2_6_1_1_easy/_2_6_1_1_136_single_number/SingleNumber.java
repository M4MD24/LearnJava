package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_136_single_number;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <br/>
 * <br/>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * </h2>
 */

public class SingleNumber {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {2, 2, 1};
        System.out.print(singleNumber(NUMBERS));
    }

    private static int singleNumber(final int[] NUMBERS) {
        int singleNumber = 0;
        for (final int NUMBER : NUMBERS)
            singleNumber ^= NUMBER;
        return singleNumber;
    }

// >
    /*private static int singleNumber(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS)
                .reduce(
                        0,
                        (firstNumber, secondNumber) -> firstNumber ^ secondNumber
                );
    }*/
}