package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_6_proxy_pattern;

class BankAccount implements BankAccountService {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.print("Deposited: " + amount + "£ , ");
            displayBalance();
        } else
            System.out.println("Enter amonut in the positive!");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0)
            if (amount <= balance) {
                setBalance(balance - amount);
                System.out.print("Withdrawn: " + amount + "£ , ");
                displayBalance();
            } else
                System.out.println("Insufficient balance!");
        else
            System.out.println("Enter amonut in the positive!");
    }

    @Override
    public void displayBalance() {
        System.out.println("Current Balance: " + getBalance() + "£");
    }
}