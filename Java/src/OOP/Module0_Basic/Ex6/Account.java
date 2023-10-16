package OOP.Module0_Basic.Ex6;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035;

    public Account() {
        accountNumber = 9999999;
        name = "Undefined";
        balance = 50000;
    }

    public Account(long accountNumber, String name) {
        if (accountNumber < 0) {
            this.accountNumber = 9999999;
        } else {
            this.accountNumber = accountNumber;
        }

        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Undefined";
        }

        this.balance = 50000;
    }

    public Account(long accountNumber, String name, double balance) {
        if (accountNumber < 0) {
            this.accountNumber = 9999999;
        } else {
            this.accountNumber = accountNumber;
        }

        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Undefined";
        }

        if (balance >= 1) {
            this.balance = balance;
        } else {
            this.balance = 50000;
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        this.balance = balance + amount;
        System.out.println("You've just deposited " + amount + " VND!!!");
        System.out.println("Current balance: " + balance);
        return true;
    }

    public boolean withdraw(double amount, double fee) {
        if (this.balance >= (amount + fee)) {
            this.balance = balance - (amount + fee);
            System.out.println("You've just withdrew " + amount + " VND. Fee is " + fee + ". Remaining balance: " + balance );
            return true;
        } else {
            System.out.println("You don't have enough balance!!!");
            return false;
        }
    }

    public void addInterest() {
        balance = balance + balance * RATE;
        System.out.println("Current balance is: " + balance);
    }

    public boolean transfer(Account account, double amount) {
        if (this.balance >= amount) {
            account.balance += this.balance;
            System.out.println("Transfer completed.");
            return true;
        } else {
            System.out.println("Error: You don't have enough balanced.");
            return false;
        }
    }

    @Override
    public String toString() {
        Locale locale;

        {
            locale = new Locale("vi", "vn");
        }

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return String.format("%-20s | %-30s | %20s", this.accountNumber, this.name, nf.format(balance));
    }
}
