package com.company;

public class Main {

    public static void main(String[] args) {

        final BankAccount bankAccount = new BankAccount("12345-678", 1000.00);


//        Thread trThread1 = new Thread() {
//            public void run() {
//                bankAccount.deposit(300.00);
//                bankAccount.withdraw(50.00);
//            }
//        };
//
//        Thread trThread2 = new Thread() {
//            public void run() {
//                bankAccount.deposit(203.75);
//                bankAccount.withdraw(100);
//            }
//        };

        trThread1.start();
        trThread2.start();

    }
}
