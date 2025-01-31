package _2_solve._2_1_w3schools._2_1_1_how_to._2_1_1_3_positive_or_negative;

public class PositiveOrNegative {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(positiveOrNegative(5));
    }

    private static String positiveOrNegative(final int NUMBER) {
        if (NUMBER == 0)
            return "Zero";
        else if (NUMBER > 0)
            return "Positive";
        else
            return "Negative";
    }
}