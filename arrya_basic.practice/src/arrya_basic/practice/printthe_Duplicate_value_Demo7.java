package arrya_basic.practice;

public class printthe_Duplicate_value_Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] array = {10,20,20,30,40,50,60,70,60};
   
   System.out.println("Enter the duplicate array");
   
   for (int i = 0; i < array.length; i++) {
	
	   for (int j = i + 1; j < array.length; j++) {
	   
		   if (array[i] == array[j]) {
	 System.out.println(array[i]);
		   }
   }
	}
	}
}