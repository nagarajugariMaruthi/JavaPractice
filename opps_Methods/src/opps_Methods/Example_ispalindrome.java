package opps_Methods;

public class Example_ispalindrome {

  public void Example_ispalindrome(int num) {
	  
	  int reverse = 0;
	  int temp = num;
	  
	  while(num !=0) {
		  
		  int rem = num % 10;
		  
		  reverse = reverse  *10 + rem;
		  
		  num = num / 10;
	  }
	  
	   if(temp == reverse) {
		   System.out.println(temp + " is palindrome");
	   } else {
		   System.out.println(temp + " is not palindrome");
	   }
  }
  
  public static void main(String[] args) {
	  
	  Example_ispalindrome obj = new Example_ispalindrome();
	  
	  
	  obj.Example_ispalindrome(121);
	  obj.Example_ispalindrome(123);
	  obj.Example_ispalindrome(1221);
	  obj.Example_ispalindrome(153);
  }
}
	 