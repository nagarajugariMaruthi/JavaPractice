package arrya_basic.practice;

public class Findthemin_valuearray_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] number = {12,2,24,35,35,46,46,56,};
    
    int min = number [0];
    
    for (int i = 1; i < number.length; i++) {
		
    	    if (number[i] < min) {
    	        min = number[i];
    	    }
    }
    	    System.out.println("Enter the min value = " + min);
	}
}