package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_50_calculate_winning_child;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculateWinningChild {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(
                calculateWinningChild(
                        new String[]{"سامي", "ليلى", "أحمد"},
                        new String[]{"10,15,20", "20,15,10", "15,15,15"}
                )
        );
        System.out.println(
                calculateWinningChild(
                        new String[]{"سامي", "ليلى", "أحمد"},
                        new String[]{"10,15,20", "20,15,11", "15,15,15"}
                )
        );
        System.out.println(
                calculateWinningChild(
                        new String[]{"علي", "منى"},
                        new String[]{"30,10", "20,15"}
                )
        );
        System.out.print(
                calculateWinningChild(
                        new String[]{"فاطمة"},
                        new String[]{"50,50"}
                )
        );
    }

    private static String calculateWinningChild(
            final String[] NAMES,
            final String[] SCORES
    ) {
        int maximumScore = 0;
        final List<String> WINNERS = new ArrayList<>();

        for (int index = 0; index < NAMES.length; index++) {
            final String CURRENT_NAME = NAMES[index];
            final int[] CURRENT_SCORES_NUMBERS = Arrays.stream(SCORES[index].split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            final int CURRENT_SUM = Arrays.stream(CURRENT_SCORES_NUMBERS).sum();
            if (CURRENT_SUM > maximumScore) {
                maximumScore = CURRENT_SUM;
                WINNERS.clear();
                WINNERS.add(CURRENT_NAME);
            } else if (CURRENT_SUM == maximumScore)
                WINNERS.add(CURRENT_NAME);
        }

        return "فائز العيد: " + String.join(", ", WINNERS) + " بمجموع " + maximumScore;
    }
}