package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_17_distribute_sacrifice_shares;

import java.util.Arrays;

public class DistributeSacrificeShares {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(
                Arrays.toString(
                        distributeSacrificeShares(
                                new int[] {2, 3},
                                25
                        )
                )
        );
    }

    private static double[] distributeSacrificeShares(
            final int[] FAMILY_SIZES,
            final double TOTAL_WEIGHT
    ) {
        return Arrays.stream(FAMILY_SIZES)
                     .mapToDouble(familySize -> familySize * TOTAL_WEIGHT / Arrays.stream(FAMILY_SIZES).sum())
                     .toArray();
    }
}