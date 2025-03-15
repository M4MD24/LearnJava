package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_75_calculate_fasting_hours;

public class CalculateFastingHours {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(
                calculateTotalFastingTime(
                        new String[]{"04:30"},
                        new String[]{"18:30"}
                )
        );
        System.out.println(
                calculateTotalFastingTime(
                        new String[]{"05:00"},
                        new String[]{"18:00"}
                )
        );
        System.out.println(
                calculateTotalFastingTime(
                        new String[]{"04:45"},
                        new String[]{"18:15"}
                )
        );
        System.out.print(
                calculateTotalFastingTime(
                        new String[]{"04:30", "05:00"},
                        new String[]{"18:30", "18:00"}
                )
        );
    }

    public static double calculateTotalFastingTime(
            final String[] SUHOOR_TIMES,
            final String[] IFTAR_TIMES) {
        double totalFastingHours = 0;
        for (int index = 0; index < SUHOOR_TIMES.length; index++) {
            final String[] SUHOOR = SUHOOR_TIMES[index].split(":"),
                    IFTAR = IFTAR_TIMES[index].split(":");
            totalFastingHours += (Integer.parseInt(IFTAR[0]) + Integer.parseInt(IFTAR[1]) / 60.0) -
                    (Integer.parseInt(SUHOOR[0]) + Integer.parseInt(SUHOOR[1]) / 60.0);
        }
        return totalFastingHours;
    }
}