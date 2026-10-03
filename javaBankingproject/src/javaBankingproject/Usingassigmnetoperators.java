package javaBankingproject;

public class Usingassigmnetoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num = 180773;
  int reverse = 0;
  while (num !=0) {
	  int digit = num % 10; // get last digit (*=)
	  reverse *= 10; // Assignment operator (+=)
	  reverse += digit; // Assignment operators (/=)
	  num /=10; 
  }
  System.out.println("reversed number:"+ reverse);
  
  }
	}
