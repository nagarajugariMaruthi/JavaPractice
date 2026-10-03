package arrya_basic.practice;

import java.util.Iterator;

public class ArrayElements_inreverse_orderDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int[] array = {10,20,30,40,50,60,70,80};
    System.out.println("Array Elements in reverse order = " );
    for (int i = array.length - 1; i >= 0; i--) {
    	
    	System.out.println(array[i] + " ");
    }
	}
}