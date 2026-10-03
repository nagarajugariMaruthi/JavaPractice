package javaBankingproject;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num = 180773;
    int reverse = 0;
    while(num!=0) {
    int digit = num % 10; // get last digit 
    reverse = reverse * 10 +digit; // build reverse
    num = num / 10; // remove the last digit 
    }
    System.out.println("reversed number: " + reverse);
	}
}