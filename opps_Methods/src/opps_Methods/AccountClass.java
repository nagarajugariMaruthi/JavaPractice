package opps_Methods;

public class AccountClass {

	//accountNumber`
	//* `accountHolderName`
	//* `balance`
	
	String AccountName;
	long AccountNumber;
	int AccountBalance;
	
	AccountClass() {
		 
		AccountName = "Maruthi";
		AccountNumber = 63001266872l;
		AccountBalance = 59999;
	}
	
	AccountClass(String AccountName, long AccountNumber, int AccountBalance) {
		
	 this.AccountName = AccountName;
	 this.AccountNumber = AccountNumber;
	 this.AccountBalance = AccountBalance;
	 
	}
	
	void printdate() {
		
		System.out.println("Account Name : " + AccountName);
		System.out.println("Account Number : " + AccountNumber);
		System.out.println("Account Balance : " + AccountBalance);
	}
	
	public static void main(String[] args) {
		
		AccountClass Emp1 = new AccountClass();
		
		
		Emp1.printdate();
		}
}
