package arry_imp_question;

public class Example_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int[] arr = {10,20,0,30,0,40,50,0};
		
		
		int index = 0;
		
			for (int i = 0; i < arr.length; i++) {
		// fill the remaining position 
			if(arr[i] !=0) {
				arr[index] = arr[i];
				index++;
			}
			}
			// fill the modefiey arry 
			while(index < arr.length) {
				arr[index] = 0;
				index++;
			}
			
			for (int i = 0; i < arr.length; i++) {
			    System.out.print(arr[i] + " ");
			}
			}
}