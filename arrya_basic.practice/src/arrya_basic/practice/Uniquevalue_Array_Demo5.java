package arrya_basic.practice;

public class Uniquevalue_Array_Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int[] number = {10,20,30,40,50,60};
		
		System.out.println("Unique value are" );
		
		for (int i = 0; i < number.length; i++) {
		
			int count = 0;
			
			for (int j = 0; j < number.length; j++) {
			 
				if(number[i] == number[j]) {
					count++;
				}
					if(count == 1) {
						System.out.println(number[i]);
					}
			}
		}
	}
}
	