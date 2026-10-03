package arrya_basic.practice;

public class SumoffArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] number = {10,20,30,40,50,60};
	
	int sum = 0;
	
  // caluculate the using for each loop
	
	  for (int num : number) {
		sum = num + sum;
	  }
	
	System.out.println("Enter the sum of array:" + sum);
}
}