package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_14_distribute_donations;

import java.util.Arrays;

public class DistributeDonations {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(Arrays.toString(distributeDonations(
                1000.0,
                new double[]{1.0, 2.0, 3.0}
        )));
        System.out.println(Arrays.toString(distributeDonations(
                500.0,
                new double[]{1.0, 1.0, 1.0}
        )));
        System.out.println(Arrays.toString(distributeDonations(
                250.0,
                new double[]{2.0, 3.0}
        )));
        System.out.print(Arrays.toString(distributeDonations(
                1200.0,
                new double[]{1.0, 4.0}
        )));
    }

    private static double[] distributeDonations(
            final double TOTAL_DONATION,
            final double[] WEIGHTS
    ) {
        final double TOTAL_WEIGHT = Arrays
                .stream(WEIGHTS)
                .sum();
        final double[] ALLOCATED_AMOUNTS = new double[WEIGHTS.length];
        for (int index = 0; index < WEIGHTS.length; index++)
            ALLOCATED_AMOUNTS[index] = Double.parseDouble("%.2f".formatted(WEIGHTS[index] / TOTAL_WEIGHT * TOTAL_DONATION));
        final double ROUNDING_ADJUSTMENT_VALUE = TOTAL_DONATION - Arrays.stream(ALLOCATED_AMOUNTS).sum();
        ALLOCATED_AMOUNTS[ALLOCATED_AMOUNTS.length - 1] += ROUNDING_ADJUSTMENT_VALUE;
        return ALLOCATED_AMOUNTS;
    }
}