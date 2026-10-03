package arrya_basic.practice;

import java.util.Iterator;

public class SumofarraSecond2 {

	public static void main(String[] args) {
		
	
  int [] arr = {12,3,4,1,66,77,6};
   
  int smallest = arr [0];
  
  for (int i = 0; i < arr.length; i++) {
	    
	  if (arr[i] < smallest) {
          smallest = arr[i];
	  }
  }
	  
	  System.out.println("Smallest array =" + smallest);
  }
	}
