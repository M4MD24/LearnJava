package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_7;

import java.util.ArrayList;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Bank Account" to maintain account details of a particular customer.</h2>
 */

public class Question7 {
    private static final Bank BANK_ACCOUNTS = new Bank();

    public static void main(final String[] ARGS) {
        addAccountsInformation();
        BANK_ACCOUNTS.getBankAccount(0).depositMoney(111);
        BANK_ACCOUNTS.getBankAccount(1).withdrawMoney(222);
        BANK_ACCOUNTS.removeBankAccount(2);
        printAccountInformation();
    }

    private static void printAccountInformation() {
        for (int index = 0; index < BANK_ACCOUNTS.getSize(); index++) {
            System.out.print(BANK_ACCOUNTS.getBankAccount(index).getAccountInformation());
            if (index < BANK_ACCOUNTS.getSize() - 1)
                System.out.println("\n");
        }
    }

    private static void addAccountsInformation() {
        BANK_ACCOUNTS.addBankAccount(new BankAccount("Mohamed", "1111111111", 111_111_000));
        BANK_ACCOUNTS.addBankAccount(new BankAccount("Ahmed", "2222222222", 222_222_444));
        BANK_ACCOUNTS.addBankAccount(new BankAccount("Mahmoud", "3333333333", 333_333_333));
    }
}

class Bank {
    private final ArrayList<BankAccount> BANK_ACCOUNTS = new ArrayList<>();

    BankAccount getBankAccount(final int INDEX) {
        return BANK_ACCOUNTS.get(INDEX);
    }

    void addBankAccount(final BankAccount BANK_ACCOUNT) {
        BANK_ACCOUNTS.add(BANK_ACCOUNT);
    }

    void removeBankAccount(final int INDEX) {
        BANK_ACCOUNTS.remove(INDEX);
    }

    int getSize() {
        return BANK_ACCOUNTS.size();
    }
}

class BankAccount {
    private final String NAME,
            ACCOUNT_NUMBER;
    private double balance;

    BankAccount(final String NAME, final String ACCOUNT_NUMBER, final double BALANCE) {
        this.NAME = NAME;
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.balance = BALANCE;
    }

    String getName() {
        return NAME;
    }

    String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    double getBalance() {
        return balance;
    }

    void depositMoney(final double AMOUNT) {
        balance += AMOUNT;
    }

    void withdrawMoney(final double AMOUNT) {
        balance -= AMOUNT;
    }

    String getAccountInformation() {
        return String.format("Name: %s%nAccount Number: %s%nBalance: £%.4f",
                getName(),
                getAccountNumber(),
                getBalance()
        );
    }
}