package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_5_polymorphism._2_2_5_5_9_question_446;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.</h2>
 */
public class Question446 {
    public static void main(final String[] ARGS) {
        bankAccountCommands();
        savingsAccountCommands();
        checkingAccountCommands();
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
        final BankAccount SAVINGS_ACCOUNT = new SavingsAccount("0987654321", 654_321);
        SAVINGS_ACCOUNT.deposit(678);
        SAVINGS_ACCOUNT.withdraw(654_900);
        System.out.printf("■ Savings Account%nAccount Number: %s%nBalance: %.4f%n%n",
                SAVINGS_ACCOUNT.getAccountNumber(),
                SAVINGS_ACCOUNT.getBalance());
    }

    private static void checkingAccountCommands() {
        final BankAccount CHECKING_ACCOUNT = new CheckingAccount("0987612345", 456_123);
        CHECKING_ACCOUNT.deposit(678);
        CHECKING_ACCOUNT.withdraw(654_900);
        System.out.printf("■ Checking Account%nAccount Number: %s%nBalance: %.4f",
                CHECKING_ACCOUNT.getAccountNumber(),
                CHECKING_ACCOUNT.getBalance());
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

class CheckingAccount extends BankAccount {
    CheckingAccount(final String ACCOUNT_NUMBER, final double BALANCE) {
        super(ACCOUNT_NUMBER, BALANCE);
    }

    @Override
    void withdraw(final double AMOUNT) {
        super.withdraw(AMOUNT);
    }
}