package encapsulation;

public class BankAccount {

 private long accountNumber;
 private double balance;
 
 public void setaccountNumber( long number) {
	 
	 this.accountNumber = number;
	 
 }
 
 public void setbalance(double balance) {
	 
	 this.balance = balance;
	 
 }
 
 public long setaccountnumber() {
	return accountNumber;
	
 }
 
 public double setbalance() {
	return accountNumber;
 }

	public static void main(String[] args) {
		
		
		BankAccount obj = new BankAccount();
		
		obj.setaccountNumber(123456789);
		obj.setbalance(50000);
		
		System.out.println("AccountNumber : " + obj.accountNumber);
		System.out.println("Balance : " + obj.balance);
		
	}
}