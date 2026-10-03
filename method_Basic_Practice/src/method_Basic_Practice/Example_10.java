package method_Basic_Practice;

public class Example_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array declaration using new keyword 
		
   int[][] arr = new int[3][3];
   
   arr[0][0] = 10;
   arr[0][1] = 20;
   arr[0][2] = 30;
   
   arr[1][0] = 40;
   arr[1][1] = 50;
   arr[1][2] = 60;
   
   arr[2][0] = 70;
   arr[2][1] = 80;
   arr[2][2] = 90;
   
   int sum = 0;
   System.out.println("Array Elements " );
	
   for (int i = 0; i < arr.length; i++) {
	
	   for (int j = 0; j < arr[i].length; j++) {
		   
		  System.out.println(arr[i][j] + " ");
	         sum = sum + arr[i][j];  
	   }
		   
	   System.out.println();
   }	
	System.out.println("Enter the All sum = "+sum);
	}
}
