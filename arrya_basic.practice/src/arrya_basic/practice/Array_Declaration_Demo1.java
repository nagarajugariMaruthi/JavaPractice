package arrya_basic.practice;

public class Array_Declaration_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Array declaration
		        int[] arr = new int[5];
		        
		        // assign values
		        
		        arr[0] = 10;
		        arr[1] = 20;
		        arr[2] = 30;
		        arr[3] = 40;
		        arr[4] = 50;
		        
		        // print array elements
		        System.out.println("Array Elements: ");;
		        
		        for(int i = 0; i < arr.length; i++) {
		            System.out.println(arr[i]);
		        }
		    }
		}