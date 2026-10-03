package come_recursive_basics;

public class Palindrome_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     int number = 121;
     int originalnumber = number;
     int reverse  = 0;
  
     while(number > 0) {
    	 int temp = number % 10;
    	 reverse = reverse  * 10 + temp;
    	 number = number /10;
     }
     if(originalnumber == reverse) {
    	 System.out.println("is the palindrome number");
     } else {
    	 System.out.println("not palindrome number");
     }
	}
     }
     