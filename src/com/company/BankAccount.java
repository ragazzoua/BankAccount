package com.company;

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double ammount){
        balance += ammount;
    }

    public void withdraw(double ammount){
        balance -= ammount;
    }
}
