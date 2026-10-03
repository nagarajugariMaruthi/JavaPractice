package arrya_basic.practice;

public class Decendingorder_array_Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] array = {100,90,70,80,60,50,30,40,20,10};
   
   int temp;
   
   for (int i = 0; i < array.length; i++) {
	
	   for (int j = i + 1; j < array.length; j++) {
		
		   if (array[i] < array[j]) {
			   
			   temp = array[i];
			   array[i] = array[j];
			   array[j] = temp;
		   }
	   }
   }
   System.out.println("print the decending order");
     
   for (int j = 0; j < array.length; j++) {
		   
	   System.out.println(array[j]);
   }
	}
}