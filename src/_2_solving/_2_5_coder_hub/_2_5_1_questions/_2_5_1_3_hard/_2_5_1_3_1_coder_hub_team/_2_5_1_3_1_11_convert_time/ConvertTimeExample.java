package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_3_hard._2_5_1_3_1_coder_hub_team._2_5_1_3_1_11_convert_time;

import java.util.Scanner;

public class ConvertTimeExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getTimeAfterConvert(INPUT.nextLine()));
    }

    private static String getTimeAfterConvert(final String TIME) {
        final String[] TIME_AFTER_SPLIT = TIME.split("[ :]+");
        return switch (TIME_AFTER_SPLIT.length) {
            case 2 -> convertFrom24HToAMAndPM(TIME_AFTER_SPLIT);
            case 3 -> convertFromAMAndPMTo24H(TIME_AFTER_SPLIT);
            default -> throw new IllegalStateException("Unexpected value: " + TIME_AFTER_SPLIT.length);
        };
    }

    private static String convertFrom24HToAMAndPM(final String[] TIME_AFTER_SPLIT) {
        final int HOURS = Integer.parseInt(TIME_AFTER_SPLIT[0]),
                MINUTES = Integer.parseInt(TIME_AFTER_SPLIT[1]);
        final boolean IS_ZERO = MINUTES == 0;
        if (HOURS == 0)
            return "00:" + getTwoDigits(IS_ZERO, MINUTES) + " am";
        else if (HOURS < 12)
            return HOURS + ":" + getTwoDigits(IS_ZERO, MINUTES) + " am";
        else
            return HOURS - 12 + ":" + getTwoDigits(IS_ZERO, MINUTES) + " pm";
    }

    private static String getTwoDigits(final boolean IS_ZERO, final int MINUTES) {
        if (IS_ZERO)
            return MINUTES + "0";
        else if (MINUTES < 10)
            return "0" + MINUTES;
        return String.valueOf(MINUTES);
    }

    private static String convertFromAMAndPMTo24H(final String[] TIME_AFTER_SPLIT) {
        final int HOURS = Integer.parseInt(TIME_AFTER_SPLIT[0]),
                MINUTES = Integer.parseInt(TIME_AFTER_SPLIT[1]);
        final boolean IS_AM = TIME_AFTER_SPLIT[2].contains("am");
        return (IS_AM
                ? HOURS
                : (HOURS == 12) ? "00:" : HOURS + 12) + ":" + MINUTES;
    }
}