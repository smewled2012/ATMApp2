package com.seme.atm.org;

import java.util.HashMap;

public class Account {
    private String accountNumber;
    private String userName;
    private static final double balance=500;
    private int pin;
    private double deposit;
    private double withdraws;

    public Account(String accountNumber, String userName, double deposit, double withdraws, HashMap<String, Integer> account) {
        //this.accountNumber = new HashMap<>();
        this.userName = userName;
        this.deposit = deposit;
        this.withdraws = withdraws;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdraws() {
        return withdraws;
    }

    public void setWithdraws(double withdraws) {
        this.withdraws = withdraws;
    }
}
