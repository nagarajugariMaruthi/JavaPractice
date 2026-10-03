package java_imp_Question_practice25;
import java.util.Scanner;
public class Count_Digit {

  public static void main (String [] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the number");
	  int num = sc.nextInt();
      
	  int count = 0; 
	  int temp = Math.abs(num); 
	  
	  if(temp == 0) {
		  count = 1;
	  
	  } else {
		  while(temp > 0) {
			  temp = temp / 10;
			  count++;
		  }
	  }
	  
		  System.out.println("count the  number = " + count);
	  }
  }
