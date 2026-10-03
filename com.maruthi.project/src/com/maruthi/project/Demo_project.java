package com.maruthi.project;

public class Demo_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Account {
			    int accountNumber;
			    String name;
			    double balance;
			    
			    Account(int accountNumber, String name, double balance) {
			        this.accountNumber = accountNumber;
			        this.name = name; 
			        this.balance = balance;
			    }
			    
			    void deposit(double amount) {
			        balance += amount;
			        System.out.println("Amount Deposited Successfully.");
			    }
			    
			    void withdram(double amount) {
			        if(amount <= balance) {
			            balance -= amount;
			            System.out.println("Amount withdraw successfully.");
			        } else {
			            System.out.println("insufficient balance.");
			        }
			    }
			    
			     void display() {
			         System.out.println("Account number: " + accountNumber);
			         System.out.println("Name: " + name);
			         System.out.println("balance: " + balance);
			     }
			}
	}
}