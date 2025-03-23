package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_49_calculate_active_donation_minutes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CalculateActiveDonationMinutes {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(calculateActiveDonatinoMinutes(new String[]{"60-120"}));
        System.out.println(calculateActiveDonatinoMinutes(new String[]{"60-120", "110-180"}));
        System.out.println(calculateActiveDonatinoMinutes(new String[]{"60-120", "130-150"}));
        System.out.print(calculateActiveDonatinoMinutes(new String[]{"0-30", "25-50", "45-60"}));
    }

    private static int calculateActiveDonatinoMinutes(final String[] TIME_INTERVALS) {
        return Arrays.stream(TIME_INTERVALS)
                .map(interval -> interval.split("-"))
                .map(parts -> new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1])})
                .sorted(Comparator.comparingInt(firstPart -> firstPart[0]))
                .reduce(
                        new ArrayList<int[]>(),
                        (
                                mergedIntervals,
                                currentInterval
                        ) -> {
                            if (
                                    !mergedIntervals.isEmpty() &&
                                            mergedIntervals.get(mergedIntervals.size() - 1)[1] >= currentInterval[0]
                            )
                                mergedIntervals.get(mergedIntervals.size() - 1)[1] = Math.max(mergedIntervals.get(mergedIntervals.size() - 1)[1], currentInterval[1]);
                            else
                                mergedIntervals.add(currentInterval);
                            return mergedIntervals;
                        }, (
                                firstMergedList,
                                secondMergedList
                        ) -> firstMergedList
                )
                .stream()
                .mapToInt(interval -> interval[1] - interval[0])
                .sum();
    }
}