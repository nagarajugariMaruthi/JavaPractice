package arry_imp_question;

public class Example_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Find All Pairs Whose Sum is Equal to a Given Number.
		
		int[] arr = {10,20,30,40,50,60};
		
		int sum = 70;
		
		for (int i = 0; i < arr.length - 1; i++) {
			
		for (int j = i +1; j < arr.length; j++) {
			
		if(arr[i] + arr[j]  == sum) {
			
			System.out.println(arr[i]+ " + " + arr[j] + " = " +sum);
		}
		}
		}
	}
}