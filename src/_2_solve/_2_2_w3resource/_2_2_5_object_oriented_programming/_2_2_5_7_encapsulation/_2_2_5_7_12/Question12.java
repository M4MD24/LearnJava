package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_7_encapsulation._2_2_5_7_12;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Account with private instance variables accountNumber, accountHolder, and balance. Provide public getter and setter methods to access and modify these variables. Add a method called deposit() that takes an amount and increases the balance by that amount, and a method called withdraw() that takes an amount and decreases the balance by that amount.</h2>
 */

public class Question12 {
    public static void main(final String[] PARAMETERS) {
        final Account ACCOUNT = new Account();
        ACCOUNT.setAccountNumber("0987654321");
        ACCOUNT.setAccountHolder("Someone");
        ACCOUNT.setBalance(1200);
        ACCOUNT.deposit(300);
        ACCOUNT.withdraw(500);
        System.out.printf("""
                Account Number: %s
                Account Holder: %s
                Balance: %f""",
                ACCOUNT.getAccountNumber(),
                ACCOUNT.getAccountHolder(),
                ACCOUNT.getBalance());
    }
}

class Account {
    private String accountNumber,
            accountHolder;
    private float balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(final String ACCOUNT_NUMBER) {
        accountNumber = ACCOUNT_NUMBER;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(final String ACCOUNT_HOLDER) {
        accountHolder = ACCOUNT_HOLDER;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(final float BALANCE) {
        balance = BALANCE;
    }

    public void deposit(final float AMOUNT) {
        final float CORRECT_AMOUNT = Math.abs(AMOUNT);
        if (CORRECT_AMOUNT > 0)
            balance += CORRECT_AMOUNT;
        else
            System.out.print("Enter Amount Non-Zero");
    }

    public void withdraw(final float AMOUNT) {
        final float CORRECT_AMOUNT = Math.abs(AMOUNT);
        if (CORRECT_AMOUNT <= balance)
            balance -= CORRECT_AMOUNT;
        else
            System.out.print("Enter Amount Greater than your balance");
    }
}