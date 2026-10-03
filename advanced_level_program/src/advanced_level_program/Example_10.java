package advanced_level_program;

import java.util.HashMap;
import java.util.Scanner;
public class Example_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Write a program to find the occurrence of each word in a sentence.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sentance ");
		String sentance = sc.nextLine();
		
		// convert the lowercase sensitive case insensitive counting
		
		sentance = sentance.toLowerCase();
		
		// spilit sentance into the word
		
		String[] word = sentance.split("\\s+");
		
		// store word frequency 
		
		HashMap<String, Integer> Map = new HashMap<>();
		
		for (String words : word) {
			
				if (Map.containsKey(words)) {
					Map.put(words, Map.get(words) + 1); 
				
			} else {
				Map.put(words, 1);
			}
		}
		
		System.out.println("\nnew Word occurance");
		
		for (String words : Map.keySet()) {
			System.out.println(words + " : " + Map.get(words));
		}
		sc.close();
	}
}
