package opps_Methods;

public class BankAccount {

   String EmpBankAccountHolderNAme;
   double EmpAccountNumber;
   double EmpAccountBalance;
   
 void takeinput(String l_EmpBankAccountHolderNAMe, String string,double l_EmpAccountBalance) {
	   
	   
	   EmpBankAccountHolderNAme = l_EmpBankAccountHolderNAMe;
	    EmpAccountNumber = 
	    EmpAccountBalance = l_EmpAccountBalance;
	    
   }
   
   void printdate() {
	   
	   System.out.println("BanckHolderName :" +  EmpBankAccountHolderNAme);
	   System.out.println("EmpAccountNumber : " + EmpAccountNumber);
	   System.out.println("	 BankBAlance : "+   EmpAccountBalance);
	   
   }
   
   public static void main(String[] args) {
	   
	   BankAccount Emp1 = new BankAccount();
	   Emp1.takeinput("Dhanvitha" , "63001300879" , 59999);
	   Emp1.printdate();
   }

}