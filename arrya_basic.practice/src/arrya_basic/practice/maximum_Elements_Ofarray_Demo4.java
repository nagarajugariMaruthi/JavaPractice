package arrya_basic.practice;

public class maximum_Elements_Ofarray_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] number = {100,202,44,55,88,99,56};
   
     int max = number[0];
     
     for (int i = 1; i < number.length; i++) {
    	 
    	   if(number[i] > max) {
    		   max = number[i];
    	   }
     }
    	   System.out.println("Enter the maximum number = " + max);
    	   }
	}
