package advanced_level_program;

import java.util.Scanner;
public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to find duplicate words in a string.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentance ");
		String str = sc.nextLine();
		
		//to Convert to lowevercase 
		str = str.toLowerCase();
		
		String[] word = str.split("\\s+");
		
		System.out.println("Duplicate word Arry ");
		
		for (int i = 0; i < word.length; i++) {
		 
			if(word[i].equals("*")) {
				continue;
			}
			
			int count = 1;
			
			for (int j = i+1; j < word.length; j++) {
				
				if(word[i].equals(word[j])) {
					count++;
					word[j] = "*";  // marks visited
				}
			}
			if(count > 1) {
				System.out.println(word[i] + " = " + count);
			}
		}
				sc.close();
			}
		}
	