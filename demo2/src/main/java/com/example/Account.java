package com.example;

public class Account {
    private int accountNumber;
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        System.out.println("Set Account Number");
        this.accountNumber = accountNumber;
    }
    private String accountHolder;
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        System.out.println("Set Account Holder");
        this.accountHolder = accountHolder;
    }
    private double accountBalance;
    public Account() {
        System.out.println("Set Account Balance");
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
