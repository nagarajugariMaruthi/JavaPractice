package switchcase_practice_Basics;

 import java.util.Scanner;
 
public class Example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the 1 to 12 months = ");
		 int month = sc.nextInt();
		 
		 switch(month) {
		 case 1:
			 System.out.println("JANUARY");
			 break;
			 
		 case 2:
			 System.out.println("FIBRAUVARY");
			 break;
			 
		 case 3:
			 System.out.println("MARCHI");
			 break;
			 
		 case 4:
			 System.out.println("APRIL");
			 break;
			 
		 case 5:
			 System.out.println("MAY");
			 break;
			 
		 case 6:
			 System.out.println("JUNE");
			 break;
			 
		 case 7:
			 System.out.println("JULY");
			 break;
			 
		 case 8:
			 System.out.println("AGAUST");
			 break;
			 
		 case 9:
			 System.out.println("SEPTAMBAR");
			 break;
			 
		 case 10:
			 System.out.println("OCTOBAR");
			 break;
			 
		 case 11:
			 System.out.println("NOVAMBAR");
			 break;
			 
		 case 12:
			 System.out.println("DECEMBAR");
			 break;
			 
			default:
				System.out.println("Invalid month");
		 }
		 sc.close();
	}
}
