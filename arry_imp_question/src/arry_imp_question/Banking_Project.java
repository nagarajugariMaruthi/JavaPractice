package arry_imp_question;

import java.util.ArrayList;
import java.util.Scanner;

public class Banking_Project {
	
	private int AccountNumber;
	private String AccountName;
	private double balance;
	
	public Banking_Project(int AccountNumber, String AccountName, double balance) {
		
		this.AccountNumber = AccountNumber;
		this.AccountName = AccountName;
		this.balance = balance;
	}
	
	public void DepositeAmount(double amount) {
		 
		if(amount > 0) {
			balance = balance + amount;
		System.out.println("Ammount Deposite Succuces Fully ");
		}
		System.out.println("Invalid amount");
	}


 public void WithdraAmount(double amount) {
	 
	 if(amount > 0 && amount <= amount) {
		 balance = balance - amount;
		 System.out.println("Amount withdra Succucess fully ");
	 }  else {
		 System.out.println("insfient balance or invalid amount. ");
	 }
 }
 
  public void  checkBalance() {
	  System.out.println("Current Balance :" + balance);
  }
  
  public  void displayDetailes() {
  System.out.println("Account Number : " +  AccountNumber);
  System.out.println("Account Holder Name : " + AccountName);
  System.out.println("Account Balance : " + balance);
}
}
 