package arrya_basic.practice;

public class Exmple_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] array = {1,2,3,4,5,5,6,7,6,8,9,8};
   
   System.out.println("unique value in the array ");
   
   for (int i = 0; i < array.length; i++) {
	
	   int count = 0;
	   
	   for (int j = 0; j < array.length; j++) {
	   
		   if (array[i] == array[j]) {
               count++;
           }
   }
   if(count == 1) {
       System.out.println(array[i]);
   }
}
}
}