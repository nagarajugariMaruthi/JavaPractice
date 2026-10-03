package arrya_basic.practice;

public class ArrayAcending_Order_Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] array = {100,80,90,70,50,60,40,30,10,20};
   
     int temp;
     
     for (int i = 0; i < array.length; i++) {
		
    	 for (int j = i + 1; j < array.length; j++) {
			
    		 if (array[i] > array[j]) {
    			 
    			 temp = array[i];
    			 array[i] = array[j];
    			 array[j] = temp;
    		 }
    	 }
     }
     System.out.println("Array in acending order");
     
     for (int j = 0; j < array.length; j++) {
     System.out.println(array[j] + " ");
	}
}
}

    			