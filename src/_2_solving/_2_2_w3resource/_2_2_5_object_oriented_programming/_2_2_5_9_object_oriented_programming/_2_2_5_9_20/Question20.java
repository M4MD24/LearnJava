package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_20;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance. Include methods for depositing and withdrawing money, as well as checking the balance</h2>
 */

public class Question20 {
    public static void main(final String[] PARAMETERS) {
        final BankAccount BANK_ACCOUNT = new BankAccount("0987654321", "Mohamed", 6542688);
        BANK_ACCOUNT.deposit(5352);
        BANK_ACCOUNT.withdraw(3217);
        BANK_ACCOUNT.printBankAccountInformation();
    }
}

class BankAccount {
    private final String ACCOUNT_NUMBER,
            NAME;
    private float balance;

    BankAccount(final String ACCOUNT_NUMBER, final String NAME, final float BALANCE) {
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.NAME = NAME;
        balance = BALANCE;
    }

    void deposit(final float AMOUNT) {
        balance += AMOUNT;
    }

    void withdraw(final float AMOUNT) {
        if (AMOUNT > balance)
            System.out.println("Can't Withdraw!");
        else
            balance -= AMOUNT;
    }

    String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    String getName() {
        return NAME;
    }

    float getBalance() {
        return balance;
    }

    void printBankAccountInformation() {
        System.out.printf("Account Number: %s%nName: %s%nBalance: %f",
                getAccountNumber(),
                getName(),
                getBalance());
    }
}