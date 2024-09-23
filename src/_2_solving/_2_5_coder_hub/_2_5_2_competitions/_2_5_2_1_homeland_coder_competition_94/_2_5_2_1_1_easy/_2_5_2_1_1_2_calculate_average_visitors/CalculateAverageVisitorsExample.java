package _2_solving._2_5_coder_hub._2_5_2_competitions._2_5_2_1_homeland_coder_competition_94._2_5_2_1_1_easy._2_5_2_1_1_2_calculate_average_visitors;

public class CalculateAverageVisitorsExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(calculateAverageVisitors(new int[]{150, 200, 250, 300, 180, 220, 190}));
        System.out.println(calculateAverageVisitors(new int[]{100, 120, 130, 140, 150, 160, 170}));
        System.out.println(calculateAverageVisitors(new int[]{300, 320, 310, 305, 315, 325, 330}));
        System.out.print(calculateAverageVisitors(new int[]{50, 75, 100, 125, 150, 175, 200}));
    }

    private static double calculateAverageVisitors(final int[] VISITORS) {
        int totalVisitors = 0;
        for (int visitor : VISITORS)
            totalVisitors += visitor;
        return Math.round((totalVisitors / 7.0) * 100.0) / 100.0;
    }
}