package arrya_basic.practice;

public class EvenoraddnumberArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 int[] number={10,15,35,40,25,80};
	 
	 System.out.println("Even Number: ");
	for (int num : number) {
		if(num % 2 == 0) {
			System.out.println(num);
		}
	}
		System.out.println("odd Number");
		for (int num : number) {
			if(num % 2 != 0) {
				System.out.println(num);
			}
		}
	}
	}
