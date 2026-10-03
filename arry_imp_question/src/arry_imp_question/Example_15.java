package arry_imp_question;

public class Example_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Move All Zeros to the Beginning of an Array.
		
   int[] arr = {0,0,0,0,10,20,30,40,50};
   
     int index = arr.length-1;
     
     for (int i = arr.length - 1; i >= 0;  i--) {
		 
    	 // travel from right to left 
    	 if(arr[i] !=0) {
    		 arr[index] = arr[i];
    		 index--;
    	 }
     }
     // fill the remaing position wit zero
    		 
    		 while(index >=0) {
    			 arr[index] = 0;
    			 index--;
    		 }
    		 
    		 // print the arry 
    		 for (int i = 0; i < arr.length; i++) {
				
    			 System.out.println(arr[i] + " ");
    		 }
    	 }
     }
	