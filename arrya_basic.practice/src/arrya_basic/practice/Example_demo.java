package arrya_basic.practice;

public class Example_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int[] arr = {12,30,40,50,60,90};
		 
		int larget = 0;
		for (int i = 0; i < arr.length; i++) {
					
			if(arr[i] > larget) {
				larget = arr[i];
			}
			}
			System.out.println("Largest arra = " +larget);
	}
}
