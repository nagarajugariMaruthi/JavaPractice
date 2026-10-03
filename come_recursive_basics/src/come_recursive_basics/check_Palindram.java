package come_recursive_basics;
import java.util.Scanner;  
public class check_Palindram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentance");
		String Sentance = sc.nextLine();
		
		String original = Sentance.replaceAll("[^a-zA-Z0-9", "").toLowerCase();
		 
		String revers = "";
		
		  for (int i = original.length() - 1; i >= 0; i--) {
			  revers += original.charAt(i);
		  }
		  if(original.equals(revers)) {
			  System.out.println("the sentance is palindram");
		  } else {
			  System.out.println("the sentacne is not palindram");
		  }
		  sc.close();
	}
}
