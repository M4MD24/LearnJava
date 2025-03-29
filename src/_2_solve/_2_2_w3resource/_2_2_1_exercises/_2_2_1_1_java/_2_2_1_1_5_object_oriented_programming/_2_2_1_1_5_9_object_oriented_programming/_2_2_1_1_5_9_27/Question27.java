package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_9_object_oriented_programming._2_2_1_1_5_9_27;

import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date. Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number. Implement methods to calculate delivery time based on the address and update the tracking status.</h2>
 */

public class Question27 {
    public static void main(final String[] ARGUMENTS) {
        final CustomerOrder CUSTOMER_ORDER = new CustomerOrder("0987654321", "Someone", 2024, 8, 11);
        final CustomerOrder.OnlineOrder ONLINE_ORDER = new CustomerOrder.OnlineOrder("Address, Address, Address", "0987654321098764321");
        System.out.printf("""
                        Order ID: %s
                        Customer: %s
                        Address: %s
                        Tracking Number: %s
                        Calculate Delivery: %s
                        Tracking Status: %s""",
                CUSTOMER_ORDER.getOrderId(),
                CUSTOMER_ORDER.getCustomer(),
                ONLINE_ORDER.getAddress(),
                ONLINE_ORDER.getTrackingNumber(),
                ONLINE_ORDER.calculateDelivery(),
                ONLINE_ORDER.trackingStatus());
    }
}

class CustomerOrder {
    private final String ORDER_ID,
            CUSTOMER;
    private static final Calendar ORDER_DATE = Calendar.getInstance();
    private static int year,
            month,
            day;

    CustomerOrder(final String ORDER_ID, final String CUSTOMER, final int YEAR, final int MONTH, final int DAY) {
        this.ORDER_ID = ORDER_ID;
        this.CUSTOMER = CUSTOMER;
        ORDER_DATE.set(year = YEAR, month = MONTH, day = DAY);
    }


    static class OnlineOrder {
        private final String ADDRESS,
                TRACKING_NUMBER;

        OnlineOrder(final String ADDRESS, final String TRACKING_NUMBER) {
            this.ADDRESS = ADDRESS;
            this.TRACKING_NUMBER = TRACKING_NUMBER;
        }

        String getAddress() {
            return ADDRESS;
        }

        String getTrackingNumber() {
            return TRACKING_NUMBER;
        }

        String calculateDelivery() {
            return "Free Delivery!";
        }

        String trackingStatus() {
            final Calendar DELIVERY_TIME = Calendar.getInstance();
            DELIVERY_TIME.set(year, month, day + 3);
            return (ORDER_DATE.after(DELIVERY_TIME))
                    ? "Delivered!"
                    : "In the way!";
        }
    }

    String getOrderId() {
        return ORDER_ID;
    }

    String getCustomer() {
        return CUSTOMER;
    }
}