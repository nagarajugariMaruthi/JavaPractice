package java.practce.cls;
import java.util.Scanner;
public class AtmProjectDemo1 {
    static double balance = 10000.0;
    static Scanner sc = new Scanner(System.in);

    public static void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void depositMoney() {
        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " Deposited Successfully!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    public static void withdrawMoney() {
        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid Amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " Withdrawn Successfully!");
        }
    }

    public static void miniStatement() {
        System.out.println("------ MINI STATEMENT ------");
        System.out.println("Available Balance: ₹" + balance);
    }

    public static void showMenu() {
        System.out.println("\n===== ATM MACHINE =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Mini Statement");
        System.out.println("5. Exit");
        System.out.print("Enter Your Choice: ");
    }

    public static void main(String[] args) {

        int choice;

        do {
            showMenu();

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    miniStatement();
                    break;

                case 5:
                    System.out.println("Thank You For Using ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}