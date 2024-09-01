package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_2_static_members._2_2_5_2_8;

/**
 * <h3>Static Members in Different Contexts</h3>
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "BankAccount" with instance variables 'accountNumber' and balance, and static variables 'bankName' and 'interestRate'. Provide static methods to get and set the static variables. Create several 'BankAccount' objects and print their details along with the static variables.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGS) {
        final BankAccount BANK_ACCOUNT = new BankAccount("0987654321", 123.5132F);
        BankAccount.setBankName("Bank Name");
        BankAccount.setInterestRate(5.4F);
        BANK_ACCOUNT.printInformation();
    }
}

class BankAccount {
    private final String ACCOUNT_NUMBER;
    private final float BALANCE;
    private static String bankName;
    private static float interestRate;

    BankAccount(final String ACCOUNT_NUMBER, final float BALANCE) {
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.BALANCE = BALANCE;
    }

    static String getBankName() {
        return bankName;
    }

    static void setBankName(final String NAME) {
        bankName = NAME;
    }

    static double getInterestRate() {
        return interestRate;
    }

    static void setInterestRate(final float RATE) {
        interestRate = RATE;
    }

    void printInformation() {
        System.out.printf("""
                        Account Number: %s
                        Balance: %f
                        Bank Name: %s
                        Interest Rate: %.2f""",
                ACCOUNT_NUMBER,
                BALANCE,
                bankName,
                interestRate);
    }
}