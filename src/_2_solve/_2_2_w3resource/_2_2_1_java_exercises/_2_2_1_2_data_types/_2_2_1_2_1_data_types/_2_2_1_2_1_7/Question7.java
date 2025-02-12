package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_2_data_types._2_2_1_2_1_data_types._2_2_1_2_1_7;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input distance in meters: 2500.0
 * <br/>
 * Input hour: 5
 * <br/>
 * Input minutes: 56
 * <br/>
 * Input seconds: 23
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Your speed in meters/second is 0.11691531
 * <br/>
 * Your speed in km/h is 0.42089513
 * <br/>
 * Your speed in miles/h is 0.26158804
 * </h2>
 */

public class Question7 {
    public static void main(final String[] ARGUMENTS) {
        final float DISTANCE_IN_METERS = 2500;
        final int HOURS = 5,
                MINUTES = 56,
                SECONDS = 23;
        printInputs(DISTANCE_IN_METERS, HOURS, MINUTES, SECONDS);
        printSpeeds(DISTANCE_IN_METERS, HOURS, MINUTES, SECONDS);
    }

    private static void printSpeeds(final float DISTANCE_IN_METERS, final int HOURS, final int MINUTES, final int SECONDS) {
        final float TOTAL_TIME_IN_SECONDS = HOURS * 3600 + MINUTES * 60 + SECONDS,
                SPEED_METERS_PER_SECOND = DISTANCE_IN_METERS / TOTAL_TIME_IN_SECONDS,
                SPEED_KILOMETER_PER_HOUR = (DISTANCE_IN_METERS / 1000) / (TOTAL_TIME_IN_SECONDS / 3600),
                SPEED_MILES_PER_HOUR = (DISTANCE_IN_METERS / 1609) / (TOTAL_TIME_IN_SECONDS / 3600);
        System.out.printf("""
                        Your speed in meters/second is %f
                        Your speed in km/h is  %f
                        Your speed in miles/h is  %f""",
                SPEED_METERS_PER_SECOND,
                SPEED_KILOMETER_PER_HOUR,
                SPEED_MILES_PER_HOUR);
    }

    private static void printInputs(final float DISTANCE_IN_METERS, final int HOURS, final int MINUTES, final int SECONDS) {
        System.out.printf("""
                        Input distance in meters: %f
                        Input hours: %d
                        Input minutes: %d
                        Input seconds: %d
                        \n""",
                DISTANCE_IN_METERS,
                HOURS,
                MINUTES,
                SECONDS);
    }
}