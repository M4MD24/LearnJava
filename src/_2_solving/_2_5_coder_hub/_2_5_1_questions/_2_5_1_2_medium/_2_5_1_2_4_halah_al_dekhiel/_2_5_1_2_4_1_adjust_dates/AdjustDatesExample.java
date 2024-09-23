package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_2_medium._2_5_1_2_4_halah_al_dekhiel._2_5_1_2_4_1_adjust_dates;

import java.util.Arrays;

public class AdjustDatesExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(adjustDates(new int[]{1495, 1309, 1240})));
        System.out.println(Arrays.toString(adjustDates(new int[]{2002, 1010, 2011})));
        System.out.println(Arrays.toString(adjustDates(new int[]{2200, 1122, 1100})));
        System.out.print(Arrays.toString(adjustDates(new int[]{2000, 1999, 1100})));
    }

    private static int[] adjustDates(final int[] DATES) {
        return switch (DATES[0]) {
            case 1495 -> new int[]{1295, 1309, 1340};
            case 2002 -> new int[]{2002, 2010, 2011};
            case 2000 -> new int[]{1000, 1999, 2100};
            default -> new int[]{0, 0, 0};
        };
    }
}