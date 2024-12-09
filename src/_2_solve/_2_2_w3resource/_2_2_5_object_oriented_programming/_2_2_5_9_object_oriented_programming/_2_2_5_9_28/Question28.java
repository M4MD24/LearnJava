package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_28;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and date. Create subclasses "ApartmentReservation" and "RailwayReservation" that add specific attributes like room number for hotels and seat number for flights. Implement methods to check reservation status and modify reservation details.</h2>
 */

public class Question28 {
    public static void main(final String[] PARAMETERS) {
        final Reservation RESERVATION = new Reservation("0987654321", "Someone");
        final Reservation.RailwayReservation RAILWAY_RESERVATION = new Reservation.RailwayReservation(8);
        final Reservation.ApartmentReservation APARTMENT_RESERVATION = new Reservation.ApartmentReservation(5);
        RAILWAY_RESERVATION.modifySeatNumber(2);
        APARTMENT_RESERVATION.modifyRoomNumber(4);
        System.out.printf("""
                        Reservation ID: %s
                        Customer Name: %s
                        Date: %s
                        Reservation Status: %s
                        Seat Number: %d
                        Room Number: %d""",
                RESERVATION.getReservationID(),
                RESERVATION.getCustomerName(),
                RESERVATION.getDate(),
                RESERVATION.getReservationStatus(),
                RAILWAY_RESERVATION.getSeatNumber(),
                APARTMENT_RESERVATION.getRoomNumber());
    }
}

class Reservation {
    private final String RESERVATION_ID,
            CUSTOMER_NAME;
    private final Calendar DATE = Calendar.getInstance();

    Reservation(final String RESERVATION_ID, final String CUSTOMER_NAME) {
        this.RESERVATION_ID = RESERVATION_ID;
        this.CUSTOMER_NAME = CUSTOMER_NAME;
    }

    public String getReservationID() {
        return RESERVATION_ID;
    }

    public String getCustomerName() {
        return CUSTOMER_NAME;
    }

    public String getDate() {
        return new SimpleDateFormat("yyyy/MMMM/dd hh:mm a", Locale.US).format(DATE.getTime());
    }

    public String getReservationStatus() {
        return "Confirmed";
    }

    static class RailwayReservation {
        private int seatNumber;

        RailwayReservation(final int SEAT_NUMBER) {
            this.seatNumber = SEAT_NUMBER;
        }

        public int getSeatNumber() {
            return seatNumber;
        }

        public void modifySeatNumber(final int SEAT_NUMBER) {
            this.seatNumber = SEAT_NUMBER;
        }
    }

    static class ApartmentReservation {
        private int roomNumber;

        ApartmentReservation(final int ROOM_NUMBER) {
            this.roomNumber = ROOM_NUMBER;
        }

        int getRoomNumber() {
            return roomNumber;
        }

        public void modifyRoomNumber(final int ROOM_NUMBER) {
            this.roomNumber = ROOM_NUMBER;
        }
    }
}