package codingkata;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100.10);
        bankAccount.withdraw(155.27);
        bankAccount.getBalance();
    }

    public void deposit(double amount) {
        if (isAmountValid(amount)) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (isAmountValid(amount)) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdraw: " + amount);
            } else {
                System.out.println("Insufficient founds.");
            }
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public double getBalance() {
        System.out.println("Your balance is: " + balance);
        return balance;
    }

    private boolean isAmountValid(double value) {
        return value >= 0;
    }
}