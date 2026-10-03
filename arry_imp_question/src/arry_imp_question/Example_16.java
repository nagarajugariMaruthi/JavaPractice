package arry_imp_question;

public class Example_16 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//Separate Even and Odd Elements into Two Arrays.
  int[] arr = {10,20,30,25,35,45};
  
  int[] even = new int[arr.length];
  int[] odd = new int[arr.length];
  
  int EvenIndex = 0;
  int oddIndex = 0;
  
  for (int i = 0; i < arr.length; i++) {
	
	if(arr[i] % 2 == 0)  {
		
		even[EvenIndex] = arr[i];
		  EvenIndex++;
	}
	else {
		odd[oddIndex] = arr[i];
		oddIndex++;
	}	
	System.out.println();
	}
	System.out.println("print the Even number : ");
	for(int i = 0; i < EvenIndex; i++) {
		System.out.println(even[i] + "");
	}
		System.out.println("print the odd number: ");
		for (int i = 0; i < oddIndex; i++) {
			System.out.println(odd[i] + "");
		}
	}
	}
