package arrya_basic.practice;

public class Maximum_ElementsArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[]  number = {10,20,80,30,50,60};
	
		int max = number[0];
		
		  for (int num : number) {
			  if(num > max) {
				  max = num;
			  }
		  }
		  System.out.println("maximum of the array = "+max);
		  }
}
