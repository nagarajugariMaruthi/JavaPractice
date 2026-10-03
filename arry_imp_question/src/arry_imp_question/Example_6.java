package arry_imp_question;

public class Example_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Find the Average of All Elements in an Array.
		
		int[] arr = {10,20,30,40,50,60,10};
		
		int sum = 0;
		
		
		for (int i = 1; i < arr.length; i++) {
		 
			sum = sum + arr[i];
		}
			double avarage = (double) sum / arr.length;
	
			
			System.out.println("find the avarage length = " + avarage);
		}
}
