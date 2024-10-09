package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_29;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the angle between the hour and minute hands.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input angles move by hour hand: 5
 * <br/>
 * Input angles move by minute hand: 15
 * <br/>
 * Angle between hour and minute hands 60 degree.
 * </h2>
 */

public class Question29 {
    public static void main(final String[] PARAMETERS) {
        final int HOUR_HAND = 5,
                MINUTE_HAND = 15;
        System.out.printf("""
                Input angles move by hour hand: %d
                Input angles move by minute hand: %d
                Angle Between hour and minute hands %d degree.""",
                HOUR_HAND,
                MINUTE_HAND,
                getAngleBetweenHourAndMinuteHands(HOUR_HAND, MINUTE_HAND));
    }

    private static int getAngleBetweenHourAndMinuteHands(final int HOUR_HAND, final int MINUTE_HAND) {
        final int ANGLE_HOUR = (360 / 12) * HOUR_HAND,
                ANGLE_MINUTE = (360 / 60) * MINUTE_HAND;
        return (Math.abs(ANGLE_HOUR - ANGLE_MINUTE) > 180)
                ? 360 - Math.abs(ANGLE_HOUR - ANGLE_MINUTE)
                : Math.abs(ANGLE_HOUR - ANGLE_MINUTE);
    }
}