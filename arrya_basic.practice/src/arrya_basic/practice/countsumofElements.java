package arrya_basic.practice;

public class countsumofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] number = {20,30,40,50,60,70,56,23};
    
     int sum = 0;
     
     for (int i = 0; i < number.length; i++) {
		 
    	   sum = sum + number[i];
     }
     System.out.println("count the sum of value = " + sum);
		
	}
}