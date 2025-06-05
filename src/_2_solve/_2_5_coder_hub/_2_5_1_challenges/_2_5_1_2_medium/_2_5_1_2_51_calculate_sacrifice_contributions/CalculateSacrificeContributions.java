package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_51_calculate_sacrifice_contributions;

import java.util.Arrays;

public class CalculateSacrificeContributions {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(
                Arrays.toString(
                        calculateSacrificeContributions(
                                new String[] {"عمر", "منى", "علي"},
                                new double[] {0.4, 0.4, 0.2},
                                500
                        )
                )
        );
    }

    private static double[] calculateSacrificeContributions(
            String[] names,
            double[] shares,
            double totalCost
    ) {
        return Arrays.stream(shares)
                     .map(share -> share * totalCost)
                     .toArray();
    }
}