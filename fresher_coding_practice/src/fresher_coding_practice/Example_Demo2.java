package fresher_coding_practice;

public class Example_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int num = 212;
		int temp = num;
		int rev = 0;
		
		while(num != 0) {
			int digit = num % 10;
			rev  = rev * 10 + digit;
			num /= 10;
		}
		if(temp == rev) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrome");
		}
	}
}