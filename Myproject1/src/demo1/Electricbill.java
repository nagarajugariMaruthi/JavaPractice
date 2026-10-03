package demo1;

public class Electricbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int unites;
     int bill = 0;
    
     
     Scanner sc = new Scanner();
     
     
     // input 
     System.out.println("Enter units consumed: ");
     unites = sc.nextInt();
     
     // bill calucalation slub wise 
     if(unites >= 100) {
    	 bill = unites *10;
     } else if (unites >= 200) {
    	 bill = (100 *1)+(unites -200) +2;
     } else {
    	   bill = (100 * 1) + (100 * 2) + (unites - 200) * 3;
     }

     // Output
     System.out.println("Electricity Bill = ₹" + bill);

 }
}
