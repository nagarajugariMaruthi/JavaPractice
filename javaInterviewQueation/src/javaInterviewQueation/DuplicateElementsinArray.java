package javaInterviewQueation;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,50,60,70,10,20,30};
		
		  Set<Integer> set = new HashSet<>();
	
		  
		  System.out.println("Duplicate Elements : ");
	
		  
		  for(int num : arr) {
			  
			  if(!set.add(num)) {
				  System.out.println(num);
			  }
		  }
	}
}