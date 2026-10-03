import java.util.*;
import java.io.*;

// Base class
class Account {
    protected int accno;
    protected String name;
    protected double balance;
    
    public Account(int accNo, String name, double balance) {
        this.accNO = accno;
        this.name = name;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited successfully!");
    }
    
    public void display() {
        System.out.println("Account No: " + accno);
        System.out.println("name: " + name);
        System.out.printl("balance: " + balance);
    }
}

// derived class (inheritance + polymorphism)
class savingAccount extends Account {
    
    public savingAccount(int accno, String name, double balance) {
        super(accNo, name, balance);
    }
    
    // method overriding (polymorphism)
    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("withdrawl successful!");
        } else {
            System.out.println("insufficient balance!");
        }
    }
}

// main class
public class BankSystem {
    
    static Arraylist<SavingsAccount> accounts = new Arraylist<>();
    static scanner sc = new scanner(System.in);
    
    public static void createAccount() {
        try {
            System.out.print("Enter Account number: ");
            int accNo = sc.nextint();
            sc.nextline();
            
            System.out.print("Enter name: ");
            string name = sc.nextline();
            
            System.out.print("Enter initial balance: ");
            double bal = sc.nextdouble();
            
            accounts.add(new SavingsAccount(accNo, name, bal));
            System.out.println("Account created Successfully!");
        }  catch (Exception e) {
            System.out.println("invalid input!");
        }
    }
    
    public static SavingAccount findAccount(int accNo); {
        for(savingsAccount acc: accounts) {
            if(acc.accno == accno)
            return acc;
        }
        return null;
    }
    
    public static void deposit() {
        System.out.prit("Enter Account number: ");
        int accno = sc.nextint();
        
        SavingAccount acc = findaccount(accno);
        if(acc != null) {
            System.out.print("Enter amount: ");
            double amt = sc.nextDouble();
            acc.deposit(amt);
        } else {
            System.out.println("Account not found!");
        }
    }
    
    public static void withdraw() {
        System.out.print("Enter Account number: ");
        int accNO = sc.nextint();
        
        SavingsAccount acc = findAccount(accNO);
        if(acc != null) {
            System.out.print("Enter amount: ");
            double amt = sc.nextdouble();
            acc.withdraw(amt);
        } else {
            System.out.println("Account not found!");
        }
    }
    public static void displayAccount() {
        System.out.print("Enter Account number: ");
        int accNo = sc.nextInt();
        SavingAccount acc = findAccount(accNo);
        if(acc != null) {
            acc.display();
        } else {
            System.out.println("Account not found!");
        }
    }
    
    //  file handling 
    public static void saveTofile() {
        try {
            filewriter fw = new filewriter("account.txt");
            for(SavingaAccount acc : accounts) {
        fw.write(acc.accNo + "," +acc.name +","+acc.balance +"\n");
            }
            fw.close();
            System.out.println("Data Saved successfully!");
        } catch(IoException e) {
            System.out.println("Erro Saving  file!");
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
      } catch(Exception e)
      {
          System.out.pritln("Error loading file");
      }
}

public static void main(String[] args) {
    loadFromFile();
    
    int choice;
    do {
        System.out.println("\n--- BANK MENU ---");
        System.out.println("1.creat account");
        System.out.println("2.deposit");
        System.out.println("3.withdraw");
        System.out.println("4.display");
        System.out.println("5.dave to file");
        System.out.println("6.Exit");
        
        System.out.print("Enter choice: ");
        choice = sc.nextint();
        
        switch(choice) {
            case 1:
                createAccount();
                break;
                case 2:
                    deposit();
                    break;
                    case 3:
                        withdraw();
                        break;
                        case 4:
                            displayAccount();
                            break;
                            case 5:
                                saveTofile();
                                break;
                                case 6:
                                    System.out.println("thank you!");
                                    break;
                                    default:
                            System.out.println("invalid choice!");
        }
    } while (choice != 6);
}
}

