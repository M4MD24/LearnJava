package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_72_edit_distance;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
 * <br/>
 * <br/>
 * You have the following three operations permitted on a word:
 * </h2>
 * <ul>
 *     <li>Insert a character</li>
 *     <li>Delete a character</li>
 *     <li>Replace a character</li>
 * </ul>
 */

public class EditDistance {
    public static void main(final String[] PARAMETERS) {
        System.out.print(minDistance(
                "horse",
                "ros"
        ));
    }

    private static int minDistance(final String FIRST_TEXT, final String SECOND_TEXT) {
        final int FIRST_TEXT_LENGTH = FIRST_TEXT.length(),
                SECOND_SECOND_LENGTH = SECOND_TEXT.length();
        final int[][] DISTANCE_TABLE = new int[FIRST_TEXT_LENGTH + 1][SECOND_SECOND_LENGTH + 1];
        for (int firstIndex = 0; firstIndex <= FIRST_TEXT_LENGTH; firstIndex++)
            for (int secondIndex = 0; secondIndex <= SECOND_SECOND_LENGTH; secondIndex++)
                if (firstIndex == 0)
                    DISTANCE_TABLE[firstIndex][secondIndex] = secondIndex;
                else if (secondIndex == 0)
                    DISTANCE_TABLE[firstIndex][secondIndex] = firstIndex;
                else if (FIRST_TEXT.charAt(firstIndex - 1) == SECOND_TEXT.charAt(secondIndex - 1))
                    DISTANCE_TABLE[firstIndex][secondIndex] = DISTANCE_TABLE[firstIndex - 1][secondIndex - 1];
                else
                    DISTANCE_TABLE[firstIndex][secondIndex] = 1 + Math.min(
                            DISTANCE_TABLE[firstIndex - 1][secondIndex],
                            Math.min(
                                    DISTANCE_TABLE[firstIndex][secondIndex - 1],
                                    DISTANCE_TABLE[firstIndex - 1][secondIndex - 1]
                            )
                    );
        return DISTANCE_TABLE[FIRST_TEXT_LENGTH][SECOND_SECOND_LENGTH];
    }
}