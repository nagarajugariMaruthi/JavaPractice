package demo1;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number = 18077;
    int reverse = 0;
       
    while(number != 0) {
    	int digit = number % 10;  // get last digit
         reverse = reverse *10+digit;
         number = number /10; // remove the digit 
    }
    System.out.println("reversed number: " + reverse);
	}
}
