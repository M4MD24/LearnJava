package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_77_distribute_gifts;

import java.util.Arrays;

public class DistributeGifts {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(
                Arrays.toString(
                        distributeGifts(
                                new int[]{4},
                                new int[]{20}
                        )
                )
        );
        System.out.println(
                Arrays.toString(
                        distributeGifts(
                                new int[]{5},
                                new int[]{25}
                        )
                )
        );
        System.out.println(
                Arrays.toString(
                        distributeGifts(
                                new int[]{4, 5},
                                new int[]{20, 25}
                        )
                )
        );
        System.out.print(
                Arrays.toString(
                        distributeGifts(
                                new int[]{2, 3},
                                new int[]{8, 9}
                        )
                )
        );
    }

    private static int[] distributeGifts(
            final int[] FAMILY_SIZES,
            final int[] TOTAL_GIFTS
    ) {
        final int COUNT_OF_FAMILIES = FAMILY_SIZES.length;
        final int[] DISTRIBUTED_GIFTS_FOR_FAMILIES = new int[COUNT_OF_FAMILIES];
        for (int index = 0; index < COUNT_OF_FAMILIES; index++)
            DISTRIBUTED_GIFTS_FOR_FAMILIES[index] = TOTAL_GIFTS[index] / FAMILY_SIZES[index];
        return DISTRIBUTED_GIFTS_FOR_FAMILIES;
    }
}