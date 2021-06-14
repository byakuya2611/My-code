package models;

import java.text.NumberFormat;

public class Account {
    public static final Float fee = 1f;
    private long accountNumber;
    private String accountName;
    private double balance;
    private final Float interestRate = 0.035f;

    public Account() {

    }

    public Account(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 50;
    }

    public void deposit(Float money) {
        this.balance += money;
    }

    public boolean canWithdraw(Float money) {
        return this.balance - money - fee >= 0;
    }


    public void withdraw(Float money) {
        if(!this.canWithdraw(money)) {
            System.err.println("Cannot withdraw money");
            return;
        }
        this.balance = this.balance - money - fee;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private String convertToCurrencyFormat(double money){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(money);
        return moneyString;
    }

    public void transferTo(Account anotherAccount, float money) {
        if(this.canWithdraw(money) == true) {
            this.withdraw(money);
            anotherAccount.deposit(money);
        } else {
            System.err.println("Cannot withdraw from source account");
        }
    }

    @Override
    public String toString() {
        return String.format("accountNumber = %d, accountName = %s, balance = %s",
                this.accountNumber, this.accountName, convertToCurrencyFormat(this.balance));
    }
}
