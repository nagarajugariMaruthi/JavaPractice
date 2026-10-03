package string_intermidaite_question;
import java.util.Scanner;
public class Example_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the characater : ");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			 
			char ch = str.charAt(i);
			int count = 1;
			if(ch == '0') {
				continue;
			}
	for (int j = i+1; j < str.length(); j++) {
		
	  if(ch == str.charAt(j)) {
		  count++;
		  
		  // duplicate array characater 
		  
		  str = str.substring(0,j) + '0' + str.substring(j+1);
	  }
	}
	System.out.println(ch + " == "+count);
		}
		
		sc.close();
	}
}
	 