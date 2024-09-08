package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_v_is_It_rated;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>V. Is it rated</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * Here it is. The Ultimate Question of Competitive Programming, Codeforces, and Everything. And you are here to answer it.
 * <br/>
 * Another Codeforces round has been conducted. No two participants have the same number of points. For each participant, from the top to the bottom of the standings, their rating before and after the round is known.
 * <br/>
 * It's known that if at least one participant's rating has changed, then the round was rated for sure.
 * <br/>
 * It's also known that if the round was rated and a participant with lower rating took a better place in the standings than a participant with higher rating, then at least one round participant's rating has changed.
 * <br/>
 * In this problem, you should not make any other assumptions about the rating system.
 * <br/>
 * Determine if the current round is rated, unrated, or it's impossible to determine whether it is rated of not.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 6
 * <br/>
 * 3060 3060
 * <br/>
 * 2194 2194
 * <br/>
 * 2876 2903
 * <br/>
 * 2624 2624
 * <br/>
 * 3007 2991
 * <br/>
 * 2884 2884
 * </h2>
 * <h1>Output:</h1>
 * <h2>rated</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 1500 1500
 * <br/>
 * 1300 1300
 * <br/>
 * 1200 1200
 * <br/>
 * 1400 1400
 * </h2>
 * <h1>Output:</h1>
 * <h2>unrated</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 3123 3123
 * <br/>
 * 2777 2777
 * <br/>
 * 2246 2246
 * <br/>
 * 2246 2246
 * <br/>
 * 1699 1699
 * </h2>
 * <h1>Output:</h1>
 * <h2>maybe</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first example, the ratings of the participants in the third and fifth places have changed, therefore, the round was rated.
 * <br/>
 * In the second example, no one's rating has changed, but the participant in the second place has lower rating than the participant in the fourth place. Therefore, if the round was rated, someone's rating would've changed for sure.
 * <br/>
 * In the third example, no one's rating has changed, and the participants took places in non-increasing order of their rating. Therefore, it's impossible to determine whether the round is rated or not.
 * </h2>
 */

public class IsItRatedExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static short countOfRounds = INPUT.nextShort();
    private static boolean areEquals = true;
    private static final short[] PARTICIPANT_VALUES = new short[countOfRounds];

    public static void main(final String[] PARAMETERS) {
        inputValues();
        System.out.print(isRated());
    }

    private static boolean isSorted() {
        final short[] PARTICIPANT_VALUES_AFTER_SORTED = Arrays.copyOf(PARTICIPANT_VALUES, PARTICIPANT_VALUES.length);
        Arrays.sort(PARTICIPANT_VALUES_AFTER_SORTED);
        return Arrays.equals(PARTICIPANT_VALUES, PARTICIPANT_VALUES_AFTER_SORTED);
    }

    private static String isRated() {
        if (!areEquals) return "rated";
        if (!isSorted()) return "unrated";
        else return "maybe";
    }

    private static void inputValues() {
        while (countOfRounds-- > 0) {
            final short FIRST_PARTICIPANT_VALUE = INPUT.nextShort(),
                    SECOND_PARTICIPANT_VALUE = INPUT.nextShort();
            if (areEquals(FIRST_PARTICIPANT_VALUE, SECOND_PARTICIPANT_VALUE)) break;
            PARTICIPANT_VALUES[countOfRounds] = FIRST_PARTICIPANT_VALUE;
            PARTICIPANT_VALUES[countOfRounds] = SECOND_PARTICIPANT_VALUE;
        }
    }

    private static boolean areEquals(final short FIRST_PARTICIPANT_VALUE, final short SECOND_PARTICIPANT_VALUE) {
        if (FIRST_PARTICIPANT_VALUE != SECOND_PARTICIPANT_VALUE) {
            areEquals = false;
            return true;
        }
        return false;
    }
}