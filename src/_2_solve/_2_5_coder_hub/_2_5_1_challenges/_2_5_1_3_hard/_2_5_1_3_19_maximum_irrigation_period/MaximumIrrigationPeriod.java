package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_19_maximum_irrigation_period;

public class MaximumIrrigationPeriod {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(maximumIrrigationPeriod(new int[] {1, 2, 3, 4, 5}, 5));
        System.out.println(maximumIrrigationPeriod(new int[] {2, 2, 2}, 3));
        System.out.println(maximumIrrigationPeriod(new int[] {1, 1, 1, 1}, 3));
        System.out.print(maximumIrrigationPeriod(new int[] {}, 5));
    }

    private static int maximumIrrigationPeriod(final int[] IRRIGATION, int water) {
        if (
                IRRIGATION.length == 0 ||
                water == 0
        )
            return 0;
        int count = 0;
        for (final int CURRENT_IRRIGATION : IRRIGATION) {
            if (water - CURRENT_IRRIGATION < 0)
                return count;
            water -= CURRENT_IRRIGATION;
            count++;
        }
        return count;
    }
}