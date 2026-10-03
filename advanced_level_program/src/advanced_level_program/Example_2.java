package advanced_level_program;

import java.util.Scanner;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  // Write a program to remove duplicate words from a sentence.
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the seantance");
		String str = sc.nextLine();
		
		// to convert the lowercase 
		str = str.toLowerCase();
		
		// convet the split 
		String[] word = str.split("\\s+");
		
		// marks duplicate words 
		for (int i = 0; i < word.length; i++) {
			
			if(word[i].equals("*")) {
				continue;
			}
			
			for (int j = i+1; j < word.length; j++) {
				
				if(word[i].equals(word[j])) {
					word[j] = "*"; // word duplicate 
				}
			}
		}
		// print the duplicate without duplicate 
		
		System.out.println("Sentance After removening the Duplicate words");
		
	  for (int i = 0; i < word.length; i++) {
		  
		  if(!word[i].equals("*")) {
			  
			  System.out.println(word[i] + " ");
		  }
	  }
		 sc.close();
		 
	}
}