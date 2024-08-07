package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.</h2>
 */

public class Question12 {
    public static void main(final String[] ARGS) {
        final Airplane AIRPLANE = new Airplane(
                "M3-999",
                "Palestine",
                2024,
                (byte) 6,
                (byte) 9,
                (byte) 11,
                (byte) 44
        );
        System.out.printf("Flight Number: %s%nDestination: %s%nDeparture Time: %s%nCheck flight status: %s%nRemaining time of flight: %s",
                AIRPLANE.getFlightNumber(),
                AIRPLANE.getDestination(),
                AIRPLANE.getDepartureTime(),
                AIRPLANE.checkFlightStatus(),
                AIRPLANE.getRemainingTimeOnFlight());
    }
}

class Airplane {
    private final String FLIGHT_NUMBER,
            DESTINATION;
    private final Calendar DEPARTURE_TIME = Calendar.getInstance();

    Airplane(final String FLIGHT_NUMBER, final String DESTINATION, final int YEAR, final byte MONTH, final byte DAY, final byte HOUR, final byte MINUTE) {
        this.FLIGHT_NUMBER = FLIGHT_NUMBER;
        this.DESTINATION = DESTINATION;
        DEPARTURE_TIME.set(YEAR, MONTH - 1, DAY, HOUR, MINUTE);
    }

    String getFlightNumber() {
        return FLIGHT_NUMBER;
    }

    String getDestination() {
        return DESTINATION;
    }

    String getDepartureTime() {
        return new SimpleDateFormat("yyyy/MMMM/dd hh:mm a", Locale.US).format(DEPARTURE_TIME.getTime());
    }

    String checkFlightStatus() {
        final Calendar CURRENT_TIME = Calendar.getInstance();
        if (CURRENT_TIME.before(DEPARTURE_TIME))
            return "Flight has not departed yet.";
        else
            return "Flight has departed.";
    }

    String getRemainingTimeOnFlight() {
        final Calendar CURRENT_TIME = Calendar.getInstance();
        final long REMAINING_TIME_IN_MILLIS = DEPARTURE_TIME.getTimeInMillis() - CURRENT_TIME.getTimeInMillis(),
                HOURS = REMAINING_TIME_IN_MILLIS / (60 * 60 * 1000),
                MINUTES = (REMAINING_TIME_IN_MILLIS % (60 * 60 * 1000)) / (60 * 1000);
        return String.format("%d Hours, %d Minutes",
                HOURS,
                MINUTES);
    }
}