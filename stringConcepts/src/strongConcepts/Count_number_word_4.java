package strongConcepts;

import java.util.Scanner;

public class Count_number_word_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the String");
		 String  sentance = sc.nextLine().trim();
		 
		 if(sentance.isEmpty()) {
			 
			 System.out.println("Word count : 0");
			 
		 } else {
			 
			 String[] word = sentance.split("\\s+");
			 
			 System.out.println("word length " +word.length);
			 
		 }
		 sc.close();
	}
}
