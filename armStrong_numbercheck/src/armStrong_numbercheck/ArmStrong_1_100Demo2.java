package armStrong_numbercheck;

public class ArmStrong_1_100Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 for(int number = 1; number <=100; number++) {
		 int temp = number;
		 int sum = 0;
		 
		 while(temp  > 0) {
			 int  rem = temp % 10;
			 sum = sum+(rem* rem* rem);
			 temp = temp/10;
		 }
		 if(number == sum) {
			 System.out.println(number);
		 }
	 }
	}
}
	