package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_9_object_oriented_programming._2_2_1_5_9_22;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Customer" with attributes for name, email, and purchase history. Implement methods to add purchases to the history and calculate total expenditure. Create a subclass "LoyalCustomer" that adds a discount rate attribute and a method to apply the discount.</h2>
 */

public class Question22 {
    private static final Customer CUSTOMER = new Customer("Someone1", "Example1@Example.Example");
    private static final LoyalCustomer LOYAL_CUSTOMER = new LoyalCustomer("Someone2", "Example2@Example.Example", 50);

    public static void main(final String[] ARGUMENTS) {
        buyItemsForLoyalCustomer();
        LOYAL_CUSTOMER.printCustomerInformation();

        System.out.println();

        buyItemsCustomer();
        CUSTOMER.printCustomerInformation();
    }

    private static void buyItemsForLoyalCustomer() {
        LOYAL_CUSTOMER.buyItem("Thing", 325);
        LOYAL_CUSTOMER.buyItem("Thing", 128);
        LOYAL_CUSTOMER.buyItem("Thing", 241);
    }

    private static void buyItemsCustomer() {
        CUSTOMER.buyItem("Thing", 325);
        CUSTOMER.buyItem("Thing", 241);
    }
}

class Customer {
    private final String NAME,
            EMAIL;
    private final List<Item> PURCHASES_HISTORY = new ArrayList<>();

    Customer(final String NAME, final String EMAIL) {
        this.NAME = NAME;
        this.EMAIL = EMAIL;
    }

    String getName() {
        return NAME;
    }

    String getEmail() {
        return EMAIL;
    }

    void printPurchaseHistory() {
        System.out.println("Purchase History:");
        for (final Item ITEM : PURCHASES_HISTORY)
            System.out.printf(
                    "Name: %s%nPrice: £%f%nPurchase History: %s%n",
                    ITEM.getName(),
                    ITEM.getPrice(),
                    ITEM.getPurchaseHistory()
            );
    }

    void printCustomerInformation() {
        System.out.printf(
                "Name: %s%nEmail: %s%n",
                getName(),
                getEmail()
        );
        printPurchaseHistory();
    }

    void buyItem(final String NAME, final float PRICE) {
        PURCHASES_HISTORY.add(new Item(NAME, PRICE));
    }
}

class LoyalCustomer extends Customer {
    private final float DISCOUNT_RATE;

    LoyalCustomer(final String NAME, final String EMAIL, final float DISCOUNT_RATE) {
        super(NAME, EMAIL);
        this.DISCOUNT_RATE = DISCOUNT_RATE;
    }

    String getDiscountRate() {
        return String.format(
                "%%%.2f",
                DISCOUNT_RATE
        );
    }

    @Override
    public void printCustomerInformation() {
        System.out.printf(
                "Name: %s%nEmail: %s%nDiscount Rate: %s%n",
                getName(),
                getEmail(),
                getDiscountRate()
        );
        printPurchaseHistory();
    }
}

class Item {
    private final String NAME;
    private final float PRICE;
    private final Calendar PURCHASE_HISTORY = Calendar.getInstance();

    Item(final String NAME, final float PRICE) {
        this.NAME = NAME;
        this.PRICE = PRICE;
    }

    String getName() {
        return NAME;
    }

    float getPrice() {
        return PRICE;
    }

    String getPurchaseHistory() {
        return new SimpleDateFormat("yyyy/MMMM/dd hh:mm a", Locale.US).format(PURCHASE_HISTORY.getTime());
    }
}