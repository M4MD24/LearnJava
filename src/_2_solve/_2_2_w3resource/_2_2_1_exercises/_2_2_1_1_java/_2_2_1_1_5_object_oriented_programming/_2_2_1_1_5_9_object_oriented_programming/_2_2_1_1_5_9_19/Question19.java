package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_9_object_oriented_programming._2_2_1_1_5_9_19;

import java.lang.constant.Constable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.</h2>
 */

public class Question19 {
    private static final Airport AIRPORT = new Airport();

    public static void main(final String[] ARGUMENTS) {
        addReservations();

        AIRPORT.printAllReservations();

        System.out.println("\n");

        System.out.println(AIRPORT.searchFlight("Palestine Airways"));
        System.out.println(AIRPORT.searchHotel(""));

        AIRPORT.cancelReservation("A2-462");
        System.out.println("\nAfter Cancel Reservation");
        AIRPORT.printAllReservations();
    }

    private static void addReservations() {
        AIRPORT.bookReservation(
                "M3-999",
                Flights.PalestineAirlines,
                2024,
                (byte) 6,
                (byte) 9,
                (byte) 11,
                (byte) 44,
                Hotels.OceanGrandHotel
        );
        AIRPORT.bookReservation(
                "A2-462",
                Flights.PalestineAirConnect,
                2024,
                (byte) 8,
                (byte) 10,
                (byte) 13,
                (byte) 32,
                Hotels.AbrahamsHerberge_BeitIbrahem
        );
    }
}

class Airport {
    private static final ArrayList<Reservation> AIRPORT = new ArrayList<>();

    void bookReservation(final String FLIGHT_NUMBER, final Flights FLIGHT, final int YEAR, final byte MONTH, final byte DAY, final byte HOUR, final byte MINUTE, final Hotels HOTEL) {
        AIRPORT.add(new Reservation(
                FLIGHT_NUMBER,
                FLIGHT,
                YEAR,
                MONTH,
                DAY,
                HOUR,
                MINUTE,
                HOTEL
        ));
    }

    void cancelReservation(final String FLIGHT_NUMBER) {
        for (int index = 0; index < AIRPORT.size(); index++)
            if (AIRPORT.get(index).getFlightNumber().equals(FLIGHT_NUMBER)) {
                AIRPORT.remove(index);
                return;
            }
        System.out.println("Flight number not unavailable");
    }

    Constable searchFlight(final String FLIGHT_NAME) {
        try {
            Flights.valueOf(FLIGHT_NAME.replaceAll(" ", ""));
            return true;
        } catch (final Exception _) {
            return false;
        }
    }

    Constable searchHotel(final String HOTEL_NAME) {
        try {
            Hotels.valueOf(HOTEL_NAME);
            return true;
        } catch (final Exception _) {
            return false;
        }
    }

    void printAllReservations() {
        for (int index = 0; index < AIRPORT.size(); index++) {
            AIRPORT.get(index).printReservationInformation();
            if (index < AIRPORT.size() - 1)
                System.out.println('\n');
        }
    }
}

class Reservation {
    private final String FLIGHT_NUMBER;
    private final Flights FLIGHT;
    private final Calendar DEPARTURE_TIME = Calendar.getInstance();
    private final Hotels HOTEL;

    Reservation(final String FLIGHT_NUMBER, final Flights FLIGHT, final int YEAR, final byte MONTH, final byte DAY, final byte HOUR, final byte MINUTE, final Hotels HOTEL) {
        this.FLIGHT_NUMBER = FLIGHT_NUMBER;
        this.FLIGHT = FLIGHT;
        DEPARTURE_TIME.set(YEAR, MONTH - 1, DAY, HOUR, MINUTE);
        this.HOTEL = HOTEL;
    }

    String getFlightNumber() {
        return FLIGHT_NUMBER;
    }

    String getFlight() {
        return FLIGHT.name();
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

    String getHotel() {
        return HOTEL.name();
    }

    void printReservationInformation() {
        System.out.printf("Flight Number: %s%nFlight: %s%nDeparture Time: %s%nCheck flight status: %s%nRemaining time of flight: %s%nHotel: %s",
                getFlightNumber(),
                getFlight(),
                getDepartureTime(),
                checkFlightStatus(),
                getRemainingTimeOnFlight(),
                getHotel());
    }
}

enum Flights {
    PalestineAirways,
    PalestineExpress,
    PalestineWings,
    PalestineSkyways,
    PalestineAir,
    PalestineJet,
    PalestineFlyer,
    PalestineAirlines,
    PalestineAirShuttle,
    PalestineAirConnect
}

enum Hotels {
    AbrahamsHerberge_BeitIbrahem,
    OceanGrandHotel,
    OasisHotel,
    SunsetInn,
    GoldenSandsResort,
    MountainViewLodge,
    LakesideRetreat,
    ParadiseHotelAndSpa,
    HarmonyResort,
    CrystalBaySuites,
    MapleLeafInn,
    SerenityStay
}