package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_26_time_period;

public class TimePeriodExample {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getStringLengthComparison("2022-01-02T00:00:00", "2022-01-12T00:00:00"));
    }

    private static boolean getStringLengthComparison(final String FIRST_DATE, final String SECOND_DATE) {
        try {
            final java.time.LocalDateTime FIRST_LOCAL_DATE = java.time.LocalDateTime.parse(FIRST_DATE);
            final java.time.LocalDateTime SECOND_LOCAL_DATE = java.time.LocalDateTime.parse(SECOND_DATE);
            return FIRST_LOCAL_DATE.isBefore(SECOND_LOCAL_DATE) &&
                    FIRST_LOCAL_DATE.isBefore(java.time.LocalDateTime.now()) &&
                    SECOND_LOCAL_DATE.isBefore(java.time.LocalDateTime.now());
        } catch (final java.time.format.DateTimeParseException DATE_TIME_PARSE_EXCEPTION) {
            return false;
        }
    }
}