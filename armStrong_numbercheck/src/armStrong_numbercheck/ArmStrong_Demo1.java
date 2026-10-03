package armStrong_numbercheck;

public class ArmStrong_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int number = 153;
     int temp = 0;
     int sum = 0;
     
     while(temp > 0) {
    	  int rem = temp % 10;
    	  
    	  sum = sum +(rem* rem* rem);
    	  temp = temp / 10;
     }
     if(number > sum) {
    	 System.out.println("is the armstrong number: " + number);
     } else {
    	 System.out.println("is the armstrong number: " + number);
     }
	}
}