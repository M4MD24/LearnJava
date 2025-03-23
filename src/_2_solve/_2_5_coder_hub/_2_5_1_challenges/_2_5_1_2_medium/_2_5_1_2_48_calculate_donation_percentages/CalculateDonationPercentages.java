package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_48_calculate_donation_percentages;

import java.util.Arrays;

public class CalculateDonationPercentages {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(
                Arrays.toString(calculateDonationPercentages(
                        new String[]{"فاطمة", "علي"},
                        new double[]{100.0, 100.0}
                ))
        );
        System.out.println(
                Arrays.toString(calculateDonationPercentages(
                        new String[]{"فاطمة", "علي", "خالد"},
                        new double[]{50.0, 25.0, 25.0}
                ))
        );
        System.out.println(
                Arrays.toString(calculateDonationPercentages(
                        new String[]{"سامي", "محمود", "يوسف"},
                        new double[]{30.0, 30.0, 40.0}
                ))
        );
        System.out.print(
                Arrays.toString(calculateDonationPercentages(
                        new String[]{"زيد"},
                        new double[]{1000.0}
                ))
        );
    }

    private static String[] calculateDonationPercentages(
            final String[] NAMES,
            final double[] DONATIONS
    ) {
        final double TOTAL = Arrays.stream(DONATIONS).sum();
        final int COUNT_OF_NAMES = NAMES.length;
        final String[] DONATION_PERCENTAGES = new String[COUNT_OF_NAMES];
        for (int index = 0; index < COUNT_OF_NAMES; index++) {
            final int DONATION_PERCENTAGE = (int) (DONATIONS[index] / TOTAL * 100);
            final String TEXT_FORMAT = NAMES[index] + ": " + DONATION_PERCENTAGE + "%";
            DONATION_PERCENTAGES[index] = TEXT_FORMAT;
        }
        return DONATION_PERCENTAGES;
    }
}