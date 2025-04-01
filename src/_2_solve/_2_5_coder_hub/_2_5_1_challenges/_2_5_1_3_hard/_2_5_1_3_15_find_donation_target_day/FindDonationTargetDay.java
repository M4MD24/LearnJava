package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_15_find_donation_target_day;

public class FindDonationTargetDay {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(
                calculateWinningChild(
                        new double[]{50.0, 25.0, 30.0, 20.0},
                        100.0
                )
        );
        System.out.println(
                calculateWinningChild(
                        new double[]{10.0, 15.0, 20.0},
                        50.0
                )
        );
        System.out.println(
                calculateWinningChild(
                        new double[]{20.0, 20.0, 20.0, 20.0, 20.0},
                        80.0
                )
        );
        System.out.print(
                calculateWinningChild(
                        new double[]{100.0},
                        10.0
                )
        );
    }

    private static int calculateWinningChild(
            final double[] DONATIONS,
            final double TOTAL_DONATIONS_LIMIT
    ) {
        double currentTotalDonations = 0.0;
        for (int index = 0; index < DONATIONS.length; index++) {
            final double CURRENT_DONATIONS = DONATIONS[index];
            currentTotalDonations += CURRENT_DONATIONS;
            if (currentTotalDonations >= TOTAL_DONATIONS_LIMIT)
                return index + 1;
        }
        return -1;
    }
}