package com.maruthi.project;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1001, "Maruthi", 50000);

        // Check balance
        account.checkBalance();
    }
}