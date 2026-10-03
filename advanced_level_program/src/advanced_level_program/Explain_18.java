package advanced_level_program;
import java.util.Scanner;
public class Explain_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String sentance = sc.nextLine();
		
		
		String[] word = sentance.split(" ");
		
		String result = "";
	 
		for(String words : word) {
			
			if(words.length() > 0) {
				
				result =  result 
						+Character.toUpperCase(words.charAt(0))
						 + words.substring(1).toLowerCase()
	                        + " ";
			}
		}
		
		System.out.println("Captaliza sentance ");
		System.out.println(result.trim()); 
	
		sc.close();
	}
}