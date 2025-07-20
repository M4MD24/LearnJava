package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_18_cellect_stars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectStars {
    public static void main(final String[] ARGUMENTS) {
        final int[] BRIGHTNESS_VALUES = {5, 3, 8, 6, 2};
        final int   MAXIMUM_CAPACITY  = 14;

        System.out.print(
                Arrays.toString(
                        collectStars(
                                BRIGHTNESS_VALUES,
                                MAXIMUM_CAPACITY
                        )
                )
        );
    }

    public static int[] collectStars(
            final int[] BRIGHTNESS_VALUES,
            final int MAXIMUM_CAPACITY
    ) {
        final boolean[] IS_REACHABLE      = new boolean[MAXIMUM_CAPACITY + 1];
        final int[]     PREVIOUS_SUM_STEP = new int[MAXIMUM_CAPACITY + 1];

        IS_REACHABLE[0] = true;
        Arrays.fill(
                PREVIOUS_SUM_STEP,
                -1
        );

        for (final int BRIGHTNESS : BRIGHTNESS_VALUES)
            for (
                    int currentCapacity = MAXIMUM_CAPACITY - BRIGHTNESS;
                    currentCapacity >= 0;
                    currentCapacity--
            )
                if (
                        IS_REACHABLE[currentCapacity] &&
                        !IS_REACHABLE[currentCapacity + BRIGHTNESS]
                ) {
                    IS_REACHABLE[currentCapacity + BRIGHTNESS] = true;
                    PREVIOUS_SUM_STEP[currentCapacity + BRIGHTNESS] = currentCapacity;
                }

        int bestSum = MAXIMUM_CAPACITY;
        while (!IS_REACHABLE[bestSum])
            bestSum--;

        final List<Integer> COLLECT_EDBRIGHTNESS_VALUES = new ArrayList<>();
        while (bestSum > 0) {
            COLLECT_EDBRIGHTNESS_VALUES.add(bestSum - PREVIOUS_SUM_STEP[bestSum]);
            bestSum = PREVIOUS_SUM_STEP[bestSum];
        }

        return COLLECT_EDBRIGHTNESS_VALUES.stream()
                                          .mapToInt(Integer::intValue)
                                          .toArray();
    }
}