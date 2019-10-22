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
        System.out.println(balance);
    }

    public void withdraw(double ammount){
        balance -= ammount;
        System.out.println(balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
