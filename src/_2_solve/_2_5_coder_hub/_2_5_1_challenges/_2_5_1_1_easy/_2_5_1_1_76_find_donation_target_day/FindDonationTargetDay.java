package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_76_find_donation_target_day;

public class FindDonationTargetDay {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(
                calculateFastingHours(
                        new double[]{50.0, 25.0, 30.0, 20.0},
                        3.0
                )
        );
        System.out.println(
                calculateFastingHours(
                        new double[]{10.0, 15.0, 20.0},
                        -1.
                )
        );
        System.out.println(
                calculateFastingHours(
                        new double[]{20.0, 20.0, 20.0, 20.0, 20.0},
                        5.0
                )
        );
        System.out.print(
                calculateFastingHours(
                        new double[]{100.0},
                        1.0
                )
        );
    }

    private static int calculateFastingHours(
            final double[] DONATIONS,
            final double TOTAL_DONATIONS_LIMIT
    ) {
        double currentTotalDonations = 0.0;
        for (int index = 0, fastingHours = 1; index < DONATIONS.length; index++, fastingHours++) {
            final double CURRENT_DONATIONS = DONATIONS[index];
            currentTotalDonations += CURRENT_DONATIONS;
            if (currentTotalDonations >= TOTAL_DONATIONS_LIMIT)
                return fastingHours;
        }
        return -1;
    }
}