package arrya_basic.practice;

public class SumArrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int[] array = {10,20,30,40,50,60};
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			 
			sum += array[i];
		}
		
		System.out.println("sumarray = " + sum);
	}
}