package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_6_proxy_pattern;

interface BankAccountService {
    void deposit(double amount);

    void withdraw(double amount);

    void displayBalance();
}