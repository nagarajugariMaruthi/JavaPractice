package advanced_level_program;

import java.util.Scanner;

public class Example_3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
  //  Write a program to find the first non-repeated character in a string.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the senatance: ");
		String str = sc.nextLine();
		
		// convert the lowercase 
		str = str.toLowerCase();
		
		boolean found  = false;
		
		for (int i = 0; i < str .length(); i++) {
			
			char ch =  str.charAt(i);
			
	    if(ch == ' ') {
	    	continue; // continuew ingnorspace
	    	
	    
	    }
		
		
	    int count = 0;
	    
	    for (int j = 0; j < str.length(); j++) {
	    	
	    	if(ch == str.charAt(j)) {
	    		count++;
	    	}
	    
	    }
	    if(count == 1) {
	    	System.out.println("Frist non reapted character " + ch);
	    	found = true;
	    	break;
	    }
		}
	    	if(!found) {
	    		System.out.println("Non repeated character found");
	    	}
	    
	    sc.close();
		}
	}
	
	