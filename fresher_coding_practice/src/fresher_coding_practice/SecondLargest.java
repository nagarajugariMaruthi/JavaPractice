package fresher_coding_practice;


public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Find the second largest number in an array.**
		//   Example: `{10, 25, 5, 40, 30}` → `30`
		
		int[] arr = {10,20,5,40,30};
		
		int Largest = Integer.MIN_VALUE;
		int SecondLargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > Largest) {
				SecondLargest = Largest;
				  Largest = arr[i];
			}
			else if(arr[i] > SecondLargest && arr[i] != Largest) {
				
				SecondLargest = arr[i];
			}
		}
			
			System.out.println("Largest Number : " + Largest);
			System.out.println("Second Largest Number : " + SecondLargest);
		}
	}
			