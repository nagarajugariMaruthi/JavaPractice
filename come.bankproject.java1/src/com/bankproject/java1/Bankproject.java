package com.bankproject.java1;

import java.util.Scanner;

// BankAccount class
class BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;
    boolean isCreated = false;   // ✅ Track account creation

    // Create account
    void createAccount(long accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
        isCreated = true;
        System.out.println("Account successfully created!");
    }

    // Deposit
    void deposit(double amount) {
        if (!isCreated) {
            System.out.println("Please create account first!");
            return;
        }

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Withdraw
    void withdraw(double amount) {
        if (!isCreated) {
            System.out.println("Please create account first!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    // Check balance
    void checkBalance() {
        if (!isCreated) {
            System.out.println("Please create account first!");
            return;
        }
        System.out.println("Current Balance: " + balance);
    }

    // Display details
    void displayDetails() {
        if (!isCreated) {
            System.out.println("Please create account first!");
            return;
        }

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

// Main class
public class Bankproject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    long accNo = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double initialBalance = sc.nextDouble();

                    account.createAccount(accNo, name, initialBalance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    account.checkBalance();
                    break;

                case 5:
                    account.displayDetails();
                    break;

                case 6:
                    System.out.println("Thank you for using banking system!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}