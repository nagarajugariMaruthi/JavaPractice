package arrya_basic.practice;

public class Sum_off_ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // sum off declaration 
		
		int[] arr = {10,20,30,40,50,50};
		
		// varibale to store
		
		int sum = 0;
		
		//find sum off array Elements
		for(int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
			
		}
		// print sum
		System.out.println("Enter sum of arrayElements: " +sum);
		}
}
