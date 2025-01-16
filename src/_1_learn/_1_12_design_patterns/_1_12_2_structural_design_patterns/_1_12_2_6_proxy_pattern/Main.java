package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_6_proxy_pattern;

public class Main {
    public static void main(final String[] PARAMETERS) {
        BankAccount realAccount = new BankAccount(5000);

        BankAccountService proxy = new BankAccountProxy(
                realAccount,
                true
        );
        proxy.displayBalance();
        proxy.withdraw(1000);

        proxy = new BankAccountProxy(
                realAccount,
                false
        );
        proxy.deposit(500);
    }
}