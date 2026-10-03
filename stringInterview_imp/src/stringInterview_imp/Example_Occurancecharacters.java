package stringInterview_imp;
import java.util.HashMap;
import java.util.Scanner;

public class Example_Occurancecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 19. How to count occurrences of each character in a string? 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine().toLowerCase();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) { 	 
		char ch = str.charAt(0);
		
		if(ch != ' ') {
		  map.put(ch,map.getOrDefault(ch, 0) + 1);
		  
		} 
	}


	
	 System.out.println("Character Occurrences:");

     for (Character key : map.keySet()) {
         System.out.println(key + " = " + map.get(key));
     }
     
     sc.close();
 }
}
