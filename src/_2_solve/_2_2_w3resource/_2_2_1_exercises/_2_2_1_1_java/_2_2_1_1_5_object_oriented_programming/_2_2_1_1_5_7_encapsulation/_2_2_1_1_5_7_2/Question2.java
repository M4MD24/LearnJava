package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_7_encapsulation._2_2_1_1_5_7_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.</h2>
 */

public class Question2 {
    private static final BankAccount BANK_ACCOUNT = new BankAccount();

    public static void main(final String[] ARGUMENTS) {
        addDataBankAccount();
        getInformationBankAccount();
    }

    private static void getInformationBankAccount() {
        System.out.printf("Account Number: %s%nBalance: %f",
                BANK_ACCOUNT.getAccountNumber(),
                BANK_ACCOUNT.getBalance());
    }

    private static void addDataBankAccount() {
        BANK_ACCOUNT.setAccountNumber("0987654321");
        BANK_ACCOUNT.setBalance(123_456);
    }
}

class BankAccount {
    private String accountNumber;
    private float balance;

    String getAccountNumber() {
        return accountNumber;
    }

    void setAccountNumber(final String ACCOUNT_NUMBER) {
        accountNumber = ACCOUNT_NUMBER;
    }

    float getBalance() {
        return balance;
    }

    void setBalance(final float BALANCE) {
        balance = BALANCE;
    }
}