package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_4_inheritance._2_2_1_1_5_4_5;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.</h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        bankAccountCommands();
        savingsAccountCommands();
    }

    private static void bankAccountCommands() {
        final BankAccount BANK_ACCOUNT = new BankAccount("1234567890", 123_456);
        BANK_ACCOUNT.deposit(543);
        BANK_ACCOUNT.withdraw(123_900);
        System.out.printf("■ Bank Account%nAccount Number: %s%nBalance: %.4f%n%n",
                BANK_ACCOUNT.getAccountNumber(),
                BANK_ACCOUNT.getBalance());
    }

    private static void savingsAccountCommands() {
        final SavingsAccount SAVINGS_ACCOUNT = new SavingsAccount("0987654321", 654_321);
        SAVINGS_ACCOUNT.deposit(678);
        SAVINGS_ACCOUNT.withdraw(654_900);
        System.out.printf("■ Savings Account%nAccount Number: %s%nBalance: %.4f",
                SAVINGS_ACCOUNT.getAccountNumber(),
                SAVINGS_ACCOUNT.getBalance());
    }
}

class BankAccount {
    private final String ACCOUNT_NUMBER;
    private double balance;

    BankAccount(final String ACCOUNT_NUMBER, final double BALANCE) {
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        balance = BALANCE;
    }

    String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    double getBalance() {
        return balance;
    }

    void deposit(final double AMOUNT) {
        balance += AMOUNT;
    }

    void withdraw(final double AMOUNT) {
        if (AMOUNT > balance)
            System.out.println("Can't Withdraw!");
        else
            balance -= AMOUNT;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(final String ACCOUNT_NUMBER, final double BALANCE) {
        super(ACCOUNT_NUMBER, BALANCE);
    }

    @Override
    void withdraw(final double AMOUNT) {
        if ((getBalance() - AMOUNT) < 100)
            System.out.println("Minimum balance of £100 required!");
        else
            super.withdraw(AMOUNT);
    }
}