package project3;

import java.util.Scanner;

class StudentAccount {
    /**
     * 
     */
    int accNo;
    String name;
    double balance;

    // Create account
    void createAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    // Deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Display account details
    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Student Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class StudentBankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentAccount acc = new StudentAccount();

        int choice;

        do {
            System.out.println("\n==== Student Banking System ====");
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
                    int accNo = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    acc.createAccount(accNo, name, balance);
                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ");
                    double wit = sc.nextDouble();
                    acc.withdraw(wit);
                    break;

                case 4:
                    acc.checkBalance();
                    break;

                case 5:
                    acc.display();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}