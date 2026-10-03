package encapsulation;

public class Bank {

	private long BankAccountNumber;
	private double BannkBalance;
	
	public void SetbanckAccountNumber(long BanckAccountNumber) {
		
		this.BankAccountNumber = BanckAccountNumber;
		
	}
	
	public void SetbanckAccountNumber(double BanckAccountBalance) {
		
		this.BannkBalance = BanckAccountBalance;
		
	}
	
	
     public long getbanckAccountNumber() {
    	 
    	 return BankAccountNumber;
    	 
     }
     
     public double getbanckBalance() {
    	 
    	 return BannkBalance;
     
     }
     
     public static void main(String[] args) {
    	 
    	  Bank obj = new Bank();
    	  
      obj.SetbanckAccountNumber(630013669);
      obj.SetbanckAccountNumber(50000);
      
      System.out.println("Account Number : " + obj.getbanckAccountNumber());
      System.out.println("Account Balance : " + obj.getbanckBalance());
     }
}
      