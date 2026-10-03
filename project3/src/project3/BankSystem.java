package project3;
import java.util.*;
import java.io.*;

// Base Class
class Account {
    protected int accNo;
    protected String name;
    protected double balance;

    public Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    public void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

// Derived Class (Inheritance + Polymorphism)
class SavingsAccount extends Account {

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    // Method Overriding (Polymorphism)
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

// Main Class
public class BankSystem {

    static ArrayList<SavingsAccount> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void createAccount() {
        try {
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Initial Balance: ");
            double bal = sc.nextDouble();

            accounts.add(new SavingsAccount(accNo, name, bal));
            System.out.println("Account Created Successfully!");
        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }
    }

    public static SavingsAccount findAccount(int accNo) {
        for (SavingsAccount acc : accounts) {
            if (acc.accNo == accNo)
                return acc;
        }
        return null;
    }

    public static void deposit() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        SavingsAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();
            acc.deposit(amt);
        } else {
            System.out.println("Account Not Found!");
        }
    }

    public static void withdraw() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        SavingsAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
        } else {
            System.out.println("Account Not Found!");
        }
    }

    public static void displayAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        SavingsAccount acc = findAccount(accNo);
        if (acc != null) {
            acc.display();
        } else {
            System.out.println("Account Not Found!");
        }
    }

    // File Handling
    public static void saveToFile() {
        try {
            FileWriter fw = new FileWriter("accounts.txt");
            for (SavingsAccount acc : accounts) {
                fw.write(acc.accNo + "," + acc.name + "," + acc.balance + "\n");
            }
            fw.close();
            System.out.println("Data Saved Successfully!");
        } catch (IOException e) {
            System.out.println("Error Saving File!");
        }
    }

    public static void loadFromFile() {
        try {
            File file = new File("accounts.txt");
            if (!file.exists()) return;

            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                accounts.add(new SavingsAccount(
                        Integer.parseInt(data[0]),
                        data[1],
                        Double.parseDouble(data[2])
                ));
            }
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Error Loading File!");
        }
    }

    public static void main(String[] args) {

        loadFromFile();

        int choice;
        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display");
            System.out.println("5. Save to File");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: createAccount(); break;
                case 2: deposit(); break;
                case 3: withdraw(); break;
                case 4: displayAccount(); break;
                case 5: saveToFile(); break;
                case 6: System.out.println("Thank You!"); break;
                default: System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }
}