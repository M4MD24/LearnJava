package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_1550_three_consecutive_odds;

/**
 * <h1>Problem:</h1>
 * <h2>Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.</h2>
 */

public class ThreeConsecutiveOdds {
    public static void main(final String[] PARAMETERS) {
        System.out.print(threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));
    }

    private static boolean threeConsecutiveOdds(final int[] NUMBERS) {
        System.gc();
        if (NUMBERS.length == 1)
            return false;
        else if (NUMBERS.length == 2)
            return false;
        else {
            for (short thirdNumberIndex = 2; thirdNumberIndex < NUMBERS.length; thirdNumberIndex++) {
                if (
                        isOdd(NUMBERS[thirdNumberIndex - 2]) &&
                                isOdd(NUMBERS[thirdNumberIndex - 1]) &&
                                isOdd(NUMBERS[thirdNumberIndex])
                )
                    return true;
            }
            return false;
        }
    }

    private static boolean isOdd(final int NUMBER) {
        return NUMBER % 2 != 0;
    }
}