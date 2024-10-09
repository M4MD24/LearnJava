package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_1_constructors._2_2_5_1_6;

/**
 * <h3>Constructor with Validation</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:</h2>
 * <ul>
 *     <li>accountNumber should be non-null and non-empty.</li>
 *     <li>balance should be non-negative.</li>
 *     <li>Print an error message if the validation fails.</li>
 * </ul>
 */

public class Question6 {
    public static void main(final String[] PARAMETERS) {
        new Account("", -500).printInformation();
    }
}

class Account {
    private final String ACCOUNT_NUMBER;
    private final float BALANCE;
    private boolean validationStatus = true;

    Account(final String ACCOUNT_NUMBER, final float BALANCE) {
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.BALANCE = BALANCE;
        if (ACCOUNT_NUMBER == null || ACCOUNT_NUMBER.isEmpty()) {
            validationStatus = false;
            System.err.println("Account number cannot be null or empty!");
        }
        if (BALANCE < 0) {
            System.err.println("Balance cannot be negative!");
            validationStatus = false;
        }
    }

    void printInformation() {
        if (validationStatus)
            System.out.printf("Account Number: %s%nBalance: %f£",
                    ACCOUNT_NUMBER,
                    BALANCE);
    }
}