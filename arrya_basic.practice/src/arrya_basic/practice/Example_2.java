package arrya_basic.practice;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] array = {50,60,70,80,90};
   
   int temp = 0;
   
   for (int i = 0; i < array.length; i++) {
	
	   for (int j = i + i; j < array.length; j++) {
		
		   if(array[i] > array[j]) {
			   
			   temp = array[i];
			   array[i] = array[j];
			   array[i] = temp;
		   }
	   }
   }
   System.out.println("Decending order");
   for (int i = 0; i < array.length; i++) {
     System.out.println(array[i] + " ");
}
	}
}