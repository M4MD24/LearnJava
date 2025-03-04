package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_46_calculate_total_price;

import java.util.Arrays;

public class CalculateTotalPrice {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(
                calculateTotalPrice(
                        new double[]{100.0, 200.0, 50.0},
                        0.1
                )
        );
        System.out.println(
                calculateTotalPrice(
                        new double[]{10.0, 20.0, 30.0},
                        0.2
                )
        );
        System.out.println(
                calculateTotalPrice(
                        new double[]{500.0, 1500.0},
                        0.15
                )
        );
        System.out.print(
                calculateTotalPrice(
                        new double[]{50.0, 75.0, 100.0},
                        0.08
                )
        );
    }

    private static double calculateTotalPrice(
            final double[] PRICES,
            final double TAX_RATE
    ) {
        return Arrays.stream(PRICES).sum() * (1 + TAX_RATE);
    }
}