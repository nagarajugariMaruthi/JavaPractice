package strongConcepts;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Example_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String[] words = sc.nextLine().toLowerCase().split("\\s+");
		
		
		Set<String> seen = new HashSet<>();
		Set<String> duplicate = new HashSet<>();
		
		for (String w : words) {
			
			if(!seen.add(w)) duplicate.add(w);
			
		}
		
		System.out.println("Duplicate words : " + duplicate);
		
		sc.close();
	}
}
	