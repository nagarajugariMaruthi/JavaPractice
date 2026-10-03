package arrya_basic.practice;

public class FindlargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] array = {10,20,30,50,60,88};
   
     int max = array[0];
     
      for (int i = 1; i < array.length; i++) {
		
    	  if(array[i] > max) {
    		  max = array[i];
    	  }
      }
    	System.out.println("find the largest array = " + max);
	}
}

