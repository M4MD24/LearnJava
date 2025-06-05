package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_78_calculate_sacrifice_profit;

public class CalculateSacrificeProfit {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(
                calculateSacrificeProfit(
                        new double[] {100},
                        new double[] {150}
                )
        );
        System.out.println(
                calculateSacrificeProfit(
                        new double[] {100, 200},
                        new double[] {150, 250}
                )
        );
        System.out.println(
                calculateSacrificeProfit(
                        new double[] {120, 80, 100},
                        new double[] {130, 90, 110}
                )
        );
        System.out.print(
                calculateSacrificeProfit(
                        new double[] {200, 200, 200},
                        new double[] {200, 200, 200}
                )
        );
    }

    private static double calculateSacrificeProfit(
            double[] buyPrices,
            double[] sellPrices
    ) {
        return java.util.stream.IntStream.range(0, buyPrices.length)
                                         .mapToDouble(index -> sellPrices[index] - buyPrices[index])
                                         .sum();
    }
}