package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_48_calculate_empowerment_index;

public class CalculateEmpowermentIndex {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(
                calculateEmpowermentIndex(
                        new double[]{8, 7, 9},
                        new double[]{1, 1, 1}
                )
        );
        System.out.println(
                calculateEmpowermentIndex(
                        new double[]{10, 10, 10},
                        new double[]{1, 1, 1}
                )
        );
        System.out.println(
                calculateEmpowermentIndex(
                        new double[]{5, 6, 7},
                        new double[]{2, 3, 5}
                )
        );
        System.out.print(
                calculateEmpowermentIndex(
                        new double[]{0, 10},
                        new double[]{1, 1}
                )
        );
    }

    private static double calculateEmpowermentIndex(
            final double[] ACHIEVEMENTS,
            final double[] WEIGHTS
    ) {
        final int length = ACHIEVEMENTS.length;
        double weightsSum = 0;
        double weightedSum = 0;
        for (int index = 0; index < length; index++) {
            final double CURRENT_WEIGHT = WEIGHTS[index];
            final double CURRENT_ACHIEVEMENT = ACHIEVEMENTS[index];
            weightsSum += CURRENT_WEIGHT;
            weightedSum += CURRENT_ACHIEVEMENT * CURRENT_WEIGHT;
        }
        return weightedSum / weightsSum;
    }
}