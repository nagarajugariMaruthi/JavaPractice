package switchcase_practice_Basics;

import java.util.Scanner;

public class Class_ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0;

        while (true) {

            System.out.println("\n======= ATM MENU =======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.println("Current Balance: ₹" + balance);
                break;

            case 2:
                System.out.print("Enter Deposit Amount: ₹");
                double deposit = sc.nextDouble();

                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Amount Deposited Successfully.");
                    System.out.println("Updated Balance: ₹" + balance);
                } else {
                    System.out.println("Invalid Deposit Amount.");
                }
                break;

            case 3:
                System.out.print("Enter Withdrawal Amount: ₹");
                double withdraw = sc.nextDouble();

                if (withdraw <= balance && withdraw > 0) {
                    balance -= withdraw;
                    System.out.println("Please Collect Your Cash.");
                    System.out.println("Remaining Balance: ₹" + balance);
                } else {
                    System.out.println("Insufficient Balance or Invalid Amount.");
                }
                break;

            case 4:
                System.out.println("Thank You for Using the ATM.");
                sc.close();
                return;

            default:
                System.out.println("Invalid Choice. Please Try Again.");
            }
        }
    }
}