package arry_imp_question;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingProject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Banking_Project> accounts = new ArrayList<>();

        Banking_Project account =
                new Banking_Project(1001, "Maruthi", 50000);

        accounts.add(account);

        while (true) {

            System.out.println("\n========= BANKING SYSTEM =========");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            try {

                switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    account.DepositeAmount(deposit);
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();
                    account.WithdraAmount(withdraw);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.displayDetailes();
                    break;

                case 5:
                    System.out.println("Thank you for using Banking System.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
                }

            } catch (Exception e) {

                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine();
            }
        }
    }
}