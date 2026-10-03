package arrya_basic.practice;

import java.util.Iterator;

public class NestedforLoopArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int[] arry = {40,10,30,50,60};
    
  
	// sort the array
    for (int i = 0; i<arry.length -1; i++) {
    	for(int  j = i + 1; j<arry.length; j++) {
    		
    		if(arry[i] > arry[j]) {
    			// swap array i 
    			int temp = arry[i];
    			arry[i] = arry[j];
    			arry[j] = temp;
    		}
    	}
    }
    // print the sorted the array 
    
    System.out.println("arry in Acending order");
    
    for(int i = 0; i < arry.length; i++) {
    	System.out.println(arry[i] +  " ");
    }
	}
}
