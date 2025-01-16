package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_6_proxy_pattern;

class BankAccountProxy implements BankAccountService {
    private final BankAccount REAL_ACCOUNT;
    private final boolean IS_AUTHORIZE;
    private final String MESSAGE_OF_ACCESS_DENIED_UNAUTHORIZED_USER = "Access denied: Unauthorized user!";

    public BankAccountProxy(BankAccount realAccount, boolean authorizedUser) {
        this.REAL_ACCOUNT = realAccount;
        this.IS_AUTHORIZE = authorizedUser;
    }

    @Override
    public void deposit(double amount) {
        if (IS_AUTHORIZE)
            REAL_ACCOUNT.deposit(amount);
        else
            System.out.println(MESSAGE_OF_ACCESS_DENIED_UNAUTHORIZED_USER);
    }

    @Override
    public void withdraw(double amount) {
        if (IS_AUTHORIZE)
            REAL_ACCOUNT.withdraw(amount);
        else
            System.out.println(MESSAGE_OF_ACCESS_DENIED_UNAUTHORIZED_USER);
    }

    @Override
    public void displayBalance() {
        if (IS_AUTHORIZE)
            REAL_ACCOUNT.displayBalance();
        else
            System.out.println(MESSAGE_OF_ACCESS_DENIED_UNAUTHORIZED_USER);
    }
}