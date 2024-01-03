package exercises;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs." + amount + ". New balance: Rs." + balance);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew Rs." + amount + ". New balance: Rs." + balance);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Ishita", 1000.0);

        System.out.println("Account Details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: Rs." + account.getBalance());

        account.deposit(1500.0);
        account.withdraw(200.0);
        account.withdraw(10000.0);

        System.out.println("Final Account Details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Final Balance: Rs." + account.getBalance());
    }
}

