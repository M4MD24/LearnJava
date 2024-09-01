package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_6_interface._2_2_5_6_4;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.</h2>
 */

public class Question4 {
    private static final Bank BANK = new Bank();

    public static void main(final String[] ARGS) {
        final SavingsAccount SAVINGS_ACCOUNT = new SavingsAccount(123_456);
        SAVINGS_ACCOUNT.deposit(544);
        SAVINGS_ACCOUNT.withdraw(544);

        final CurrentAccount CURRENT_ACCOUNT = new CurrentAccount(654_321);
        CURRENT_ACCOUNT.deposit(679);
        CURRENT_ACCOUNT.withdraw(679);

        BANK.addAccount(SAVINGS_ACCOUNT);
        BANK.addAccount(CURRENT_ACCOUNT);

        System.out.println("Type Account\tBalance\n" + "-".repeat(23));
        for (final Account ACCOUNT : BANK.GET_ACCOUNTS())
            System.out.println(ACCOUNT.getAccountType() + "\t" + ACCOUNT.getBalance());
    }
}

class Bank {
    private final List<Account> ACCOUNTS = new ArrayList<>();

    void addAccount(final Account ACCOUNT) {
        ACCOUNTS.add(ACCOUNT);
    }

    final List<Account> GET_ACCOUNTS() {
        return ACCOUNTS;
    }
}

interface Account {
    void deposit(final double AMOUNT);

    void withdraw(final double AMOUNT);

    double getBalance();

    AccountType getAccountType();
}

class SavingsAccount extends Bank implements Account {
    private final AccountType ACCOUNT_TYPE;
    private double balance;

    SavingsAccount(final double BALANCE) {
        this.ACCOUNT_TYPE = AccountType.SavingsAccount;
        balance = BALANCE;
    }

    @Override
    public void deposit(final double AMOUNT) {
        balance += AMOUNT;
    }

    @Override
    public void withdraw(final double AMOUNT) {
        if (balance - AMOUNT < 100)
            System.out.println("Can't withdraw!");
        else
            balance -= AMOUNT;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public AccountType getAccountType() {
        return ACCOUNT_TYPE;
    }
}

class CurrentAccount extends Bank implements Account {
    private final AccountType ACCOUNT_TYPE;
    private double balance;

    CurrentAccount(final double BALANCE) {
        this.ACCOUNT_TYPE = AccountType.CurrentAccount;
        balance = BALANCE;
    }

    @Override
    public void deposit(final double AMOUNT) {
        balance += AMOUNT;
    }

    @Override
    public void withdraw(final double AMOUNT) {
        if (balance - AMOUNT < 0)
            System.out.println("Can't withdraw!");
        else
            balance -= AMOUNT;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public AccountType getAccountType() {
        return ACCOUNT_TYPE;
    }
}

enum AccountType {
    SavingsAccount,
    CurrentAccount
}