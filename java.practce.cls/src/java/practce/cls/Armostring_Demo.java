package java.practce.cls;

public class Armostring_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int number = 407;
		        int temp = number;
		        int sum = 0;

		        while (temp > 0) {
		            int rem = temp % 10;
		            sum = sum + (rem * rem * rem);
		            temp = temp / 10;
		        }

		        if (number == sum) {
		            System.out.println("Number is an Armstrong number");
		        } else {
		            System.out.println("Number is not an Armstrong number");
		        }
		    }
}