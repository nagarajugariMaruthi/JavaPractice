package switchcase_practice_Basics;

public class Switchcase_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int sum = 15;
		int sum2 = 20;
		int  a = sum + sum2;
		switch(1) {
		case 1:
		System.out.println("Enter the sum value = "+ a);
		break;
		case 2:
			System.out.println("Enter the sum second value = "+ a);
			break;
		default:
			System.out.println("invalid");
		}
	}
}
