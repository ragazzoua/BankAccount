package com.company;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccount(String accountNumber, double initialBalance) {
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
        this.lock = new ReentrantLock();
    }

    /*public synchronized void deposit(double ammount){
        balance += ammount;
        System.out.println(balance);
    }

    public synchronized void withdraw(double ammount){
        balance -= ammount;
        System.out.println(balance);
    }*/


    public void deposit(double ammount) {
        lock.lock();
        try {
            balance += ammount;
        } finally {
            lock.unlock();
        }
        System.out.println(balance);
    }

    public void withdraw(double ammount) {
        lock.lock();
        try {
            balance -= ammount;
        } finally {
            lock.unlock();
        }
        System.out.println(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number " + accountNumber);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
