package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_9_object_oriented_programming._2_2_1_5_9_26;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Event" with attributes for event name, date, and location. Create subclasses "Seminar" that add specific attributes like number of speakers for seminars. Implement methods to display event details and check for conflicts in the event schedule.</h2>
 */

public class Question26 {
    public static void main(final String[] ARGUMENTS) {
        final Event EVENT_1 = new Seminar("Sohag University", "Egypt, Sohag", 2025, (byte) 6, (byte) 9, (byte) 8, (byte) 30, 5);
        EVENT_1.printInformation();

        System.out.println();

        final Event EVENT_2 = new Seminar("South Valley University", "Egypt, Qena", 2026, (byte) 6, (byte) 9, (byte) 8, (byte) 30, 5);
        EVENT_2.printInformation();

        System.out.print("\nIs Conflict: " + EVENT_1.isConflict(EVENT_2));
    }
}

class Event {
    private final String NAME;
    private final Calendar DATE = Calendar.getInstance();
    private final String LOCATION;

    Event(final String NAME, final String LOCATION, final int YEAR, final byte MONTH, final byte DAY, final byte HOUR, final byte MINUTE) {
        this.NAME = NAME;
        this.LOCATION = LOCATION;
        DATE.set(
                YEAR,
                MONTH,
                DAY,
                HOUR,
                MINUTE
        );
    }

    String getName() {
        return NAME;
    }

    String getDate() {
        return new SimpleDateFormat("yyyy/MMMM/dd hh:mm a", Locale.US).format(DATE.getTime());
    }

    String getLocation() {
        return LOCATION;
    }

    boolean isConflict(final Event ANOTHER_EVENT) {
        return this.getLocation().equals(ANOTHER_EVENT.getLocation()) && this.getDate().equals(ANOTHER_EVENT.getDate());
    }

    void printInformation() {
        System.out.printf(
                "Name: %s%nDate: %s%nLocation: %s%n",
                getName(),
                getDate(),
                getLocation()
        );
    }
}

class Seminar extends Event {
    private final int NUMBER_OF_SPEAKERS;

    Seminar(final String NAME, final String LOCATION, final int YEAR, final byte MONTH, final byte DAY, final byte HOUR, final byte MINUTE, final int NUMBER_OF_SPEAKERS) {
        super(NAME, LOCATION, YEAR, MONTH, DAY, HOUR, MINUTE);
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
    }

    int getNumberOfSpeakers() {
        return NUMBER_OF_SPEAKERS;
    }

    @Override
    void printInformation() {
        super.printInformation();
        System.out.println("Number of Speakers: " + getNumberOfSpeakers());
    }
}