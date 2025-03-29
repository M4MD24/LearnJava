package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_5_abstract_class._2_2_1_1_5_5_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        savingsAccount();
        currentAccount();
    }

    private static void savingsAccount() {
        final SavingsAccount SAVINGS_ACCOUNT = new SavingsAccount("1234567890", 111_111);
        System.out.println("■ Savings Account:");
        SAVINGS_ACCOUNT.deposit(889);
        SAVINGS_ACCOUNT.withdraw(889);
        System.out.println("Balance: " + SAVINGS_ACCOUNT.getBalance());
    }

    private static void currentAccount() {
        final CurrentAccount CURRENT_ACCOUNT = new CurrentAccount("0987654321", 222_222);
        System.out.println("\n■ Current Account:");
        CURRENT_ACCOUNT.deposit(778);
        CURRENT_ACCOUNT.withdraw(778);
        System.out.print("Balance: " + CURRENT_ACCOUNT.getBalance());
    }
}

abstract class BankAccount {
    private int balance;

    BankAccount(final String ACCOUNT_NUMBER, final int BALANCE) {
        this.balance = BALANCE;
    }

    int getBalance() {
        return balance;
    }

    protected void setBalance(final int BALANCE) {
        this.balance = BALANCE;
    }

    abstract void deposit(final int AMOUNT);

    abstract void withdraw(final int AMOUNT);
}

class SavingsAccount extends BankAccount {
    SavingsAccount(final String ACCOUNT_NUMBER, final int BALANCE) {
        super(ACCOUNT_NUMBER, BALANCE);
    }

    @Override
    void deposit(final int AMOUNT) {
        setBalance(getBalance() + AMOUNT);
        System.out.println("Deposit of £" + AMOUNT + " successful. Current balance: £" + getBalance());
    }

    @Override
    void withdraw(final int AMOUNT) {
        if (getBalance() >= AMOUNT) {
            setBalance(getBalance() - AMOUNT);
            System.out.println("Withdrawal of £" + AMOUNT + " successful. Current balance: £" + getBalance());
        } else
            System.out.println("Insufficient funds. Withdrawal failed.");
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(final String ACCOUNT_NUMBER, final int BALANCE) {
        super(ACCOUNT_NUMBER, BALANCE);
    }

    @Override
    void deposit(final int AMOUNT) {
        setBalance(getBalance() + AMOUNT);
        System.out.println("Deposit of £" + AMOUNT + " successful. Current balance: £" + getBalance());
    }

    @Override
    void withdraw(final int AMOUNT) {
        if (getBalance() >= AMOUNT) {
            setBalance(getBalance() - AMOUNT);
            System.out.println("Withdrawal of £" + AMOUNT + " successful. Current balance: £" + getBalance());
        } else
            System.out.println("Insufficient funds. Withdrawal failed.");
    }
}