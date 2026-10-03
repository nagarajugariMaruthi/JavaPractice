package arrya_basic.practice;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int arr[] = {1,2,3,5,6,7,8,8,9,};
		
		System.out.println("Reverse Array");
		
		for(int i = arr.length -1; i>=1; i--) {
			System.out.println(arr[i] +" ");
		}
	}
}